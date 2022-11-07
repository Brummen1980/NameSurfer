module com.graph.namesurfer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.graph.namesurfer to javafx.fxml;
    exports com.graph.namesurfer;
}