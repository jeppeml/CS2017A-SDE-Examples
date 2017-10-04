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
    
    PatientReader preader;
    
    public DataManager(PatientReader preader)
    {
        this.preader = preader;
    }
    
    public ObservableList<Patient> getAllPatients()
    {
        return preader.getAllPatients();
    }
}
