package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * Created by intelisoft on 06.07.2016.
 */
public class MainView implements View {

    @Override
    public Pane getPane() {
        Pane pane = new VBox();
        Label label = new Label();
        TextField field = new TextField();
        Button button = new Button("Show");
        button.setOnAction(e -> label.setText(field.getText()));
        pane.getChildren().setAll(label,field,button);
        return pane;
    }

}
