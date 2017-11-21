/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.DAL;

import javafx.collections.ObservableList;
import pkg3layerexamplepatient.BE.Patient;

/**
 *
 * @author jeppjleemoritzled
 */
public class DBReader implements PatientReader
{

    @Override
    public ObservableList<Patient> getAllPatients()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Patient getPatient(int id)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void savePatient(Patient pat)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
