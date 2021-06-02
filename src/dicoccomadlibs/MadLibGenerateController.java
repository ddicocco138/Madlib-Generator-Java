/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicoccomadlibs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author damia
 */
public class MadLibGenerateController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label letterbody;
    @FXML
    private Label labelbot1;
    @FXML
    private Label labelbot2;
    @FXML
    private Label labelbot3;
    
    public void setLabel1(String lb1) // function used to change text on label1
    {
        label1.setText(lb1);
    }
    
    public void setLabel2(String lb2) // function used to change text on label2
    {
        label2.setText(lb2);
    }
    
    public void setLetterBody(String lb3) // function used to change the letter body
    {
        letterbody.setText(lb3);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
