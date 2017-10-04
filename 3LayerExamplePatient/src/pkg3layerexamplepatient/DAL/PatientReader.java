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
public interface PatientReader
{
    public ObservableList<Patient> getAllPatients();
}
