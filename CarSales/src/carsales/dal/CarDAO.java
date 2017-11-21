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
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class CarDAO {

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList();
        SQLServerDataSource ds
                = new SQLServerDataSource();

        ds.setDatabaseName("CS2017A_39_CarDealer");
        ds.setUser("CS2017A_39_java");
        ds.setPassword("javajava");
        ds.setServerName("EASV-DB2");
        ds.setPortNumber(1433);

        try (Connection con = ds.getConnection();) {
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
}
