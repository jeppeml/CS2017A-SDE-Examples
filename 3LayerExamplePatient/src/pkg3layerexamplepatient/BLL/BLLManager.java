/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.BLL;

import javafx.collections.ObservableList;
import pkg3layerexamplepatient.BE.Patient;
import pkg3layerexamplepatient.DAL.DataManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager
{
    DataManager dm = new DataManager();
    public ObservableList<Patient> getAllPatients()
    {
        return dm.getAllPatients();
    }
}
