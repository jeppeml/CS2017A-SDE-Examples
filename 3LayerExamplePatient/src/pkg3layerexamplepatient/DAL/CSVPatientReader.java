/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.DAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pkg3layerexamplepatient.BE.Patient;

/**
 *
 * @author jeppjleemoritzled
 */
public class CSVPatientReader implements PatientReader
{

    @Override
    public ObservableList<Patient> getAllPatients()
    {
        ObservableList<Patient> data = FXCollections.observableArrayList();

        try (BufferedReader CSVFile = new BufferedReader(new FileReader("MOCK_DATA.csv"))) 
        {
            CSVFile.readLine();// Skip header
            String dataRow = CSVFile.readLine(); 
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

    @Override
    public void savePatient(Patient pat)
    {
        //DOne
    }

    @Override
    public Patient getPatient(int id)
    {
        List<Patient> patients = getAllPatients();
        for (Patient patient : patients)
        {
            if(patient.getId() == id)
                return patient;
        }
        return null;
    }
    
    
    
}
