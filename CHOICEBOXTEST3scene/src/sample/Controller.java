package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class Controller {

    @FXML
    private ChoiceBox departureBox; //creating an instance of the choiceBox with ID departureBox
    @FXML
    private ChoiceBox arrivalsBox; //creating an instance of the choiceBox with ID arrivalBox
  /*  @FXML
    private ChoiceBox time;
    */

    @FXML
    private void initialize() {         //calling the initialize method to initialize our different choice boxes
        departureBox.setItems(departureList); //setting the arraylist: departureList as a parameter for the departureBox
        departureBox.setValue("la");
        arrivalsBox.setItems(arrivalsList); //setting the arraylist: arrivalsList as a parameter for the departureBox
        arrivalsBox.setValue("ar");
       /* time.setItems(timeList);
        time.setValue("la");
*/

    }
        //populating our departure/arrivals lists
        ObservableList<String> departureList = FXCollections.observableArrayList("København H","HøjeTåstrup","Roskilde", "Ringsted", "Odense", "Næstved", "Nykøbing F");
        ObservableList<String> arrivalsList = FXCollections.observableArrayList("København H","HøjeTåstrup","Roskilde", "Ringsted", "Odense", "Næstved", "Nykøbing F");
        ObservableList<String> timeList = FXCollections.observableArrayList("13","14","flar"); //a dropdown menu used for time, which is NOT being used atm.
    }
