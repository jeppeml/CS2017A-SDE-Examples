/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.bll;

import carsales.be.Car;
import carsales.dal.CarDAO;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private CarDAO carDAO = new CarDAO();
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
