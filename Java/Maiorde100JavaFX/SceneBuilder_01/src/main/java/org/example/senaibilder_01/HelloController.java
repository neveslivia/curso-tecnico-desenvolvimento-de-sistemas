package org.example.senaibilder_01;
import javafx.scene.control.TextField;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import programacao.Soma;



public class HelloController {
    Soma soma = new Soma();

    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private Label welcomeText;




    @FXML
    protected  void onN1() {

            soma.setParcela(txtNumero1.getText().isEmpty() ? 0 : Integer.parseInt(txtNumero1.getText()));

    }
    @FXML
    protected void onN2() {

        soma.setSalario(txtNumero2.getText().isEmpty() ? 0 :  Integer.parseInt(txtNumero2.getText()));
    }


    @FXML
    protected void onHelloButtonClick() {
        
        welcomeText.setText(soma.Resultado());
    }

}
