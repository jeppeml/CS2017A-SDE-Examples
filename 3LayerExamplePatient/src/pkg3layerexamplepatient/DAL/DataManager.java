/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.DAL;

import pkg3layerexamplepatient.BE.Patient;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Jeppe
 */
public class DataManager {
    
    public ObservableList<Patient> getAllPatients()
    {
        ObservableList<Patient> data = FXCollections.observableArrayList();

        try (BufferedReader CSVFile = new BufferedReader(new FileReader("MOCK_DATA.csv"))) 
        {
            String dataRow = CSVFile.readLine();
            dataRow = CSVFile.readLine(); // Skip header
            while (dataRow != null) {
                String[] dataArray = dataRow.split(",");
                data.add(new Patient(
                        Integer.parseInt(dataArray[0]),
                        dataArray[1],
                        dataArray[2],
                        dataArray[3])
                );
                dataRow = CSVFile.readLine(); // Read next line of data.
            }
            return data;
        }
        catch(IOException ioe)
        {
            System.out.println("IO exception in DataManager: Returning null!" + ioe);
            return null;
        }
    }
}
