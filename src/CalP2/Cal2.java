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


public class Cal2 extends Application {


    @Override
    public void start(Stage saveStage) throws Exception {
        GridPane Gp1 = new GridPane();
        Gp1.setStyle("-fx-background-color: #004d00");
        Gp1.setHgap(30);
        Gp1.setVgap(25);

        File fifd2 = new File("filfd2.txt");

        Label LabelPrincipaleAmount = new Label("Principle Amount:");
        LabelPrincipaleAmount.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelIntrestRate = new Label("Intrest Rate:");
        LabelIntrestRate.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelPeriod = new Label("Period:");
        LabelPeriod.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelMonthlyaddition = new Label("Monthly Addition:");
        LabelMonthlyaddition.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelFutureValue = new Label("Future Value:");
        LabelFutureValue.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");



        TextField TextFieldPrincipaleAmount = new TextField();
        TextField TextFieldIntrestRate = new TextField();
        TextField TextFieldPeriod = new TextField();
        TextField TextFieldMonthlyaddition = new TextField();
        TextField TextFieldFutureValue = new TextField();


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
                Stage stages = new Stage();
                GridPane gpp=new GridPane();
                ScrollPane sp1=new ScrollPane();
                TextArea tetinp = new TextArea();
                tetinp.setPrefWidth(650);
                tetinp.setPrefHeight(550);
                tetinp.setStyle("-fx-display-caret: false;");
                gpp.getChildren().addAll(tetinp);
                sp1.setContent(gpp);
                Scene scenes = new Scene(sp1, 650, 550);
                stages.setScene(scenes);
                stages.setTitle("History Records");
                stages.show();
                try {
                    File fss02 = new File("filfd2.txt");
                    Scanner sread = new Scanner(fss02);
                    while ((sread.hasNextLine())) {
                        String sdate = sread.nextLine();
                        tetinp.appendText(sdate);
                        tetinp.appendText("\n");
                    }
                } catch (Exception e) {
                    System.out.println("History Not found.");


                }
            }
        });



        TextFieldPrincipaleAmount.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldPrincipaleAmount, Gp1);

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

        TextFieldFutureValue.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Keyboard.clickTextField(TextFieldFutureValue, Gp1);

            }
        });


        Gp1.add(LabelPrincipaleAmount, 1, 1);
        Gp1.add(TextFieldPrincipaleAmount, 2, 1);

        Gp1.add(LabelIntrestRate, 1, 2);
        Gp1.add(TextFieldIntrestRate, 2, 2);

        Gp1.add(LabelPeriod, 1, 3);
        Gp1.add(TextFieldPeriod, 2, 3);

        Gp1.add(LabelMonthlyaddition, 1, 4);
        Gp1.add(TextFieldMonthlyaddition, 2, 4);

        Gp1.add(LabelFutureValue, 1, 5);
        Gp1.add(TextFieldFutureValue, 2, 5);

        Gp1.add(btnCalculate, 2, 6);
        Gp1.add(btnHelp, 1, 7);
        Gp1.add(btnBack, 2, 7);
        Gp1.add(btnHistory, 3, 7);


        saveStage.setTitle("Savings");
        Scene scene = new Scene(Gp1, 990, 550);
        saveStage.setScene(scene);
        saveStage.show();

        TextFieldPrincipaleAmount.setText("");
        TextFieldIntrestRate.setText("");
        TextFieldPeriod.setText("");
        TextFieldMonthlyaddition.setText("");
        TextFieldFutureValue.setText("");

        btnBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Home home = new Home();
                Stage h2 = new Stage();
                try {
                    home.start(h2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                h2.show();
                saveStage.close();
            }
        });


        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (TextFieldFutureValue.getText().equals("")) {
                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double m = Double.parseDouble(TextFieldMonthlyaddition.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double n = 12;

                    double f1 = r / 100.00;
                    double f2 = f1 / n;
                    double f3 = 1 + f2;
                    double f4 = n * t;
                    double f5 = p* Math.pow(f3,f4);
                    double f6 = Math.pow(f3,f4)-1;
                    double f7 = f6/f2;
                    double f8 = m * f7;
                    double f9 = f5 + f8;
                    double f10 =(f9*100.00)/100.00;
                    TextFieldFutureValue.setText(String.format("%.2f",f10));

                    PrintWriter ps1;
                    FileWriter fs1;
                    try {
                        fs1 = new FileWriter(fifd2, true);
                        ps1 = new PrintWriter(fs1, true);
                        ps1.println("Principle amount :" + p);
                        ps1.println("Intrest Rate :" + r);
                        ps1.println("Period :" + t);
                        ps1.println("Monthly addition :" + m);
                        ps1.println("Future Value :" + f10);
                        ps1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }


                } else if (TextFieldPeriod.getText().equals("")) {
                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double m = Double.parseDouble(TextFieldMonthlyaddition.getText());
                    double a = Double.parseDouble(TextFieldFutureValue.getText());
                    double n = 12;

                    double f0 = r / 100.00;
                    double f1 = f0 / 12;
                    double f2 = a * f1;
                    double f3 = f2 + m;
                    double f4 = p * f1;
                    double f5 = f4 + m;
                    double f6 = f3 / f5;
                    double f7 = Math.log(f6);
                    double f8 = 1 + f1;
                    double f9 = Math.log(f8);
                    double f10 = f7 / f9;
                    double f11 = f10 / n;
                    double f12 =(f11 * 100.0) / 100.0;
                    TextFieldPeriod.setText(String.format("%.1f",f12));

                    PrintWriter ps1;
                    FileWriter fs1;
                    try {
                        fs1 = new FileWriter(fifd2, true);
                        ps1 = new PrintWriter(fs1, true);
                        ps1.println("Principle amount :" + p);
                        ps1.println("Intrest Rate :" + r);
                        ps1.println("Monthly addition :" + m);
                        ps1.println("Future Value :" + a);
                        ps1.println("Period :" + f12);
                        ps1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }


                } else if (TextFieldMonthlyaddition.getText().equals("")) {

                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double a = Double.parseDouble(TextFieldFutureValue.getText());
                    double n = 12;

                    double f0 = r / 100.00;
                    double f1 = f0 / n;
                    double f2 = 1 + f1;
                    double f3 = n * t;
                    double f4 = Math.pow(f2, f3);
                    double f5 = f4 - 1;
                    double f6 = f5 / f1;
                    double f7 = p * f4;
                    double f8 = a - f7;
                    double f9 = f8 / f6;
                    double f10 =(f9 * 100.0) / 100.0;

                    TextFieldMonthlyaddition.setText(String.format("%.2f",f10));

                    PrintWriter ps1;
                    FileWriter fs1;
                    try {
                        fs1 = new FileWriter(fifd2, true);
                        ps1 = new PrintWriter(fs1, true);
                        ps1.println("Principle amount :" + p);
                        ps1.println("Intrest Rate :" + r);
                        ps1.println("Period :" + t);
                        ps1.println("Future Value :" + a);
                        ps1.println("Monthly addition :" + f10);
                        ps1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }


                }

            }
        });

    }
}

