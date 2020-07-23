package view;

import com.jfoenix.controls.JFXButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MessageView extends GridPane
{
    private Stage stage;

    public MessageView(String message)
    {
        Label label = new Label();
        label.setTextFill(Color.BLACK);
        label.setText(message);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(label);

        this.add(borderPane,0,0);
        this.setPrefSize(380, 200);
        this.setAlignment(Pos.CENTER);
        this.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        this.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        stage = new Stage();
        stage.setScene(new Scene(this));
    }

    public Stage getStage()
    {
        return stage;
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

}

