package com.recuperacionmiguel.recuperacion_interfaces.Aplicacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Prueba1 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/recuperacionmiguel/recuperacion_interfaces/Prueba1.fxml")));
    primaryStage.setTitle("Recuperacion_Miguel");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }
}
