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


public class Main extends Application{
    public static void main(String[] args) {
        System.out.print("Moin Leute");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        ObservableList box_list = vbox.getChildren();

        Label Celsius = new Label("Grad Celsius");
        TextField field1 = new TextField();
        Label Fahrenheit = new Label("Grad Fahrenheit");
        TextField field2 = new TextField();
        box_list.add(Celsius);
        box_list.add(field1);
        box_list.add(Fahrenheit);
        box_list.add(field2);

        Button b1 = new Button("Convert C --> F");
        Button b2 = new Button("Convert F --> C");
        box_list.add(b1);
        box_list.add(b2);

        EventHandler handler1 = new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        };
        EventHandler handler2 = new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        };
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED,handler1);
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED,handler2);

        Scene scene = new Scene(vbox,200,200, Color.ORANGE);
        stage.setScene(scene);
        stage.setTitle("Temp.Converter");
        stage.show();
    }
}
