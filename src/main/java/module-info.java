module com.recuperacionmiguel.recuperacion_interfaces {
  requires javafx.controls;
  requires javafx.fxml;


  exports com.recuperacionmiguel.recuperacion_interfaces.Controlador;
  opens com.recuperacionmiguel.recuperacion_interfaces.Controlador to javafx.fxml;
  exports com.recuperacionmiguel.recuperacion_interfaces.Vista;
  opens com.recuperacionmiguel.recuperacion_interfaces.Vista to javafx.fxml;
  exports com.recuperacionmiguel.recuperacion_interfaces.Aplicacion;
  opens com.recuperacionmiguel.recuperacion_interfaces.Aplicacion to javafx.fxml;
}