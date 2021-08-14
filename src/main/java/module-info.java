module com.nbuproject.javaprojectbuildingmngmnt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.nbuproject.javaprojectbuildingmngmnt to javafx.fxml;
    exports com.nbuproject.javaprojectbuildingmngmnt;
}