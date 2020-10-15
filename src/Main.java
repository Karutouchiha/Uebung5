import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.Format;


public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        ObservableList box_list = vbox.getChildren();
        String style = new String("-fx-font-size:20;-fx-font-weight: bold");
        Label Celsius = new Label("Grad Celsius");
        Celsius.setStyle(style);
        TextField field1 = new TextField();
        field1.setStyle(style);
        Label Fahrenheit = new Label("Grad Fahrenheit");
        Fahrenheit.setStyle(style);
        TextField field2 = new TextField();
        field2.setStyle(style);
        box_list.add(Celsius);
        box_list.add(field1);
        box_list.add(Fahrenheit);
        box_list.add(field2);

        Button b1 = new Button("Convert C --> F");
        Button b2 = new Button("Convert F --> C");
        b1.setStyle(style);
        b2.setStyle(style);
        box_list.add(b1);
        box_list.add(b2);

        EventHandler handler1 = new EventHandler() {
            @Override
            public void handle(Event event) {
                //Celsius in Fahrenheit 32+5*1,8
                int c = Integer.parseInt(field1.getText());
                field2.setText(Double.toString(32+c*1.8));
            }
        };
        EventHandler handler2 = new EventHandler() {
            @Override
            public void handle(Event event) {
                //Fahrenheit in Celsius -17.8+5*1,8
                DecimalFormat form = new DecimalFormat("#0.00");
                int f =Integer.parseInt(field2.getText());
                field1.setText(form.format((f-32)/1.8));
            }
        };
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED,handler1);
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED,handler2);

        Scene scene = new Scene(vbox,240,240, Color.ORANGE);
        stage.setScene(scene);
        stage.setTitle("Temp.Converter");
        stage.show();
    }
}
