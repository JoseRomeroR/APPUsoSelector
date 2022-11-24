/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appusoselector;

import Componentes.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author Kyle7
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;
    @FXML
    private Label labelCambiarTexto;

    private ArrayList<String> items;

    public void initialize(URL url, ResourceBundle rb) {

        items = new ArrayList<>();
        items.add("Uno");
        items.add("DOS");
        items.add("TRES");
        items.add("CUATRO");
        selectorArriba.setItems(items);
        selectorAbajo.setItems(items);

    }

    @FXML
    private void ClickArriba(MouseEvent event) {
    }

    @FXML
    private void ClickAbajo(MouseEvent event) {
    }

}
