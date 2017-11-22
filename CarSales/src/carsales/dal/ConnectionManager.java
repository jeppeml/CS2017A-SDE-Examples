/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsales.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author jeppjleemoritzled
 */
public class ConnectionManager {
    private SQLServerDataSource ds
                = new SQLServerDataSource();
    public ConnectionManager() {
        ds.setDatabaseName("CS2017A_39_CarDealer");
        ds.setUser("CS2017A_39_java");
        ds.setPassword("javajava");
        ds.setServerName("EASV-DB2");
        ds.setPortNumber(1433);
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
    
}
