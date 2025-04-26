module AgeCare {
    requires transitive javafx.fxml;
    requires transitive javafx.controls;


    opens main.java.suporteMonitoramento.Main to javafx.fxml;
    opens main.java.suporteMonitoramento.Controller to javafx.fxml;
    exports main.java.suporteMonitoramento.Main to javafx.graphics;


}