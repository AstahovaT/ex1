package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField x;

    @FXML
    private TextField a;

    @FXML
    private TextField b;


    @FXML
    private TextField answer;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void getAnswer() {
        float result;
        float x = Float.parseFloat(this.x.getText());
        float a = Float.parseFloat(this.a.getText());
        float b = Float.parseFloat(this.b.getText());
        if (x > 7) {
            result = x * (float) Math.pow(a + b, 2);
        } else {
            result = (float) ((x + 4) / (Math.pow(a, 2) + Math.pow(b, 2)));
        }
        answer.setText(String.valueOf(result));
    }



    public void clear() {
        x.setText("");
        a.setText("");
        b.setText("");
        answer.setText("");
    }


    public void exit() {
        System.exit(0);
    }
}
