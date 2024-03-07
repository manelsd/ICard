package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;


public class Controller2 {
    @FXML
    Label website;
    @FXML
    Label phone;
    @FXML
    Label emailadress;
    @FXML
    Label adresshome;
    @FXML
    Label namestudent;
    @FXML
    Label id;
    @FXML
    ImageView photo;

    public void refresh() {
        website.setText(Controller.person.getSite());
        phone.setText(Controller.person.getTelephone());
        emailadress.setText(Controller.person.getEmail());
        adresshome.setText(Controller.person.getAddress());
        namestudent.setText(Controller.person.getFirstName());
        photo.setImage(new Image(Controller.person.getPhoto()));
        id.setText(Controller.person.getFirstName().charAt(0) + Controller.person.getBirthday());
    }
    public void save(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"));

    }
}
