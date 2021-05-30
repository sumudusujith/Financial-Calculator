package CalP2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Cal4 extends Application {


    @Override
    public void start(Stage mortStage) throws Exception {
        GridPane Gp1 = new GridPane();
        Gp1.setStyle("-fx-background-color:#4d4d00");
        Gp1.setHgap(30);
        Gp1.setVgap(25);

        File fifd4 = new File("filfd4.txt");

        Label LabelMortageamount = new Label("Mortage Amount:");
        LabelMortageamount.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelDownpayment = new Label("Down Payment:");
        LabelDownpayment.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelIntrestRate = new Label("Intrest Rate:");
        LabelIntrestRate.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelPeriod = new Label("Period:");
        LabelPeriod.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelMonthlyaddition = new Label("Monthly Addition:");
        LabelMonthlyaddition.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");


        TextField TextFieldMortageamount = new TextField();
        TextField TextFieldDownpayment = new TextField();
        TextField TextFieldIntrestRate = new TextField();
        TextField TextFieldPeriod = new TextField();
        TextField TextFieldMonthlyaddition = new TextField();



        Button btnCalculate = new Button("Calculate");
        btnCalculate.setPrefHeight(50);
        btnCalculate.setPrefWidth(100);
        btnCalculate.setStyle("-fx-background-color: #0f1f3d;-fx-background-radius: 5em;-fx-text-fill:white;-fx-font-weight: bold;");


        Button btnBack = new Button("Back");
        btnBack.setPrefWidth(90);
        btnBack.setStyle("-fx-background-color: #660000;-fx-background-radius: 5em;-fx-text-fill:white;-fx-font-weight: bold;");


        Button btnHelp = new Button("Help");
        btnHelp.setPrefWidth(90);
        btnHelp.setStyle("-fx-background-color: #660000;-fx-background-radius: 5em;-fx-text-fill:white;-fx-font-weight: bold;");
        btnHelp.setOnAction(e -> Help.helpinstructions("Help", "*Instructions------------------------.\n"+
                "\n"+"*To use this calculator,Allusers have to do is leave the textfield of what you want to calculate empty and fill the other values for the rest. (eg)- if you are going to calculate the fixed deposit future value,the you have to enter principle amount," +
                "intrest rate and period.And "+" \n" + " \n" + " leave the future value field empty. **(eg)- 10% = 10.. \n" +
                " \n" + "Period should be entered in years. (eg)- 2years= 2   ,   6months=0.5.."+ " \n" + " \n " +"*User can view the calculation history by clicking 'history' button.. " +
                "*User Can go back to home menu by clicking 'Back' Button. " +
                " \n" + " \n" +
                "Before do a new calculation make sure to clear the text fields by clicking 'C' button"));

        Button btnHistory = new Button("History");
        btnHistory.setPrefWidth(90);
        btnHistory.setStyle("-fx-background-color: #660000;-fx-background-radius: 5em;-fx-text-fill:white;-fx-font-weight: bold;");

        btnHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stagem = new Stage();
                GridPane gpp=new GridPane();
                ScrollPane sp1=new ScrollPane();
                TextArea tetinp = new TextArea();
                tetinp.setPrefWidth(650);
                tetinp.setPrefHeight(550);
                tetinp.setStyle("-fx-display-caret: false;");
                gpp.getChildren().addAll(tetinp);
                sp1.setContent(gpp);
                Scene scenem = new Scene(sp1, 650, 550);
                stagem.setScene(scenem);
                stagem.setTitle("History Records");
                stagem.show();
                try {
                    File fmm01 = new File("filfd4.txt");
                    Scanner mread = new Scanner(fmm01);
                    while ((mread.hasNextLine())) {
                        String mdate = mread.nextLine();
                        tetinp.appendText(mdate);
                        tetinp.appendText("\n");
                    }
                } catch (Exception e) {
                    System.out.println("History Not found.");


                }
            }
        });





        TextFieldMortageamount.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldMortageamount, Gp1);

            }
        });

        TextFieldDownpayment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldDownpayment, Gp1);

            }
        });

        TextFieldIntrestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldIntrestRate, Gp1);

            }
        });


        TextFieldPeriod.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldPeriod, Gp1);

            }
        });

        TextFieldMonthlyaddition.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldMonthlyaddition, Gp1);

            }
        });



        Gp1.add(LabelMortageamount, 1, 1);
        Gp1.add(TextFieldMortageamount, 2, 1);

        Gp1.add(LabelDownpayment, 1, 2);
        Gp1.add(TextFieldDownpayment, 2, 2);

        Gp1.add(LabelIntrestRate, 1, 3);
        Gp1.add(TextFieldIntrestRate, 2, 3);

        Gp1.add(LabelMonthlyaddition, 1, 4);
        Gp1.add(TextFieldMonthlyaddition, 2, 4);

        Gp1.add(LabelPeriod, 1, 5);
        Gp1.add(TextFieldPeriod, 2, 5);


        Gp1.add(btnCalculate, 2, 6);
        Gp1.add(btnHelp, 1, 8);
        Gp1.add(btnBack, 2, 8);
        Gp1.add(btnHistory, 3, 8);



        mortStage.setTitle("Mortgage");
        Scene scene = new Scene(Gp1, 990, 590);
        mortStage.setScene(scene);
        mortStage.show();

        TextFieldMortageamount.setText("");
        TextFieldMortageamount.setText("");
        TextFieldIntrestRate.setText("");
        TextFieldPeriod.setText("");
        TextFieldMonthlyaddition.setText("");

        btnBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Home home = new Home();
                Stage h1 = new Stage();
                try {
                    home.start(h1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                h1.show();
                mortStage.close();
            }
        });


        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (TextFieldMonthlyaddition.getText().equals("")) {
                    double p = Double.parseDouble(TextFieldMortageamount.getText());
                    double d = Double.parseDouble(TextFieldDownpayment.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double n = 12;

                    double f0 = r/100.00;
                    double f1 = p - d;
                    double f2 = Math.pow(1 + (f0 / n ),( t * n));
                    double f3 = f1 * (f0 / n);
                    double f4 = f2 * f3;
                    double f6 = f2 - 1;
                    double f7 = f4 / f6;
                    double f8=(f7 *100.0)/100.0;
                    TextFieldMonthlyaddition.setText(String.format("%.2f",f8));

                    PrintWriter pm1;
                    FileWriter fm1;
                    try {
                        fm1 = new FileWriter(fifd4, true);
                        pm1 = new PrintWriter(fm1, true);
                        pm1.println("Mortgage amount :" + p);
                        pm1.println("Down Payment :" + d);
                        pm1.println("Intrest Rate :" + r);
                        pm1.println("Period :" + t);
                        pm1.println("Monthly addition :" + f8);
                        pm1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }

                } else if (TextFieldPeriod.getText().equals("")) {
                    double p = Double.parseDouble(TextFieldMortageamount.getText());
                    double d = Double.parseDouble(TextFieldDownpayment.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double m = Double.parseDouble(TextFieldMonthlyaddition.getText());
                    double n = 12;

                    double f0 = r/100.00;
                    double f10 = f0/n;
                    double f1 = p -d ;
                    double f2 = m /  f10;
                    double f3 = f2- f1;
                    double f4 = f2 / f3;
                    double f5 = Math.log(f4);

                    double f6 = 1 +  f10;
                    double f7 = Math.log(f6);
                    double f8 = f5 / f7;
                    double f9 = f8/ n;
                    TextFieldPeriod.setText(String.format("%.2f",f9));

                    PrintWriter pm1;
                    FileWriter fm1;
                    try {
                        fm1 = new FileWriter(fifd4, true);
                        pm1 = new PrintWriter(fm1, true);
                        pm1.println("Mortgage amount :" + p);
                        pm1.println("Down Payment :" + d);
                        pm1.println("Intrest Rate :" + r);
                        pm1.println("Monthly addition :" + m);
                        pm1.println("Period :" + f9);
                        pm1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }
                }
            }
        });
    }
}

