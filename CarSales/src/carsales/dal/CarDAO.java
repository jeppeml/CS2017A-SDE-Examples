/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.dal;

import carsales.be.Car;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class CarDAO {
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList();
        Car myHonda = new Car();
        myHonda.setId(0);
        myHonda.setMake("Honda");
        myHonda.setModel("Civic");
        myHonda.setYear(1984);
        myHonda.setPrice(55_249.95);
        
        cars.add(myHonda);
        return cars;
    }
}
