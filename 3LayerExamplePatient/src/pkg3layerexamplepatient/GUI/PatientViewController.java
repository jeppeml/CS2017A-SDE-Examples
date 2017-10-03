/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pkg3layerexamplepatient.BE.Patient;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class PatientViewController implements Initializable
{

    @FXML
    private Label lblId;
    @FXML
    private Label lblName;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblDiagnosis;

    public void loadPatient(Patient patient)
    {
        lblId.setText(patient.getId()+"");
        lblName.setText(patient.getName());
        lblEmail.setText(patient.getEmail());
        lblDiagnosis.setText(patient.getDiagnosis());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
