package view;

import com.jfoenix.controls.JFXButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AirportView
{
    private Stage stage;
    private JFXButton jfxButton;
    private JFXButton jfxButton2;
    private ChoiceBox <String> choiceBox;

    public AirportView()
    {
        jfxButton = new JFXButton();
        jfxButton.setText("Ok");
        jfxButton.setPrefSize(95,25);
        jfxButton.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton.setTextFill(Color.BLACK);
        jfxButton2 = new JFXButton();
        jfxButton2.setText("Exit And Save Program");
        jfxButton2.setPrefSize(190,25);
        jfxButton2.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton2.setTextFill(Color.BLACK);

        choiceBox = new ChoiceBox<String>();
        choiceBox.setValue("");
        choiceBox.getItems().add("Manager Or Super Admin");
        choiceBox.getItems().add("Employee");
        choiceBox.getItems().add("Passenger");

        Label label = new Label();
        label.setTextFill(Color.BLACK);
        label.setText("Please select your role!");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(label);
        borderPane.setPrefSize(520,90);
        BorderPane borderPane2 = new BorderPane();
        borderPane2.setCenter(choiceBox);
        borderPane2.setPrefSize(520,90);
        BorderPane borderPane3 = new BorderPane();
        borderPane3.setPrefSize(520,90);
        BorderPane borderPane4 = new BorderPane();
        borderPane4.setCenter(jfxButton);
        BorderPane borderPane5 = new BorderPane();
        borderPane5.setCenter(jfxButton2);
        borderPane3.setRight(borderPane4);
        borderPane3.setLeft(borderPane5);

        GridPane gridPane = new GridPane();
        gridPane.add(borderPane,0,0);
        gridPane.add(borderPane2,0,1);
        gridPane.add(borderPane3,0,2);
        gridPane.setPrefSize(570,270);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        stage = new Stage();
        stage.setScene(new Scene(gridPane));
        stage.setTitle("Airport Menu");
        stage.setMinWidth(570);
        stage.setMinHeight(270);
    }

    public Stage getStage()
    {
        return stage;
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    public JFXButton getJfxButton()
    {
        return jfxButton;
    }

    public void setJfxButton(JFXButton jfxButton)
    {
        this.jfxButton = jfxButton;
    }

    public JFXButton getJfxButton2()
    {
        return jfxButton2;
    }

    public void setJfxButton2(JFXButton jfxButton2)
    {
        this.jfxButton2 = jfxButton2;
    }

    public ChoiceBox<String> getChoiceBox()
    {
        return choiceBox;
    }

    public void setChoiceBox(ChoiceBox<String> choiceBox)
    {
        this.choiceBox = choiceBox;
    }
}
