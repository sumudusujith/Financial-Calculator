package CalP2;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Help { //help is a method nad it contain help block of code which only runs when it is called

    public static void helpinstructions(String HELP, String message) { //string is a Variable. its for storing data values text.
        Stage hel = new Stage();
        hel.initModality(Modality.APPLICATION_MODAL);
        hel.setTitle(HELP);
        hel.setMinWidth(600);
        hel.setMinHeight(600);

        Label labelh1 = new Label();
        labelh1.setText(message);
        Button btclose = new Button("Close");
        btclose.setPrefHeight(30);
        btclose.setPrefWidth(65);
        btclose.setStyle("-fx-background-color: #990000;-fx-background-radius: 5em;-fx-text-fill:white;-fx-font-weight: bold;");
        btclose.setOnAction(e -> hel.close());

        VBox layouth1 = new VBox(12);//VBox lays out its children in a single vertical column.
        layouth1.setStyle("-fx-background-color: navajowhite");
        layouth1.getChildren().addAll(labelh1,btclose);
        layouth1.setAlignment(Pos.CENTER);

        Scene schelp = new Scene(layouth1);
        hel.setScene(schelp);
        hel.showAndWait();
    }
}
