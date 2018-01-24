package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Text animalName;

    @FXML
    private Button buttonCat;

    @FXML
    private Button buttonDog;

    @FXML
    private Button buttonFish;


    public void ClicktheCat(ActionEvent actionEvent) {
        animalName.setText("Meow Feed Me!!!");

    }

    public void ClicktheDog(ActionEvent actionEvent) {
        animalName.setText("Woof Pet Me!!!");

    }

    public void ClicktheFish(ActionEvent actionEvent) {
        animalName.setText("I'm Floating!!!");
    }
}

