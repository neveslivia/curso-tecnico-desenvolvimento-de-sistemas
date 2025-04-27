package controllers;

import application.Main;
import javafx.fxml.FXML;

public class CalculoMediaController {

    @FXML
    private void trocarParaFaixaEtaria() {
        Main.mudarTela("faixa_etaria");
    }
}
