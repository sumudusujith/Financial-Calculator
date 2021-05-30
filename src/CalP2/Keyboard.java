package CalP2;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Keyboard  {


    public static void clickTextField (TextField tf, GridPane gp1) {


        Button btn1 = new Button("1");
        btn1.setPrefHeight(60);
        btn1.setPrefWidth(60);
        btn1.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn2 = new Button("2");
        btn2.setPrefHeight(60);
        btn2.setPrefWidth(60);
        btn2.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn3 = new Button("3");
        btn3.setPrefHeight(60);
        btn3.setPrefWidth(60);
        btn3.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn4 = new Button("4");
        btn4.setPrefHeight(60);
        btn4.setPrefWidth(60);
        btn4.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");

        Button btn5 = new Button("5");
        btn5.setPrefHeight(60);
        btn5.setPrefWidth(60);
        btn5.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn6 = new Button("6");
        btn6.setPrefHeight(60);
        btn6.setPrefWidth(60);
        btn6.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn7 = new Button("7");
        btn7.setPrefHeight(60);
        btn7.setPrefWidth(60);
        btn7.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        Button btn8 = new Button("8");
        btn8.setPrefHeight(60);
        btn8.setPrefWidth(60);
        btn8.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");

        Button btn9 = new Button("9");
        btn9.setPrefHeight(60);
        btn9.setPrefWidth(60);
        btn9.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white"); //add colors and styles for button

        Button btnDot = new Button(".");
        btnDot.setPrefHeight(60);
        btnDot.setPrefWidth(60);
        btnDot.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");

        Button btn0 = new Button("0");
        btn0.setPrefHeight(60);
        btn0.setPrefWidth(60);
        btn0.setStyle("-fx-background-color: #660066;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");

        Button btnC=new Button("C");
        btnC.setPrefHeight(60);
        btnC.setPrefWidth(60);
        btnC.setStyle("-fx-background-color: #ff8080;-fx-font: 25 arial;-fx-font-weight: bold;-fx-text-fill:white");


        btn1.setOnAction(event -> tf.appendText("1"));
        btn2.setOnAction(event -> tf.appendText("2"));
        btn3.setOnAction(event -> tf.appendText("3"));
        btn4.setOnAction(event -> tf.appendText("4"));
        btn5.setOnAction(event -> tf.appendText("5"));
        btn6.setOnAction(event -> tf.appendText("6"));
        btn7.setOnAction(event -> tf.appendText("7"));
        btn8.setOnAction(event ->tf.appendText("8"));
        btn9.setOnAction(event -> tf.appendText("9"));
        btnDot.setOnAction(event -> tf.appendText("."));
        btn0.setOnAction(event -> tf.appendText("0"));
        btnC.setOnAction(event -> tf.setText(""));

        gp1.add(btn1,7,1);
        gp1.add(btn2,8,1);
        gp1.add(btn3,9,1);

        gp1.add(btn4,7,2);
        gp1.add(btn5,8,2);
        gp1.add(btn6,9,2);

        gp1.add(btn7,7,3);
        gp1.add(btn8,8,3);
        gp1.add(btn9,9,3);

        gp1.add(btnDot,7,4);
        gp1.add(btn0,8,4);
        gp1.add(btnC,9,4);
    }
}


