/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.gui;

import carsales.be.Car;
import carsales.bll.BLLManager;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainWindowController implements Initializable {
    
    BLLManager bllManager = new BLLManager();
    
    @FXML
    private ListView<Car> lstCars;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickLoadBtn(ActionEvent event) {
        List<Car> cars = bllManager.getAllCars();
        
        lstCars.getItems().clear();
        lstCars.getItems().addAll(cars);
       
    }
    
}
