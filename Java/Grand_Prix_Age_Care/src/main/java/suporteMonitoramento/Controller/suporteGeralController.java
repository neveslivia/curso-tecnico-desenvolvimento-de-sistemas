package main.java.suporteMonitoramento.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class suporteGeralController implements Initializable {
        @FXML
        private Button bt_chamado_suporte;

        @FXML
        private Button bt_conversas_ligacoes;

        @FXML
        private Button bt_pagamentos;

        @FXML
        private Button bt_perguntas_frequentes;

        @FXML
        private Button bt_seguranca_verificacao;

        private Stage stage;
        private Scene scene;
        private Parent root;

    @FXML
    private void abrirSegurancaVerificacao(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/seguranca_verificacao.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

        private void mudarTela(ActionEvent event, String caminhoFXML) throws IOException {
            root = FXMLLoader.load(getClass().getResource(caminhoFXML));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

