package CalP2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Home extends Application {
     @Override

     public void start(Stage primaryStage) throws Exception {
         GridPane Gp2=new GridPane();
         Gp2.setHgap(10);
         Gp2.setVgap(30);


         Button btnfd = new Button();
         btnfd.setText(" Fixed Deposit");
         btnfd.setPrefHeight(200);
         btnfd.setPrefWidth(200);
         btnfd.setStyle("-fx-background-color: #24478f;-fx-font: 18 verdana; -fx-text-fill:white;-fx-font-weight: bold;");


         btnfd.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 Cal1 Cal=new Cal1();
                 Stage fdstage=new Stage();
                 try {
                     Cal.start(fdstage);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 fdstage.show();
                 primaryStage.close();
             }
         });


         Button btnsave = new Button();
         btnsave.setText(" Savings");
         btnsave.setPrefHeight(200);
         btnsave.setPrefWidth(200);
         btnsave.setStyle("-fx-background-color: #004d00;-fx-font: 18 verdana; -fx-text-fill:white;-fx-font-weight: bold;");


         btnsave.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 Cal2 Cals=new Cal2();
                 Stage savstage=new Stage();
                 try {
                     Cals.start(savstage);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 savstage.show();
                 primaryStage.close();
             }
         });


         Button btnloan = new Button();
         btnloan.setText(" Loans");
         btnloan.setPrefHeight(200);
         btnloan.setPrefWidth(200);
         btnloan.setStyle("-fx-background-color: #4d0000;-fx-font: 18 verdana; -fx-text-fill:white;-fx-font-weight: bold;");


         btnloan.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 Cal3 Callo=new Cal3();
                 Stage lostage=new Stage();
                 try {
                     Callo.start(lostage);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 lostage.show();
                 primaryStage.close();
             }
         });



         Button btnmort = new Button();
         btnmort.setText(" Mortgage");
         btnmort.setPrefHeight(200);
         btnmort.setPrefWidth(200);
         btnmort.setStyle("-fx-background-color: #4d4d00;-fx-font: 18 verdana; -fx-text-fill:white;-fx-font-weight: bold;");



         btnmort.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 Cal4 Calm=new Cal4();
                 Stage mortstage=new Stage();
                 try {
                     Calm.start(mortstage);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 mortstage.show();
                 primaryStage.close();
             }
         });


         Gp2.add(btnfd,9,1);
         Gp2.add(btnsave,13,1);
         Gp2.add(btnloan,9,4);
         Gp2.add(btnmort,13,4);


     Scene s1=new Scene(Gp2,650,600);
     primaryStage.setScene(s1);
     primaryStage.setTitle("Home Menu");
     primaryStage.show();

     }
    public static void main(String[] args) {
        launch(args);
    }
 }
