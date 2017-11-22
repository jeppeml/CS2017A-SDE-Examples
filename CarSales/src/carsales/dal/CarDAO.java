/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.dal;

import carsales.be.Car;
import java.util.ArrayList;
import java.util.List;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class CarDAO {
    ConnectionManager cm = new ConnectionManager();

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList();
        
        try (Connection con = cm.getConnection();) {
            Statement stmt = con.createStatement();
            ResultSet rs
                    = stmt.executeQuery("SELECT * FROM Cars");
            while (rs.next()) {
                Car currentCar = new Car();
                currentCar.setId(rs.getInt("id"));
                currentCar.setMake(rs.getString("make"));
                currentCar.setModel(rs.getString("model"));
                currentCar.setPrice(rs.getFloat("price"));
                currentCar.setYear(rs.getInt("year"));
                currentCar.setDescription(rs.getString("description"));
                cars.add(currentCar);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cars;
    }

    public void remove(Car car) {
        try (Connection con = cm.getConnection();) {
            Statement stmt = con.createStatement();
            stmt.execute(
                "DELETE FROM Cars WHERE id="+car.getId());
        }
        catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
