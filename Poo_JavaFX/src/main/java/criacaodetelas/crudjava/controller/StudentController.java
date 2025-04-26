package criacaodetelas.crudjava.controller;

import criacaodetelas.crudjava.entities.Student;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    private Button bt_calcular;

    @FXML
    private TextField tf_n1;

    @FXML
    private TextField tf_n2;

    @FXML
    private TextField tf_n3;

    @FXML
    private Label lb_finalgrade;

    @FXML
    private Label lb_missingpoints;

    @FXML
    private Label lb_status;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_calcular.setOnAction(event -> calcularnota());
    }
    Student student = new Student();
    @FXML
    private void calcularnota() {
        try {
           double valor1 = Double.parseDouble(tf_n1.getText());
           double valor2 = Double.parseDouble(tf_n2.getText());
           double valor3 = Double.parseDouble(tf_n3.getText());
           student.setNota1(valor1);
           student.setNota2(valor2);
           student.setNota3(valor3);


            mostrarresultado();



        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Entrada inválida!");
            alert.setContentText("Certifique-se de que preencheu os valores corretamente.");
            alert.showAndWait();
        }

    }
    private void mostrarresultado(){
        double resultado = student.resultado();
        boolean aprovado = student.aprovacao();
        double pontosFaltantes = student.pontosfaltantes();

        lb_finalgrade.setText(String.valueOf(resultado));
        lb_status.setText(aprovado ? "Pass" : "Failed");

        if (!aprovado) {
            lb_missingpoints.setText(String.valueOf(pontosFaltantes));
        } else {
            lb_missingpoints.setText("");
        }
    }


}
