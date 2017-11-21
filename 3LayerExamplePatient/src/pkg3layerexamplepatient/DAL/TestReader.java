/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.DAL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pkg3layerexamplepatient.BE.Patient;

/**
 *
 * @author jeppjleemoritzled
 */
public class TestReader implements PatientReader
{
    
    ObservableList<Patient> data = FXCollections.observableArrayList();
        
    @Override
    public ObservableList<Patient> getAllPatients()
    {
        
        Patient p1 = new Patient(0, "Peter", "pgn@easv.dk", "Petermani");
        Patient p2 = new Patient(1, "Jens", "jens@petersen.com", "Ludomani");
        data.add(p1);
        data.add(p2);
        return data;
        
    }

    @Override
    public void savePatient(Patient pat)
    {
        data.add(pat);
    }

    @Override
    public Patient getPatient(int id)
    {
        for (Patient patient : data)
        {
            if(patient.getId() == id)
                return patient;
        }
        return null;
    }
    
    
}
