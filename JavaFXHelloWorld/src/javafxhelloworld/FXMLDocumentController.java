package javafxhelloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label textLabel;
    private Button clickButton;
    
    @FXML
    private void activateButton (ActionEvent event) {
        textLabel.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
