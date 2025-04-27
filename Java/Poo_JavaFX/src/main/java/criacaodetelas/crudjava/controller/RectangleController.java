package criacaodetelas.crudjava.controller;

import criacaodetelas.crudjava.entities.Rectangle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RectangleController implements Initializable {

    @FXML
    private Button bt_calcular;

    @FXML
    private Label lb_area;

    @FXML
    private Label lb_diagonal;

    @FXML
    private Label lb_perimetro;

    @FXML
    private TextField tf_altura;

    @FXML
    private TextField tf_base;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_calcular.setOnAction(event -> calculararea());
    }
    Rectangle rectangle = new Rectangle();

    @FXML
    private void calculararea() {
        try {
            double base = Double.parseDouble(tf_base.getText());
            double altura = Double.parseDouble(tf_altura.getText());
            rectangle.setX(base);
            rectangle.setY(altura);

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
        double area = rectangle.area();
        double perimeter = rectangle.Perimeter();
        double diagonal = rectangle.diagonal();

        lb_area.setText(String.valueOf(area));
        lb_perimetro.setText(String.valueOf(perimeter));
        lb_diagonal.setText(String.format("%.2f",diagonal));


    }

}
