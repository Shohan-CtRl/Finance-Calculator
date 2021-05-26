package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Loan {
    public static Boolean Initial_a_TFValid = false;
    public static Boolean Monthly_p_TFValid = false;
    public static Boolean Interest_r_TFValid = false;
    public static Boolean Duration_TFValid = false;
    public static Boolean Final_s_TFValid = false;
    public static void Loaning(){


        //Creating Labels
        Label c_lb1 = new label();
        c_lb1.setText("Loan\n"+"CALCULATOR");
        c_lb1.setLayoutY(27.0);
        c_lb1.setLayoutX(21.0);
        c_lb1.setMinSize(270,17);
        c_lb1.setId("c_lb1");

        Label c_lb2 = new label();
        c_lb2.setText("Principle Debt\n"+"(LKR)");
        c_lb2.setLayoutY(87.0);
        c_lb2.setLayoutX(11.0);
        c_lb2.setMinSize(67,17);
        c_lb2.setId("label");


        Label c_lb3 = new label();
        c_lb3.setText("Interest Rate\n"+"(Anual percentage)");
        c_lb3.setLayoutY(127.0);
        c_lb3.setLayoutX(11.0);
        c_lb3.setMinSize(67,17);
        c_lb3.setId("label");

        Label c_lb4 = new label();
        c_lb4.setText("Duration\n"+"(NO. of Month)");
        c_lb4.setLayoutY(167.0);
        c_lb4.setLayoutX(11.0);
        c_lb4.setMinSize(67,17);
        c_lb4.setId("label");

        Label c_lb5 = new label();
        c_lb5.setText("Final Amount\n"+"(LKR)");
        c_lb5.setLayoutY(207.0);
        c_lb5.setLayoutX(11.0);
        c_lb5.setMinSize(67,17);
        c_lb5.setId("label");

        Label c_lb6 = new label();
        c_lb6.setText("Regular Payment\n"+"(LKR)");
        c_lb6.setLayoutY(247.0);
        c_lb6.setLayoutX(11.0);
        c_lb6.setMinSize(67,17);
        c_lb6.setId("label");





        Label c_lb7 = new label();
        c_lb7.setText("RESULT");
        c_lb7.setLayoutY(43.0);
        c_lb7.setLayoutX(79.0);
        c_lb7.setMinSize(100,34);
        c_lb7.setId("c_lb7");

        Label c_lb8 = new label();
        c_lb8.setText("Principle Debt\n"+"(LKR)");
        c_lb8.setLayoutY(105.0);
        c_lb8.setLayoutX(79.0);
        c_lb8.setMinSize(227,34);
        c_lb8.setId("label");

        Label c_lb9 = new label();
        c_lb9.setText("Regular Payment");
        c_lb9.setLayoutY(154.0);
        c_lb9.setLayoutX(79.0);
        c_lb9.setMinSize(227,34);
        c_lb9.setId("label");

        Label c_lb10 = new label();
        c_lb10.setText("No. of payments(Total)");
        c_lb10.setLayoutY(201.0);
        c_lb10.setLayoutX(79.0);
        c_lb10.setMinSize(227,34);
        c_lb10.setId("label");

        Label c_lb11 = new label();
        c_lb11.setText("Duration (NO. of Month)");
        c_lb11.setLayoutY(248.0);
        c_lb11.setLayoutX(79.0);
        c_lb11.setMinSize(227,34);
        c_lb11.setId("label");

        Label c_lb12 = new label();
        c_lb12.setText("Final Amount\n"+"(LKR)");
        c_lb12.setLayoutY(277.0);
        c_lb12.setLayoutX(79.0);
        c_lb12.setMinSize(227,34);
        c_lb12.setId("label");





        Label c_lb13 = new label();
        c_lb13.setLayoutY(105.0);
        c_lb13.setLayoutX(537.0);
        c_lb13.setMinSize(227,34);

        Label c_lb14 = new label();
        c_lb14.setLayoutY(154.0);
        c_lb14.setLayoutX(537.0);
        c_lb14.setMinSize(227,34);

        Label c_lb15 = new label();
        c_lb15.setLayoutY(201.0);
        c_lb15.setLayoutX(537.0);
        c_lb15.setMinSize(227,34);

        Label c_lb16 = new label();
        c_lb16.setLayoutY(248.0);
        c_lb16.setLayoutX(537.0);
        c_lb16.setMinSize(227,34);

        Label c_lb17 = new label();
        c_lb17.setText("....");
        c_lb17.setLayoutY(295.0);
        c_lb17.setLayoutX(537.0);
        c_lb17.setMinSize(227,34);

        Label c_lb18 = new label();
        c_lb18.setText("- This calculator could be used\n to calculate variables based on\n a fixed Loan.\n\n - This is only for illustration\n purpose." +
                "\n\n- For more details contact the\n nearest branch or send us an\n inquiry.\n\n - Interest is assumed to be fixed\n throughout said period. ");
        c_lb18.setLayoutY(82.0);
        c_lb18.setLayoutX(20.0);
        c_lb18.setMinSize(200,300);
        c_lb18.setId("c_lb18");

        Label c_lb19 = new label();
        c_lb19.setText("Purpose & Condition");
        c_lb19.setLayoutY(24.0);
        c_lb19.setLayoutX(20.0);
        c_lb19.setMinSize(190,34);
        c_lb19.setId("c_lb19");







        //Creating text fields
        TextField c_tf1 = new TextField();
        c_tf1.setLayoutY(87.0);
        c_tf1.setLayoutX(115.0);
        c_tf1.setMinSize(149,25);
        c_tf1.setId("c_tf");

        TextField c_tf2 = new TextField();
        c_tf2.setLayoutY(127.0);
        c_tf2.setLayoutX(115.0);
        c_tf2.setMinSize(149,25);
        c_tf2.setId("c_tf");

        TextField c_tf3 = new TextField();
        c_tf3.setLayoutY(167.0);
        c_tf3.setLayoutX(115.0);
        c_tf3.setMinSize(149,25);
        c_tf3.setId("c_tf");

        TextField c_tf4 = new TextField();
        c_tf4.setLayoutY(207.0);
        c_tf4.setLayoutX(115.0);
        c_tf4.setMinSize(149,25);
        c_tf4.setId("c_tf");

        TextField c_tf5 = new TextField();
        c_tf5.setLayoutY(247.0);
        c_tf5.setLayoutX(115.0);
        c_tf5.setMinSize(149,25);
        c_tf5.setId("c_tf");



        //Creating button
        Button c_btn1 =new Button("Calculate");
        c_btn1.setLayoutY(275.0);
        c_btn1.setLayoutX(200.0);
        c_btn1.setMinSize(67.0,25);
        c_btn1.setId("c_btn");

        Button c_btn2 =new Button("Reset");
        c_btn2.setLayoutY(275.0);
        c_btn2.setLayoutX(122.0);
        c_btn2.setMinSize(67.0,25);
        c_btn2.setId("c_btn");

        Button c_btn3 =new Button("Home\n"+"<--");
        c_btn3.setLayoutY(15.0);
        c_btn3.setLayoutX(855.0);
        c_btn3.setMinSize(52.0,50);
        c_btn3.setId("c_btn2");

        Button c_btn4 =new Button("Help");
        c_btn4.setLayoutY(30.0);
        c_btn4.setLayoutX(225.0);
        c_btn4.setMinSize(67.0,25);
        c_btn4.setId("c_btn2");
        //Creating gridpan to structure the window.
        GridPane c_gp = new GridPane();
        //Anchor pans created to set into their respective grids
        AnchorPane c_ap1 = new AnchorPane();
        c_ap1.setMinSize(200,200);

        AnchorPane c_ap2 = new AnchorPane();
        c_ap2.setMinSize(200,200);
        c_ap2.setId("c_ap");


        AnchorPane c_ap3 = new AnchorPane();
        c_ap3.setMinSize(200,200);
        c_ap3.setId("c_ap");


        AnchorPane c_ap4 = new AnchorPane();

        // Toolbar to help user navigation.(Savings,Mortgage & Compound)
        ToolBar toolBar = new ToolBar();
        toolBar.setLayoutY(15.0);
        toolBar.setLayoutX(615.0);
        Button Compound_b = new Button("Compound\n ");
        toolBar.getItems().add(Compound_b);
        toolBar.getItems().add(new Separator());
        Button Saving_b = new Button("Saving\n ");
        toolBar.getItems().add(Saving_b);
        toolBar.getItems().add(new Separator());
        Button Mortgage_b = new Button("Mortgage\n ");
        toolBar.getItems().add(Mortgage_b);
        //Setting css for toolbar.
        toolBar.setId("maintoolbar");
        Compound_b.setId("toolbar");
        Saving_b.setId("toolbar");
        Mortgage_b.setId("toolbar");


        //----------------------Creating keyboard---------------------------------------------------------------------------------------------------

        Button btnk0 = new Button("0");
        btnk0.setMinWidth(50);
        btnk0.setMinHeight(30);
        btnk0.setId("keyb");


        Button btnk1 = new Button("1");
        btnk1.setMinWidth(50);
        btnk1.setMinHeight(30);
        btnk1.setId("keyb");
        Button btnk2 = new Button("2");
        btnk2.setMinWidth(50);
        btnk2.setMinHeight(30);
        btnk2.setId("keyb");

        Button btnk3 = new Button("3");
        btnk3.setMinWidth(50);
        btnk3.setMinHeight(30);
        btnk3.setId("keyb");

        Button btnk4 = new Button("4");
        btnk4.setMinWidth(50);
        btnk4.setMinHeight(30);
        btnk4.setId("keyb");

        Button btnk5 = new Button("5");
        btnk5.setMinWidth(50);
        btnk5.setMinHeight(30);
        btnk5.setId("keyb");

        Button btnk6 = new Button("6");
        btnk6.setMinWidth(50);
        btnk6.setMinHeight(30);
        btnk6.setId("keyb");

        Button btnk7 = new Button("7");
        btnk7.setMinWidth(50);
        btnk7.setMinHeight(30);
        btnk7.setId("keyb");

        Button btnk8 = new Button("8");
        btnk8.setMinWidth(50);
        btnk8.setMinHeight(30);
        btnk8.setId("keyb");

        Button btnk9 = new Button("9");
        btnk9.setMinWidth(50);
        btnk9.setMinHeight(30);
        btnk9.setId("keyb");

        Button btndot = new Button(".");
        btndot.setMinWidth(50);
        btndot.setMinHeight(30);
        btndot.setId("keyb");



        //assigning set on action

        c_tf4.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                Initial_a_TFValid = false;
                Monthly_p_TFValid = false;
                Interest_r_TFValid = false;
                Duration_TFValid = false;
                Final_s_TFValid = true;
            }
        });


        c_tf2.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Initial_a_TFValid = false;
                Monthly_p_TFValid = false;
                Interest_r_TFValid = true;
                Duration_TFValid = false;
                Final_s_TFValid = false;


            }
        });


        c_tf1.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {


                Initial_a_TFValid = true;
                Monthly_p_TFValid = false;
                Interest_r_TFValid = false;
                Duration_TFValid = false;
                Final_s_TFValid = false;


            }
        });




        c_tf3.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Initial_a_TFValid = false;
                Monthly_p_TFValid = false;
                Interest_r_TFValid = false;
                Duration_TFValid = true;
                Final_s_TFValid = false;


            }
        });

        c_tf5.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                Initial_a_TFValid = false;
                Monthly_p_TFValid = true;
                Interest_r_TFValid = false;
                Duration_TFValid = false;
                Final_s_TFValid = false;
            }
        });


        btnk0.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "0");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "0");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "0");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "0");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "0");
            }

        });


        btnk1.setOnAction(ActionEvent -> {

            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "1");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "1");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "1");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "1");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "1");
            }

        });


        btnk2.setOnAction(ActionEvent -> {

            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "2");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "2");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "2");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "2");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "2");
            }

        });

        btnk3.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "3");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "3");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "3");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "3");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "3");
            }

        });

        btnk4.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "4");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "4");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "4");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "4");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "4");
            }

        });

        btnk5.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "5");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "5");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "5");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "5");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "5");
            }

        });

        btnk6.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "6");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "6");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "6");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "6");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "6");
            }

        });

        btnk7.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "7");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "7");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "7");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "7");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "7");
            }

        });

        btnk8.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "8");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "8");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "8");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "8");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "8");
            }

        });

        btnk9.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + "9");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + "9");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + "9");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + "9");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + "9");
            }

        });
        btndot.setOnAction(ActionEvent -> {


            if (Final_s_TFValid == true) {

                c_tf4.setText(c_tf4.getText() + ".");

            } else if (Initial_a_TFValid == true) {

                c_tf1.setText(c_tf1.getText() + ".");
            }  else if (Duration_TFValid == true) {

                c_tf3.setText(c_tf3.getText() + ".");
            } else if (Interest_r_TFValid == true) {

                c_tf2.setText(c_tf2.getText() + ".");
            }else if (Monthly_p_TFValid == true) {

                c_tf5.setText(c_tf5.getText() + ".");
            }

        });





        //Gridpan to structure the keypad layout.
        GridPane gpane1 = new GridPane();
        gpane1.setId("keybBase");
        gpane1.setLayoutX(700);
        gpane1.setLayoutY(50);
        gpane1.setMinSize(100,100);
        gpane1.add(btnk7,0,0,1,1);
        gpane1.add(btnk8,1,0,1,1);
        gpane1.add(btnk9,2,0,1,1);
        gpane1.add(btnk4,0,1,1,1);
        gpane1.add(btnk5,1,1,1,1);
        gpane1.add(btnk6,2,1,1,1);
        gpane1.add(btnk1,0,2,1,1);
        gpane1.add(btnk2,1,2,1,1);
        gpane1.add(btnk3,2,2,1,1);
        gpane1.add(btndot,1,3,1,1);
        gpane1.add(btnk0,0,3,1,1);
        c_ap4.getChildren().add(gpane1);




        //Placing label 1 - 6 into the anchorpan(top left on GUI)
        c_ap1.getChildren().add(c_lb1);
        c_ap1.getChildren().add(c_lb2);
        c_ap1.getChildren().add(c_lb3);
        c_ap1.getChildren().add(c_lb4);
        c_ap1.getChildren().add(c_lb5);
        c_ap1.getChildren().add(c_lb6);

        //Text field added to anchorpan.
        c_ap1.getChildren().add(c_tf1);
        c_ap1.getChildren().add(c_tf2);
        c_ap1.getChildren().add(c_tf3);
        c_ap1.getChildren().add(c_tf4);
        c_ap1.getChildren().add(c_tf5);

        //setting label 7-17 and toolbar into anchorpan2(top right on GUI)
        c_ap2.getChildren().add(c_lb7);
        c_ap2.getChildren().add(c_lb8);
        c_ap2.getChildren().add(c_lb9);
        c_ap2.getChildren().add(c_lb10);
        c_ap2.getChildren().add(c_lb11);
        c_ap2.getChildren().add(c_lb12);
        c_ap2.getChildren().add(c_lb13);
        c_ap2.getChildren().add(c_lb14);
        c_ap2.getChildren().add(c_lb15);
        c_ap2.getChildren().add(c_lb16);
        c_ap2.getChildren().add(c_lb17);
        c_ap2.getChildren().add(toolBar);

        //Setting terms and conditions.
        c_ap3.getChildren().add(c_lb18);
        c_ap3.getChildren().add(c_lb19);

        //Adding buttons to respective anchorpans.
        c_ap1.getChildren().add(c_btn1);
        c_ap1.getChildren().add(c_btn2);
        c_ap2.getChildren().add(c_btn3);
        c_ap3.getChildren().add(c_btn4);

        //Adding buttons to respective text fields.
        c_gp.add(c_ap1,0,0);
        c_gp.add(c_ap2,1,0);
        c_gp.add(c_ap3,0,1);
        c_gp.add(c_ap4,1,1);

        //Creating new Scene and stage.
        Scene scene1 = new Scene(c_gp);
        Stage stage1 = new Stage();
        stage1.setScene(scene1);
        //Attaching css from Styling.css folder.
        scene1.getStylesheets().add(Main.class.getResource("Styling.css").toExternalForm());

        //On button click, stage1 would force close.
        c_btn3.setOnAction(actionEvent ->{
            stage1.close();
        });
        //calls helping class.
        c_btn4.setOnAction(actionEvent ->{
            Help.helping();
        });

        //calculates respective values depending on blank text fields.
        c_btn1.setOnAction(actionEvent ->{
            String Int = c_tf2.getText();
            String I_amount = c_tf1.getText();
            String Dur = c_tf3.getText();
            String F_amount= c_tf4.getText();
            String R_payment = c_tf5.getText();
            String Num = "12";
            String I_charged="" ;
            String Flag ="" ;
            Double Step_1;
            Double Step_2;
            Double Step_3;
            String Fail="0";


            // formates to 2 d.p.
            DecimalFormat df = new DecimalFormat("0.00");
            //Gets input from text fields to check if they are empty
            if(!c_tf2.getText().equals("") && !c_tf1.getText().equals("") && !c_tf3.getText().equals("") && !c_tf5.getText().equals("")){
                Double Interest = Double.parseDouble(Int);
                Double Initial_a = Double.parseDouble(I_amount);
                Double Reg_p = Double.parseDouble(R_payment);
                Double Duration = Double.parseDouble(Dur);
                Double n = Double.parseDouble(Num);
                Double Final_a ;
                //Calculating Final sum.(Final value)
                Step_1 = Reg_p*((Math.pow(1+(Interest/(100*n)),Duration)-1)/(Interest/(100*n)));
                Step_2 = Initial_a*(Math.pow((1+(Interest/(100*n))),Duration));
                Step_3 = Step_2 - Step_1;
                Final_a = Step_3;
                F_amount=df.format((Step_3));;
                I_charged=Double.toString(new Double(df.format((Final_a-Initial_a))).doubleValue());
                Flag = "final_amount";

            }else if(!c_tf2.getText().equals("") && !c_tf4.getText().equals("") && !c_tf3.getText().equals("") && !c_tf5.getText().equals("")){
                Double Interest = Double.parseDouble(Int);
                Double Reg_p = Double.parseDouble(R_payment);
                Double Duration = Double.parseDouble(Dur);
                Double n = Double.parseDouble(Num);
                Double  Final_a= Double.parseDouble(F_amount);
                Double  Initial_a;
                //Calculating Initial value(Start value).
                Step_1 = Final_a + (Reg_p*((Math.pow(1+(Interest/(100*n)),Duration)-1)/(Interest/(100*n))));
                Step_2 = (Step_1)/Math.pow((1+(Interest/(100*n))),Duration);
                Initial_a = new Double(df.format((Step_2))).doubleValue();
                I_amount = Double.toString(new Double(Initial_a));
                I_charged=Double.toString(new Double(df.format((Final_a-Initial_a))).doubleValue());
                Flag = "initial_amount";


            }else if(!c_tf2.getText().equals("") && !c_tf4.getText().equals("") && !c_tf3.getText().equals("") && !c_tf1.getText().equals("")){
                Double Interest = Double.parseDouble(Int);
                Double  Initial_a = Double.parseDouble(I_amount);
                Double Duration = Double.parseDouble(Dur);
                Double n = Double.parseDouble(Num);
                Double  Final_a= Double.parseDouble(F_amount);
                Double   Reg_p;
                //Calculates payment required.
                Step_1 = (Initial_a*(Math.pow((1+(Interest/(100*n))),Duration)))-Final_a;
                Step_2 = Step_1/((Math.pow((1+(Interest/(100*n))),Duration)-1)/(Interest/(100*n)));
                Reg_p = new Double(df.format((Step_2))).doubleValue();
                R_payment = Double.toString(new Double(Reg_p));
                I_charged=Double.toString(new Double(df.format((Final_a-Initial_a))).doubleValue());
                Flag = "Pay";


            }else if(!c_tf2.getText().equals("") && !c_tf4.getText().equals("") && !c_tf5.getText().equals("") && !c_tf1.getText().equals("")){
                Double Interest = Double.parseDouble(Int);
                Double  Initial_a = Double.parseDouble(I_amount);
                Double Reg_p = Double.parseDouble(R_payment);
                Double n = Double.parseDouble(Num);
                Double  Final_a= Double.parseDouble(F_amount);
                Double   Duration;
                //Calculating Duration(period of investment)
                Step_1 = Math.log(Reg_p/(((Interest/(100*n))*-Initial_a)+ Reg_p));
                Step_2 = n * (Math.log(1+(Interest/(100*n))));
                Step_3 = (Step_1/Step_2)*12;
                Duration = new Double(df.format((Step_3))).doubleValue();
                Dur = Double.toString(new Double(Duration));
                I_charged=Double.toString(new Double(df.format((Final_a-Initial_a))).doubleValue());
                Flag = "Duration/no. of payments";


            }else{
                Help.Errorhelping();// Error prompt if none of the criteria are met.
            }
            //Sets text to output labels depending on string flag.
            if (Flag == "final_amount"){
                c_lb13.setText(I_amount);
                c_lb14.setText(R_payment);
                c_lb15.setText(Dur);
                c_lb16.setText(Dur);
                c_lb17.setText(F_amount);
                c_lb17.setId("label");
            }else if(Flag == "initial_amount"){
                c_lb13.setText(I_amount);
                c_lb14.setText(R_payment);
                c_lb15.setText(Dur);
                c_lb16.setText(Dur);
                c_lb17.setText(F_amount);
                c_lb13.setId("label");
            }else if(Flag == "Pay"){
                c_lb13.setText(I_amount);
                c_lb14.setText(R_payment);
                c_lb15.setText(Dur);
                c_lb16.setText(Dur);
                c_lb17.setText(F_amount);
                c_lb13.setId("label");
            }else if(Flag == "Duration/no. of payments"){
                c_lb13.setText(I_amount);
                c_lb14.setText(R_payment);
                c_lb15.setText(Dur);
                c_lb16.setText(Dur);
                c_lb17.setText(F_amount);
                c_lb13.setId("label");
            }else{
                Fail = "1";
            }
            //Pie chart
            //Pie chart shall only display if criteria are met above and a calculation has been made.
            // Referenced from : https://docs.oracle.com/javafx/2/charts/pie-chart.htm#:~:text=To%20create%20a%20pie%20chart,slices%20you%20want%20to%20appear.
            if(Fail == "0") {

                Double I_charged1 = Double.parseDouble(I_charged);
                Double Initial_v = Double.parseDouble(I_amount);

                ObservableList<PieChart.Data> pieChartData =
                        FXCollections.observableArrayList(
                                new PieChart.Data("Initial value", Initial_v),
                                new PieChart.Data("Interest Payed", I_charged1));
                final PieChart chart = new PieChart(pieChartData);
                chart.setTitle("PieChart");

                chart.setLabelLineLength(10);
                chart.setLegendSide(Side.LEFT);


                c_ap4.getChildren().add(chart);
            }


        });
        //Once button has been pressed, the content on the text fields will be cleared.
        c_btn2.setOnAction(actionEvent ->{
            c_tf1.clear();
            c_tf2.clear();
            c_tf3.clear();
            c_tf4.clear();
            c_tf5.clear();
        });
        // opens compounding view and closes Loan view.
        Compound_b.setOnAction(actionEvent ->{
            CompoundInterest.Compounding();
            stage1.close();
        });
        // opens saving view and closes Loan view.
        Saving_b.setOnAction(actionEvent ->{
            Saving.saved();
            stage1.close();
        });
        // opens mortgage view and closes Loan view.
        Mortgage_b.setOnAction(actionEvent ->{
            Mortgage.Mortgaging();
            stage1.close();
        });

        stage1.show();


    }
}
