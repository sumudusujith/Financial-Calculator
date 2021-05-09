package CalP2;


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
                 Cal1 Cal=new Cal1();
Cal1 Cal=new Cal1();
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