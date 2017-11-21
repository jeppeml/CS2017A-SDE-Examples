/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.gui;

import carsales.be.Car;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainWindowController implements Initializable {
    private CarModel carModel = new CarModel();
    
    @FXML
    private ListView<Car> lstCars;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Binding list in model with listview
        lstCars.setItems(carModel.getCars());
    }    

    @FXML
    private void clickLoadBtn(ActionEvent event) {
        carModel.loadCars();
    }
    
}
