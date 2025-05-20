package com.recuperacionmiguel.recuperacion_interfaces.Controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Prueba1 {

  @FXML private TextField textField;
  @FXML private ListView<String> listView;
  private final ArrayList<String> listViewArray = new ArrayList<>();
  private final ObservableList<String> modeloListView = FXCollections.observableArrayList();
  private String storedText;

  @FXML private void initialize() {
    listView.setItems(modeloListView);
  }

  @FXML
  private void saveTextField() {
    String text = textField.getText().trim();
    if (!text.isEmpty()) {
      listViewArray.add(text);
      modeloListView.add(text);
      textField.clear();
    }
  }

  @FXML
  private void deleteTextField() {
    String text = textField.getText().trim();
    if (listViewArray.remove(text)) {
      modeloListView.remove(text);
      textField.clear();
    }
  }


}
