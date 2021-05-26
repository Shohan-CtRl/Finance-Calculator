package sample;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //aetting title
        primaryStage.setTitle("Calculator");


        //Creating label and setting layout and size.
        Label lb1 = new Label("FINANCIAL CALCULATOR");
        lb1.setLayoutY(117.0);
        lb1.setLayoutX(150.0);
        lb1.setMinSize(700,200);
        //Importing an image
        lb1.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("download.png"))));
        lb1.setId("label01");

        //Creating buttons that call and open up other views.
        Button btn1 = new Button("Compound \n" + "Interest");
        btn1.setLayoutY(41.0);
        btn1.setLayoutX(100.0);
        btn1.setMinSize(88.0,75);
        btn1.setId("compound");

        Button btn2 = new Button("Saving");
        btn2.setLayoutY(41.0);
        btn2.setLayoutX(200.0);
        btn2.setMinSize(88.0,75);
        btn2.setId("compound");

        Button btn3 = new Button("Loan");
        btn3.setLayoutY(41.0);
        btn3.setLayoutX(300.0);
        btn3.setMinSize(88.0,75);
        btn3.setId("compound");

        Button btn4 = new Button("Mortgage");
        btn4.setLayoutY(41.0);
        btn4.setLayoutX(400.0);
        btn4.setMinSize(88.0,75);
        btn4.setId("compound");

        Button btn5 = new Button("Close\n App");
        btn5.setLayoutY(41.0);
        btn5.setLayoutX(500.0);
        btn5.setMinSize(88.0,75);
        btn5.setId("Close");


        //creating gridpan.
        GridPane gp = new GridPane();
        //creating anchorpans.
        AnchorPane ap1 = new AnchorPane();
        
        AnchorPane ap2 = new AnchorPane();

        //Setting labels to anchor pan 1
        ap1.getChildren().add(lb1);
        ap1.setId("ap1");
        //Setting buttons to anchorpan 2
        ap2.getChildren().add(btn1);
        ap2.getChildren().add(btn2);
        ap2.getChildren().add(btn3);
        ap2.getChildren().add(btn4);
        ap2.getChildren().add(btn5);
        //using gridpan to set layout.
        gp.add(ap1,0,0);
        gp.add(ap2,0,1);

        //Size of pop window.
        Scene scene = new Scene(gp, 855,490);
        primaryStage.setScene(scene);
        //setting css. linking Main file to Styling.css.
        scene.getStylesheets().add(getClass().getResource("Styling.css").toExternalForm());
        //Set on action buttons call each function respectively.
        btn1.setOnAction(actionEvent ->{
            CompoundInterest.Compounding();
        });
        btn2.setOnAction(actionEvent ->{
            Saving.saved();
        });
        btn3.setOnAction(actionEvent ->{
            Loan.Loaning();
        });
        btn4.setOnAction(actionEvent ->{
            Mortgage.Mortgaging();
        });
        btn5.setOnAction(actionEvent ->{
            primaryStage.close();
        });


        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
