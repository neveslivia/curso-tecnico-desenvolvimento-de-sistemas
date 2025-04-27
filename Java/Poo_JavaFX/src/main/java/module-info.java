module criacaodetelas.crudjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    exports criacaodetelas.crudjava.main to javafx.graphics;
    opens criacaodetelas.crudjava.main to javafx.fxml;
    opens criacaodetelas.crudjava.controller to javafx.fxml;
}