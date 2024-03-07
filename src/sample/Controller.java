package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField firstName;
    @FXML
    private TextField adress;
    @FXML
    private TextField email;
    @FXML
    private TextField site;
    @FXML
    private TextField telephone;
    @FXML
    private DatePicker birthday;
    @FXML
    GridPane gridpane;
    @FXML
    ImageView img;


    static Person person;

    static String limage = "sample/avatarz/fm_1.png";
    static String limage1 = "sample/avatarz/fm_2.png";
    static String limage2 = "sample/avatarz/fm_3.png";
    static String limage3 = "sample/avatarz/fm_4.png";
    static String limage4 = "sample/avatarz/hm_2.png";
    static String limage5 = "sample/avatarz/hm_3.png";
    static String limage6 = "sample/avatarz/hm_4.png";
    static String limage7 = "sample/avatarz/hm_1.png";


    public void ChangerVue(ActionEvent event) throws IOException {
        person= new Person(firstName.getText(),email.getText(),birthday.getValue().toString(),telephone.getText(),site.getText(),adress.getText(),limage);
        ((Node) event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("card.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("sample/avatarz/ICON.png"));
        primaryStage.setTitle("Icard");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void edit(){
        gridpane.setVisible(true);
    }

    public void image1() {
        limage = "sample/avatarz/fm_1.png";
        img.setImage(new Image(limage));
        gridpane.setVisible(false);
    }
    public void image2(){
        limage = "sample/avatarz/fm_2.png";
        img.setImage(new Image(limage));
        gridpane.setVisible(false);
    }
    public void image3(){
        limage = "sample/avatarz/fm_3.png";
        img.setImage(new Image(limage));
        gridpane.setVisible(false);
    }


}
