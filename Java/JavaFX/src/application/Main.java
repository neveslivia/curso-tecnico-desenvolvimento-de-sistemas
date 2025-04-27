package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            mudarTela("faixa_etaria"); // Inicia com a tela de faixa etária
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mudarTela(String fxml) {
        try {
            VBox root = FXMLLoader.load(Main.class.getResource("/view/" + fxml + ".fxml"));
            Scene scene = new Scene(root, 400, 300);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
