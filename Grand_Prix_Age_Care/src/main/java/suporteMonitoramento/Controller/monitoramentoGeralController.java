package main.java.suporteMonitoramento.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main.java.suporteMonitoramento.Entities.Monitoramento_Paciente;

import java.net.URL;
import java.util.ResourceBundle;

public class monitoramentoGeralController implements Initializable {
    @FXML
    private TextField txf_hora_acordar;

    @FXML
    private TextField txtf_hora_dormir;

    @FXML
    private TextField txtf_idade_paciente;

    @FXML
    private TextField txtf_nome_paciente;

    @FXML
    private TextField txtf_remedios;

    @FXML
    private TextField txtf_trocar_fralda;
    @FXML
    private Button bt_salvar;

    @Override

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_salvar.setOnAction(event -> salvarDados());
    }

    private void salvarDados() {
        if (txtf_nome_paciente.getText().isEmpty() ||
                txtf_idade_paciente.getText().isEmpty() ||
                txtf_hora_dormir.getText().isEmpty() ||
                txf_hora_acordar.getText().isEmpty() ||
                txtf_remedios.getText().isEmpty() ||
                txtf_trocar_fralda.getText().isEmpty()) {
            exibirAlerta("Erro", "Todos os campos devem ser preenchidos!", Alert.AlertType.ERROR);
            return;
        }

        String nome = txtf_nome_paciente.getText();
        int idade;
        try {
            idade = Integer.parseInt(txtf_idade_paciente.getText());
        } catch (NumberFormatException e) {
            exibirAlerta("Erro", "A idade deve ser um número válido!", Alert.AlertType.ERROR);
            return;
        }

        String horaDormir = txtf_hora_dormir.getText();
        String horaAcordar = txf_hora_acordar.getText();
        String remedios = txtf_remedios.getText();
        String horaTrocarFralda = txtf_trocar_fralda.getText();

        Monitoramento_Paciente paciente = new Monitoramento_Paciente(nome, idade, horaDormir, horaAcordar, remedios, horaTrocarFralda);
        exibirAlerta("Sucesso", "Dados do paciente salvos com sucesso!", Alert.AlertType.INFORMATION);
    }

    private void exibirAlerta(String titulo, String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
    }

