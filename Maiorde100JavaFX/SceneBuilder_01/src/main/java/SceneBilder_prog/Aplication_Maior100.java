package SceneBilder_prog;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.senaibilder_01.HelloApplication;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Aplication_Maior100 extends Controler_Maior100 {

    public static void main(String[] args) {
        launch(args);
    }



    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maior_100.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
