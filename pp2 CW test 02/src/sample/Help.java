package sample;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class Help {
    //User friendly prompt that is called once the help button has been clicked.
    public static void helping(){

        Label h_lb1 = new Label("Help");
        h_lb1.setId("c_lb1");
        h_lb1.setLayoutY(25.0);
        h_lb1.setLayoutX(153.0);
        h_lb1.setMaxSize(60.0,22.0);
        Label h_lb2 = new Label("How do i use this calculator?\n" +
                "This calculator was designed and created to calculate for the textfield\n " +
                "values(input box) that has been left null or empty.Further more, nec...\n"+
                "...essary outputs will be displayed once the \"calculate\" button bas been \n" +
                "pressed. \"Clear\" butten will clear all entered data values from their\n" +
                " respective textfields.\n" +
                "Disclamair: only one text field can be left empty per calculation. ");
        h_lb2.setLayoutY(67.0);
        h_lb2.setLayoutX(7.0);
        h_lb2.setMaxSize(400.0,123.0);
        AnchorPane h_ap = new AnchorPane();
        h_ap.getChildren().add(h_lb1);
        h_ap.getChildren().add(h_lb2);

        h_ap.setId("c_lb18");


        Stage stage2 = new Stage();
        Scene scene2 = new Scene(h_ap,450.0,400.0);
        stage2.setScene(scene2);
        scene2.getStylesheets().add(Main.class.getResource("Styling.css").toExternalForm());
        stage2.show();
    }
    //User friendly prompt when users leave more than one textfield empty
    public static void Errorhelping(){
        Stage stage2 = new Stage();
        Label h_lb1 = new Label("Only one text field can be left blank!");
        h_lb1.setId("ErrorHelping");
        h_lb1.setLayoutX(100);
        h_lb1.setLayoutY(50);
        AnchorPane h_ap = new AnchorPane();
        h_ap.setId("ErrorHelping");
        h_ap.getChildren().add(h_lb1);
        stage2.setScene(new Scene(h_ap,400.0,100.0));
        stage2.show();
    }
}
