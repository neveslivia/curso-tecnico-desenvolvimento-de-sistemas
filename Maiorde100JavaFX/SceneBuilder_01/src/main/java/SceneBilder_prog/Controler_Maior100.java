package SceneBilder_prog;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import programacao.Maior100;

import java.util.Scanner;


public class Controler_Maior100 {

    Maior100 maior = new Maior100();
    Scanner sc = new Scanner(System.in);

    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private Label Resposta;



    @FXML

    protected void onNum1(){
        maior.setNumero(sc.nextInt());
    }

    @FXML
    protected  void onNum2(){
        maior.setNumero1(sc.nextInt());
    }

    @FXML
    protected void onResposta(){
        Resposta.setText(maior.Resultado());
    }
}
