package criacaodetelas.crudjava.controller;

import criacaodetelas.crudjava.entities.Employee;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {

    @FXML
    private Button bt_editar;

    @FXML
    private Button bt_excluir;

    @FXML
    private Button bt_salvar;

    @FXML
    private TextField grosssalary;

    @FXML
    private TextField nome;

    @FXML
    private TextField tax;

    @FXML
    private Label resultado_nome;

    @FXML
    private Label resultado_salario;

    @FXML
    private Label resultado_tax;

    private Employee employee;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_salvar.setOnAction(event -> salvarDados());
        employee = new Employee();
    }

    @FXML
    private void salvarDados() {
        try {
            String name = nome.getText();
            double grossSalary = Double.parseDouble(grosssalary.getText());
            double taxa = Double.parseDouble(tax.getText());

            employee.setName(name);
            employee.setGrosssalary(grossSalary);
            employee.setTax(taxa);

            mostrarResultado();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Entrada inválida!");
            alert.setContentText("Certifique-se de que preencheu os valores corretamente.");
            alert.showAndWait();
        }
    }

    private void mostrarResultado() {
        resultado_nome.setText(employee.getName());
        resultado_tax.setText(employee.getTax() + "%");
        resultado_salario.setText("$" + employee.IncreaseSalary());
    }
}
