package main.java.suporteMonitoramento.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainSuporteGeral extends Application {
    Stage janela;

    @Override
    public void start(Stage stage) throws Exception {
        janela = stage;


        Parent tela = FXMLLoader.load(getClass().getResource("/view/suporte_geral.fxml"));


        Scene scene = new Scene(tela);
        janela.setScene(scene);


        Button btnVerificacaoSeguranca = (Button) scene.lookup("#bt_seguranca_verificacao");


        btnVerificacaoSeguranca.setOnAction(e -> {
            try {
               new MainVerificacaoSeguranca().start(new Stage());
                janela.close(); // Fecha a janela atual
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
