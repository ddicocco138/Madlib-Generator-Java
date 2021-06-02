/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicoccomadlibs;

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
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author damia
 */
public class MadLibSetUpController implements Initializable {

    @FXML
    private TextField tf12;
    @FXML
    private TextField tf13;
    @FXML
    private TextField tf11;
    @FXML
    private TextField tf9;
    @FXML
    private TextField tf10;
    @FXML
    private TextField tf8;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf1;
    @FXML
    private Button btn1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClick(ActionEvent event) throws IOException {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("MadLibGenerate.fxml")); // takes from generate FXML
      Parent root = loader.load();
      MadLibGenerateController madLibGenControl = loader.getController(); // loads controller to get 
                                                                          //access to its functions to modify its labels
      madLibGenControl.setLabel1("To:"+tf1.getText()+"@gmail.com"); // creating the letter body, accessing the functions from generate contoller 
                                                                    //to modify the letter using this controller variables
      madLibGenControl.setLabel2("From:"+tf2.getText()+"@yahoo.com");
      madLibGenControl.setLetterBody("I am so happy to tell you that, you"
      + " have won a free vacation to " + tf3.getText()+"!.\nOur company has noticed your diligent efforts in the " +
      tf4.getText()+" tasks you\naccomplished everyday for our company. Your free trip includes 1 guest\nmember and 4 days away from your "+ tf5.getText()+" job! We hope you "
      + "attend\nthe "+tf3.getText()+"'s greatest restaurent named "+tf9.getText()+" which "
      + "recieved "+tf10.getText()+"\nstars online! Dont worry about " + tf8.getText() + " and have fun! Let's not forget\nthat " + tf3.getText()+" is filled with amazing " + tf8.getText()+"'s and please take a picture of one!\n"
      + "When getting packed, dont forget to bring your " + tf13.getText()+" cause it is"
      + "\nessential for your "
      + tf11.getText()+"! Enjoy the trip, make us " + tf12.getText());
      Stage stage2 = new Stage(); // actions done in order to create a second window when button pressed
      Scene sn = new Scene(root); // makes scene the generateFXML
      stage2.setScene(sn);
      stage2.show();
    }
    
}
