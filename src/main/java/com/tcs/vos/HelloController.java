package com.tcs.vos;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TableView<Trein> tableView;
    @FXML private TextField idField;
    @FXML private TextField nummerField;
    @FXML private DatePicker datumField;
    @FXML private TextField vertrekTijdField;
    @FXML private TextField aankomstTijdField;

    @FXML
    protected void addTrein(ActionEvent event){
        ObservableList<Trein> data = tableView.getItems();
        data.add(new Trein(
                Integer.parseInt(idField.getText()),
                Integer.parseInt(nummerField.getText()),
                datumField.getValue(),
                vertrekTijdField.getText(),
                aankomstTijdField.getText()));
    }
}