module com.recuperacionmiguel.recuperacion_interfaces {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.recuperacionmiguel.recuperacion_interfaces to javafx.fxml;
  exports com.recuperacionmiguel.recuperacion_interfaces;
}