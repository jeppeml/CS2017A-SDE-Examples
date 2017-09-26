/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowsradiobtnsharing;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class NewWindowController implements Initializable
{

    @FXML
    private ToggleGroup grpAlder;
    @FXML
    private Label lblValg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void clickSubmit(ActionEvent event)
    {
        RadioButton rb = (RadioButton)grpAlder.getSelectedToggle();
        lblValg.setText(rb.getText());
    }
    
}
