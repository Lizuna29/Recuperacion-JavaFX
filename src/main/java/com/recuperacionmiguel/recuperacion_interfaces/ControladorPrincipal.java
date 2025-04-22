package com.recuperacionmiguel.recuperacion_interfaces;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorPrincipal extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("Principal.fxml")); //TODO:Cambiar ruta del fxml
    primaryStage.setTitle("Recuperacion Miguel");                                  //TODO:Cambiar nombre de la Stage principal
    primaryStage.setScene(new Scene(root, 300, 300));                        //TODO:Averiguar que son lo parametros "v" y "v1"
    primaryStage.show();
  }
}
