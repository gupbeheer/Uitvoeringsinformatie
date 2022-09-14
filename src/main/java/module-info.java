module com.tcs.vos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.tcs.vos to javafx.fxml;
    exports com.tcs.vos;
}