package main.java.suporteMonitoramento.Controller;


import Cadastros.Cadastro;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import main.java.suporteMonitoramento.Entities.Seguranca_Verificacao;

import java.net.URL;
import java.util.ResourceBundle;


public class verificaoSegurancaController implements Initializable {
    @FXML
    private Button bt_salvar;

    @FXML
    private Button bt_salvarToken;

    @FXML
    private Label lb_digitarToken;

    @FXML
    private PasswordField passw_senha;

    @FXML
    private TextField txtf_email;

    @FXML
    private TextField txtf_tokenDigitado;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_salvar.setOnAction(event -> onSalvarEmailSenhaClick());
        bt_salvarToken.setOnAction(event ->onSalvarTokenClick());
    }
    Cadastro usuario = new Cadastro("usuario@example.com", "senha123");
    Seguranca_Verificacao segurancaVerificacao = new Seguranca_Verificacao(usuario);

//Esse

    @FXML
    public void onSalvarEmailSenhaClick() {
        try {String emailDigitado = txtf_email.getText();
            String senhaDigitada = passw_senha.getText();

            if (segurancaVerificacao.verificar_senha_email(emailDigitado, senhaDigitada)) {
                String tokenGerado = segurancaVerificacao.gerarToken();
                lb_digitarToken.setText(tokenGerado);

                mostrarAlerta("Sucesso", "Email e senha corretos! Token gerado.", Alert.AlertType.INFORMATION);


                lb_digitarToken.setVisible(true);
                bt_salvar.setDisable(true);
                bt_salvarToken.setDisable(false);
            } else {
                mostrarAlerta("Erro", "E-mail ou senha incorretos.", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            mostrarAlerta("Erro", "Algo deu errado. Tente novamente.", Alert.AlertType.ERROR);
        }

    }

    @FXML
    public void onSalvarTokenClick() {
        try {

            String tokenDigitado = txtf_tokenDigitado.getText();
            String tokenGerado = lb_digitarToken.getText();

            if (tokenDigitado.equals(tokenGerado)) {
                mostrarAlerta("Sucesso", "E-mail, senha e token corretos!", Alert.AlertType.INFORMATION);
            } else {
                mostrarAlerta("Erro", "Token incorreto. Tente novamente.", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            mostrarAlerta("Erro", "Algo deu errado ao verificar o token. Tente novamente.", Alert.AlertType.ERROR);
        }
        lb_digitarToken.setVisible(true);
    }

    private void mostrarAlerta(String titulo, String mensagem, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }


}

