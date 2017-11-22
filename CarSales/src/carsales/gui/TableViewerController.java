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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class TableViewerController implements Initializable {

    @FXML
    private TableView<Car> tableCars;
    @FXML
    private TableColumn<Car, String> tableColumnId;
    @FXML
    private TableColumn<Car, String> tableColumnMake;
    @FXML
    private TableColumn<Car, String> tableColumnModel;
    @FXML
    private TableColumn<Car, String> tableColumnYear;
    @FXML
    private TableColumn<Car, String> tableColumnDesc;
    @FXML
    private TableColumn<Car, String> tableColumnPrice;
        
    private CarModel carModel = new CarModel();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableColumnId.setCellValueFactory(
            new PropertyValueFactory("id"));
        tableColumnMake.setCellValueFactory(
            new PropertyValueFactory("make"));
        tableColumnModel.setCellValueFactory(
            new PropertyValueFactory("model"));
        tableColumnYear.setCellValueFactory(
            new PropertyValueFactory("year"));
        tableColumnDesc.setCellValueFactory(
            new PropertyValueFactory("description"));
        tableColumnPrice.setCellValueFactory(
            new PropertyValueFactory("price"));
          
        tableCars.setItems(carModel.getCars());
    }    

    @FXML
    private void clickLoad(ActionEvent event) {
        carModel.loadCars();
    }

    @FXML
    private void clickDelete(ActionEvent event) {
        Car selectedCar = 
                tableCars.getSelectionModel().getSelectedItem();
        carModel.remove(selectedCar);
    }
    
}
