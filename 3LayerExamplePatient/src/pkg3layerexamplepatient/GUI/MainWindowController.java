/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pkg3layerexamplepatient.BE.Patient;
import pkg3layerexamplepatient.BLL.BLLManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainWindowController implements Initializable
{

    @FXML
    private TableView<Patient> tablePatients;
    @FXML
    private TableColumn<Patient, String> columnName;
    @FXML
    private TableColumn<Patient, String> columnEmail;
    
    BLLManager bllManager = new BLLManager();
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // Kobler navn med kolonne
        columnName.setCellValueFactory(
            new PropertyValueFactory<>("name"));
        
        columnEmail.setCellValueFactory(
            new PropertyValueFactory<>("email"));
        
        loadAllPatients();
        
    }   
    
    public void loadAllPatients()
    {
        tablePatients.setItems(bllManager.getAllPatients());
    }

    @FXML
    private void clickRow(MouseEvent event) throws IOException
    {
        Stage primStage = (Stage)tablePatients.getScene().getWindow();
        FXMLLoader fxLoader = new FXMLLoader(
                getClass().getResource("PatientView.fxml"));
        Parent root = fxLoader.load();
        
        PatientViewController controller =
                fxLoader.getController();
        Patient selectedPatient = 
                tablePatients.getSelectionModel().getSelectedItem();
        controller.loadPatient(selectedPatient);
        Stage stage = new Stage(); // new window
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initOwner(primStage);
        stage.initModality(Modality.WINDOW_MODAL);
        
        stage.show();
    }

    @FXML
    private void clickBtn(ActionEvent event)
    {
        if(event.getSource()==btn1)
            System.out.println("Weee");
    }
    
}
