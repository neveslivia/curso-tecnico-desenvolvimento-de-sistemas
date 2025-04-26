import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo .csv: "); String filePath = sc.nextLine();

        Path sourcePath = Paths.get(filePath);
        Path outputDirectory = sourcePath.getParent().resolve("out");
        Path outputPath = outputDirectory.resolve("summary.csv");

        try {
            if (!Files.exists(outputDirectory)) {
                Files.createDirectories(outputDirectory);
            }

            List<String> summaryLines = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(",");
                    if (fields.length == 3) {
                        String name = fields[0];
                        double price = Double.parseDouble(fields[1]);
                        int quantity = Integer.parseInt(fields[2]);
                        double total = price * quantity;
                        summaryLines.add(name + "," + String.format("%.2f", total));
                    }
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath.toString()))) {
                for (String summaryLine : summaryLines) {
                    bw.write(summaryLine);
                    bw.newLine();
                }
            }

            System.out.println("Arquivo 'summary.csv' gerado em: " + outputPath);

        } catch (IOException e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }

}



