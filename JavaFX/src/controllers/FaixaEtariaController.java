package controllers;

import application.Main;
import javafx.fxml.FXML;

public class FaixaEtariaController {
    @FXML
    private void trocarParaCalculoMedia() {
        Main.mudarTela("calculo_media");
    }


}
