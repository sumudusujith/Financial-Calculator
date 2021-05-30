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


public class Cal1 extends Application {


    @Override
    public void start(Stage FDStage) throws Exception {   //The @throws and @exception tags are synonyms **void  means that this method does not have a return value
        GridPane Gp1 = new GridPane();
        Gp1.setStyle("-fx-background-color:#24478f");
        Gp1.setHgap(30);
        Gp1.setVgap(25);

        File fifd1 = new File("filfd1.txt"); //this is for record history

//-----------fixed deposit labels--------//
        Label LabelPrincipaleAmount = new Label("Principle Amount:");
        LabelPrincipaleAmount.setStyle("-fx-font: 22 verdana; -fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelIntrestRate = new Label("Intrest Rate:");
        LabelIntrestRate.setStyle("-fx-font: 22 verdana; -fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelPeriod = new Label("Period:");
        LabelPeriod.setStyle("-fx-font: 22 verdana; -fx-text-fill:white;-fx-font-weight: bold;");
        Label LabelFutureValue = new Label("Future Value:");
        LabelFutureValue.setStyle("-fx-font: 22 verdana;-fx-text-fill:white;-fx-font-weight: bold;");

        //-----------fixed deposit textfields--------//

        TextField TextFieldPrincipaleAmount = new TextField();
        TextField TextFieldIntrestRate = new TextField();
        TextField TextFieldPeriod = new TextField();
        TextField TextFieldFutureValue = new TextField();

        //-----------fixed deposit buttons--------//

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
        //-----------Help button instructions--------//
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
                Stage stagef = new Stage();
                GridPane gpp=new GridPane();
                ScrollPane sp1=new ScrollPane();
                TextArea tetinp = new TextArea();
                tetinp.setPrefWidth(650);
                tetinp.setPrefHeight(550);
                tetinp.setStyle("-fx-display-caret: false;");
                gpp.getChildren().addAll(tetinp);
                sp1.setContent(gpp);
                Scene scenef = new Scene(sp1, 650, 550);
                stagef.setScene(scenef);
                stagef.setTitle("History Records");
                stagef.show();
                try {
                    File fff01 = new File("filfd1.txt");
                    Scanner fread = new Scanner(fff01);
                    while ((fread.hasNextLine())) {
                        String fdate = fread.nextLine();
                        tetinp.appendText(fdate);
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

        Gp1.add(LabelFutureValue, 1, 4);
        Gp1.add(TextFieldFutureValue, 2, 4);

        Gp1.add(btnCalculate, 2, 5);
        Gp1.add(btnHelp, 1, 7);
        Gp1.add(btnBack, 2, 7);
        Gp1.add(btnHistory, 3, 7);


        FDStage.setTitle("Fixed Deposit");
        Scene scene = new Scene(Gp1, 990, 550);
        FDStage.setScene(scene);
        FDStage.show();

        TextFieldPrincipaleAmount.setText("");
        TextFieldIntrestRate.setText("");
        TextFieldPeriod.setText("");
        TextFieldFutureValue.setText("");

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
                FDStage.close();
            }
        });
//....Calculations.....//

        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (TextFieldFutureValue.getText().equals("")) {
                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double n = 12;

                    double f1 = r / 100.00;
                    double f2 = f1 / n;
                    double f3 = 1 + f2;
                    double f4 = n * t;
                    double f5 = p * Math.pow(f3, f4);
                    TextFieldFutureValue.setText(String.format("%.2f", f5));


                    PrintWriter pf1;
                    FileWriter ff1;
                    try {
                        ff1 = new FileWriter(fifd1, true);
                        pf1 = new PrintWriter(ff1, true);
                        pf1.println("Principle amount :" + p);
                        pf1.println("Intrest Rate :" + r);
                        pf1.println("Period :" + t);
                        pf1.println("Future Value :" + f5);
                        pf1.println("...............");

                    } catch (IOException e) { //method is enclosed in a try...catch block. This is necessary because it throws an IOException
                        System.out.println("Input Error");
                    }

                } else if (TextFieldPrincipaleAmount.getText().equals("")) {
                    double a = Double.parseDouble(TextFieldFutureValue.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double n = 12;

                    double f1 = r / 100.00;
                    double f2 = f1 / n;
                    double f3 = 1 + f2;
                    double f4 = n * t;
                    double f5 = a / Math.pow(f3, f4);
                    TextFieldPrincipaleAmount.setText(String.format("%.2f",f5));

                    PrintWriter pf1;
                    FileWriter ff1;
                    try {
                        ff1 = new FileWriter(fifd1, true);
                        pf1 = new PrintWriter(ff1, true);
                        pf1.println("FutureValue :" + a);
                        pf1.println("Intrest Rate :" + r);
                        pf1.println("Period :" + t);
                        pf1.println("Principle amount :" + f5);
                        pf1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }

                } else if (TextFieldIntrestRate.getText().equals("")) {
                    double a = Double.parseDouble(TextFieldFutureValue.getText());
                    double t = Double.parseDouble(TextFieldPeriod.getText());
                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double n = 12;

                    double f0 = a / p;
                    double f1 = n * t;
                    double f2 = 1 / f1;
                    double f3 = Math.pow(f0, f2);
                    double f4 = f3 - 1;
                    double f5 = n * f4;
                    double f6 = f5 * 100;
                    double f7 = Math.round(f6 * 100.0) / 100.0;
                    TextFieldIntrestRate.setText(String.format("%.2f",f7));

                    PrintWriter pf1;
                    FileWriter ff1;
                    try {
                        ff1 = new FileWriter(fifd1, true);
                        pf1 = new PrintWriter(ff1, true);
                        pf1.println("Principle amount :" + p);
                        pf1.println("Period :" + t);
                        pf1.println("FutureValue :" + a);
                        pf1.println("Intrest Rate :" + f7);
                        pf1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                    }
                } else if (TextFieldPeriod.getText().equals("")) {
                    double a = Double.parseDouble(TextFieldFutureValue.getText());
                    double p = Double.parseDouble(TextFieldPrincipaleAmount.getText());
                    double r = Double.parseDouble(TextFieldIntrestRate.getText());
                    double n = 12;

                    double f1 = r / 100.00;
                    double f2 = a / p;
                    double f3 = Math.log(f2);
                    double f4 = f1 / n;
                    double f5 = 1 + f4;
                    double f6 = Math.log(f5);
                    double f7 = n * f6;
                    double f8 = f3 / f7;

                    TextFieldPeriod.setText(String.format("%.1f",f8));

                    PrintWriter pf1;
                    FileWriter ff1;
                    try {
                        ff1 = new FileWriter(fifd1, true);
                        pf1 = new PrintWriter(ff1, true);
                        pf1.println("Principle amount :" + p);
                        pf1.println("Intrest Rate :" + r);
                        pf1.println("Future Value :" + a);
                        pf1.println("Period :" + f8);
                        pf1.println("...............");

                    } catch (IOException e) {
                        System.out.println("Input Error");
                   }
                }

            }
        });

    }
}

