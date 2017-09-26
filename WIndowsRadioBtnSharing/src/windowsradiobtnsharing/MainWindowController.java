/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowsradiobtnsharing;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainWindowController implements Initializable
{
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField txtName;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException
    {
        Stage newStage = new Stage();
        newStage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxLoader = new FXMLLoader(
            getClass().getResource("NewWindow.fxml"));
        Parent root = fxLoader.load();
        
        NewWindowController cont = fxLoader.getController();
        cont.changeName(txtName.getText());
        
        
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        System.out.println("Brugerfladen starter...");
        // TODO
    }    
    
}
