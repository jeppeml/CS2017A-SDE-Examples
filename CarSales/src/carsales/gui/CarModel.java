/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.gui;

import carsales.be.Car;
import carsales.bll.BLLManager;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jeppjleemoritzled
 */
public class CarModel {

    private ObservableList<Car> cars
            = FXCollections.observableArrayList();
    private BLLManager bllManager = new BLLManager();
    
    public ObservableList<Car> getCars() {
        return cars;
    }

    public void loadCars() {
        List<Car> loadedCars = bllManager.getAllCars();
        
        cars.clear();
        cars.addAll(loadedCars);
        
    }

}
