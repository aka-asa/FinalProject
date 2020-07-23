package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.FlightModel;
import model.PassengerModel;
import model.PersonModel;

import java.time.LocalDateTime;

public class PassengerView
{
    private Stage stage;
    private JFXTextField jfxTextField;
    private JFXTextField jfxTextField2;
    private JFXTextField jfxTextField3;
    private JFXTextField jfxTextField4;
    private JFXTextField jfxTextField5;
    private JFXTextField jfxTextField6;
    private JFXTextField jfxTextField7;
    private JFXTextField jfxTextField8;
    private JFXTextField jfxTextField9;
    private JFXTextField jfxTextField10;
    private JFXTextField jfxTextField11;
    private JFXTextField jfxTextField12;
    private JFXPasswordField jfxPasswordField;
    private JFXPasswordField jfxPasswordField2;
    private JFXPasswordField jfxPasswordField3;
    private JFXPasswordField jfxPasswordField4;
    private JFXPasswordField jfxPasswordField5;
    private JFXPasswordField jfxPasswordField6;
    private JFXButton jfxButton;
    private JFXButton jfxButton2;
    private JFXButton jfxButton3;
    private JFXButton jfxButton4;
    private JFXButton jfxButton5;
    private JFXButton jfxButton6;
    private JFXButton jfxButton7;
    private JFXButton jfxButton8;
    private JFXButton jfxButton9;
    private JFXButton jfxButton10;
    private JFXButton jfxButton11;
    private JFXButton jfxButton12;
    private JFXButton jfxButton13;
    private Label label9;
    private ChoiceBox <String> choiceBox;
    private Scene registrationScene;
    private Scene editAllScene;
    private Scene loginScene;
    private Scene showPassengersScene;
    private Scene mainMenuScene;
    private Scene changePasswordScene;
    private Scene chargeScene;

    public PassengerView()
    {
//show passengers
        TableView <PassengerModel> tableView = new TableView<PassengerModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("id"));

        TableColumn tableColumn2 = new TableColumn("Name");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("name"));

        TableColumn tableColumn3 = new TableColumn("Last Name");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("lastName"));

        TableColumn tableColumn4 = new TableColumn("Username");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<PassengerModel, String>("username"));

        TableColumn tableColumn5 = new TableColumn("Password");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("password"));

        TableColumn tableColumn6 = new TableColumn("Email");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("email"));

        TableColumn tableColumn7 = new TableColumn("Phone Number");
        tableColumn7.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("phoneNumber"));

        TableColumn tableColumn8 = new TableColumn("Credit");
        tableColumn8.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("credit"));

        for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
        {
            tableView.getItems().add(PassengerModel.getPassengers().get(i));
        }

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3,tableColumn4,tableColumn5,tableColumn6,tableColumn7,tableColumn8);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        BorderPane borderPane31 = new BorderPane();
        borderPane31.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        borderPane31.setCenter(tableView);
        borderPane31.setPrefSize(600,400);

        showPassengersScene = new Scene(borderPane31);

//login menu
        jfxTextField11 = new JFXTextField();
        jfxTextField11.setPromptText("ID");
        jfxTextField11.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField5 = new JFXPasswordField();
        jfxPasswordField5.setPromptText("Password");
        jfxPasswordField5.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxButton5 = new JFXButton();
        jfxButton5.setText("Enter");
        jfxButton5.setPrefSize(95,25);
        jfxButton5.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton5.setTextFill(Color.BLACK);
        jfxButton6 = new JFXButton();
        jfxButton6.setText("Register");
        jfxButton6.setPrefSize(95,25);
        jfxButton6.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton6.setTextFill(Color.BLACK);
        jfxButton7 = new JFXButton();
        jfxButton7.setText("Back");
        jfxButton7.setPrefSize(95,25);
        jfxButton7.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton7.setTextFill(Color.BLACK);

        BorderPane borderPane25 = new BorderPane();
        borderPane25.setCenter(jfxTextField11);
        borderPane25.setPrefSize(600,60);
        BorderPane borderPane26 = new BorderPane();
        borderPane26.setCenter(jfxPasswordField5);
        borderPane26.setPrefSize(600,60);
        BorderPane borderPane27 = new BorderPane();
        borderPane27.setPrefSize(600,60);
        BorderPane borderPane28 = new BorderPane();
        borderPane28.setCenter(jfxButton5);
        BorderPane borderPane29 = new BorderPane();
        borderPane29.setCenter(jfxButton6);
        BorderPane borderPane30 = new BorderPane();
        borderPane30.setCenter(jfxButton7);
        borderPane27.setRight(borderPane28);
        borderPane27.setCenter(borderPane29);
        borderPane27.setLeft(borderPane30);

        GridPane gridPane3 = new GridPane();
        gridPane3.add(borderPane25,0,0);
        gridPane3.add(borderPane26,0,1);
        gridPane3.add(borderPane27,0,2);
        gridPane3.setPrefSize(750,580);
        gridPane3.setAlignment(Pos.CENTER);
        gridPane3.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane3.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        loginScene = new Scene(gridPane3);

//registration menu
        jfxTextField = new JFXTextField();
        jfxTextField.setPromptText("Name");
        jfxTextField.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField2 = new JFXTextField();
        jfxTextField2.setPromptText("Last Name");
        jfxTextField2.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField3 = new JFXTextField();
        jfxTextField3.setPromptText("Username");
        jfxTextField3.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField4= new JFXTextField();
        jfxTextField4.setPromptText("Email");
        jfxTextField4.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField5 = new JFXTextField();
        jfxTextField5.setPromptText("Phone Number");
        jfxTextField5.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField = new JFXPasswordField();
        jfxPasswordField.setPromptText("Password");
        jfxPasswordField.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField2 = new JFXPasswordField();
        jfxPasswordField2.setPromptText("Confirm Password");
        jfxPasswordField2.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton = new JFXButton();
        jfxButton.setText("Enter");
        jfxButton.setPrefSize(95,25);
        jfxButton.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton.setTextFill(Color.BLACK);
        jfxButton2 = new JFXButton();
        jfxButton2.setText("Back");
        jfxButton2.setPrefSize(95,25);
        jfxButton2.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton2.setTextFill(Color.BLACK);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(jfxTextField);
        borderPane.setPrefSize(600,60);
        BorderPane borderPane2 = new BorderPane();
        borderPane2.setCenter(jfxTextField2);
        borderPane2.setPrefSize(600,60);
        BorderPane borderPane3 = new BorderPane();
        borderPane3.setCenter(jfxTextField3);
        borderPane3.setPrefSize(600,60);
        BorderPane borderPane4 = new BorderPane();
        borderPane4.setCenter(jfxPasswordField);
        borderPane4.setPrefSize(600,60);
        BorderPane borderPane5 = new BorderPane();
        borderPane5.setCenter(jfxTextField4);
        borderPane5.setPrefSize(600,60);
        BorderPane borderPane6 = new BorderPane();
        borderPane6.setCenter(jfxTextField5);
        borderPane6.setPrefSize(600,60);
        BorderPane borderPane90 = new BorderPane();
        borderPane90.setCenter(jfxPasswordField2);
        borderPane90.setPrefSize(600,60);
        BorderPane borderPane7 = new BorderPane();
        borderPane7.setPrefSize(600,60);
        BorderPane borderPane8 = new BorderPane();
        borderPane8.setCenter(jfxButton);
        BorderPane borderPane9 = new BorderPane();
        borderPane9.setCenter(jfxButton2);
        borderPane7.setRight(borderPane8);
        borderPane7.setLeft(borderPane9);

        GridPane gridPane = new GridPane();
        gridPane.add(borderPane,0,0);
        gridPane.add(borderPane2,0,1);
        gridPane.add(borderPane3,0,2);
        gridPane.add(borderPane4,0,3);
        gridPane.add(borderPane90,0,4);
        gridPane.add(borderPane5,0,5);
        gridPane.add(borderPane6,0,6);
        gridPane.add(borderPane7,0,7);
        gridPane.setPrefSize(750,580);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        registrationScene = new Scene(gridPane);

//passenger main menu
        jfxButton8 = new JFXButton();
        jfxButton8.setText("Ok");
        jfxButton8.setPrefSize(95,25);
        jfxButton8.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton8.setTextFill(Color.BLACK);
        jfxButton9 = new JFXButton();
        jfxButton9.setText("Back");
        jfxButton9.setPrefSize(95,25);
        jfxButton9.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton9.setTextFill(Color.BLACK);

        choiceBox = new ChoiceBox<String>();
        choiceBox.setValue("");
        choiceBox.getItems().add("Edit profile");
        choiceBox.getItems().add("Change password");
        choiceBox.getItems().add("Charge account");
        choiceBox.getItems().add("Ticket section");
        choiceBox.getItems().add("Send reviews");

        Label label8 = new Label();
        label8.setTextFill(Color.BLACK);
        label8.setText("Welcome,Choose an option!");

        BorderPane borderPane32 = new BorderPane();
        borderPane32.setCenter(label8);
        borderPane32.setPrefSize(520,90);
        BorderPane borderPane33 = new BorderPane();
        borderPane33.setCenter(choiceBox);
        borderPane33.setPrefSize(520,90);
        BorderPane borderPane34 = new BorderPane();
        borderPane34.setPrefSize(520,90);
        BorderPane borderPane35 = new BorderPane();
        borderPane35.setCenter(jfxButton8);
        BorderPane borderPane36 = new BorderPane();
        borderPane36.setCenter(jfxButton9);
        borderPane34.setRight(borderPane35);
        borderPane34.setLeft(borderPane36);

        GridPane gridPane4 = new GridPane();;
        gridPane4.add(borderPane32,0,0);
        gridPane4.add(borderPane33,0,1);
        gridPane4.add(borderPane34,0,2);

        gridPane4.setPrefSize(570,270);
        gridPane4.setAlignment(Pos.CENTER);
        gridPane4.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane4.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        mainMenuScene = new Scene(gridPane4);

//change password
        jfxPasswordField3 = new JFXPasswordField();
        jfxPasswordField3.setPromptText("Old Password");
        jfxPasswordField3.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField4 = new JFXPasswordField();
        jfxPasswordField4.setPromptText("New Password");
        jfxPasswordField4.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField6 = new JFXPasswordField();
        jfxPasswordField6.setPromptText("Confirm New Password");
        jfxPasswordField6.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton10 = new JFXButton();
        jfxButton10.setText("Enter");
        jfxButton10.setPrefSize(95,25);
        jfxButton10.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton10.setTextFill(Color.BLACK);
        jfxButton11 = new JFXButton();
        jfxButton11.setText("Back");
        jfxButton11.setPrefSize(95,25);
        jfxButton11.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton11.setTextFill(Color.BLACK);

        BorderPane borderPane16 = new BorderPane();
        borderPane16.setCenter(jfxPasswordField3);
        borderPane16.setPrefSize(300,60);
        BorderPane borderPane17 = new BorderPane();
        borderPane17.setPrefSize(300,60);
        borderPane17.setCenter(jfxPasswordField4);
        BorderPane borderPane91 = new BorderPane();
        borderPane91.setCenter(jfxPasswordField6);
        borderPane91.setPrefSize(300,60);
        BorderPane borderPane92 = new BorderPane();
        borderPane92.setCenter(jfxButton10);
        borderPane92.setPrefSize(300,30);
        BorderPane borderPane37 = new BorderPane();
        borderPane37.setCenter(jfxButton11);
        borderPane37.setPrefSize(300,30);
        BorderPane borderPane38 = new BorderPane();
        borderPane38.setPrefSize(600,60);
        borderPane38.setLeft(borderPane37);
        borderPane38.setRight(borderPane92);

        GridPane gridPane5 = new GridPane();;
        gridPane5.add(borderPane16,0,0);
        gridPane5.add(borderPane17,0,1);
        gridPane5.add(borderPane91,0,2);
        gridPane5.add(borderPane38,0,3);

        gridPane5.setPrefSize(750,580);
        gridPane5.setAlignment(Pos.CENTER);
        gridPane5.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane5.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        changePasswordScene = new Scene(gridPane5);

//edit menu
        jfxTextField6 = new JFXTextField();
        jfxTextField6.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField7 = new JFXTextField();
        jfxTextField7.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField8 = new JFXTextField();
        jfxTextField8.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField9= new JFXTextField();
        jfxTextField9.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField10 = new JFXTextField();
        jfxTextField10.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        label.setTextFill(Color.BLACK);
        label2.setTextFill(Color.BLACK);
        label3.setTextFill(Color.BLACK);
        label5.setTextFill(Color.BLACK);
        label6.setTextFill(Color.BLACK);
        label.setText("Name");
        label2.setText("Last Name");
        label3.setText("Username");
        label5.setText("Email");
        label6.setText("Phone Number");

        jfxButton3 = new JFXButton();
        jfxButton3.setText("Enter");
        jfxButton3.setPrefSize(95,25);
        jfxButton3.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton3.setTextFill(Color.BLACK);
        jfxButton4 = new JFXButton();
        jfxButton4.setText("Back");
        jfxButton4.setPrefSize(95,25);
        jfxButton4.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton4.setTextFill(Color.BLACK);

        BorderPane borderPane10 = new BorderPane();
        borderPane10.setLeft(label);
        borderPane10.setPrefSize(300,30);
        BorderPane borderPane11 = new BorderPane();
        borderPane11.setCenter(jfxTextField6);
        borderPane11.setPrefSize(300,30);
        BorderPane borderPane12 = new BorderPane();
        borderPane12.setLeft(label2);
        borderPane12.setPrefSize(300,30);
        BorderPane borderPane13 = new BorderPane();
        borderPane13.setCenter(jfxTextField7);
        borderPane13.setPrefSize(300,30);
        BorderPane borderPane14 = new BorderPane();
        borderPane14.setLeft(label3);
        borderPane14.setPrefSize(300,30);
        BorderPane borderPane15 = new BorderPane();
        borderPane15.setCenter(jfxTextField8);
        borderPane15.setPrefSize(300,30);
        BorderPane borderPane18 = new BorderPane();
        borderPane18.setLeft(label5);
        borderPane18.setPrefSize(300,30);
        BorderPane borderPane19 = new BorderPane();
        borderPane19.setCenter(jfxTextField9);
        borderPane19.setPrefSize(300,30);
        BorderPane borderPane20 = new BorderPane();
        borderPane20.setLeft(label6);
        borderPane20.setPrefSize(300,30);
        BorderPane borderPane21 = new BorderPane();
        borderPane21.setCenter(jfxTextField10);
        borderPane21.setPrefSize(300,30);
        BorderPane borderPane22 = new BorderPane();
        borderPane22.setPrefSize(600,60);
        BorderPane borderPane23 = new BorderPane();
        borderPane23.setCenter(jfxButton3);
        BorderPane borderPane24 = new BorderPane();
        borderPane24.setCenter(jfxButton4);
        borderPane22.setRight(borderPane23);
        borderPane22.setLeft(borderPane24);

        GridPane gridPane2 = new GridPane();;
        gridPane2.add(borderPane11,0,0);
        gridPane2.add(borderPane10,0,1);
        gridPane2.add(borderPane13,0,2);
        gridPane2.add(borderPane12,0,3);
        gridPane2.add(borderPane15,0,4);
        gridPane2.add(borderPane14,0,5);
        gridPane2.add(borderPane19,0,6);
        gridPane2.add(borderPane18,0,7);
        gridPane2.add(borderPane21,0,8);
        gridPane2.add(borderPane20,0,9);
        gridPane2.add(borderPane22,0,10);

        gridPane2.setPrefSize(750,580);
        gridPane2.setAlignment(Pos.CENTER);
        gridPane2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane2.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        editAllScene = new Scene(gridPane2);

//charge account
        jfxTextField12 = new JFXTextField();
        jfxTextField12.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        label9 = new Label();
        label9.setTextFill(Color.BLACK);

        jfxButton12 = new JFXButton();
        jfxButton12.setText("Enter");
        jfxButton12.setPrefSize(95,25);
        jfxButton12.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton12.setTextFill(Color.BLACK);
        jfxButton13 = new JFXButton();
        jfxButton13.setText("Back");
        jfxButton13.setPrefSize(95,25);
        jfxButton13.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton13.setTextFill(Color.BLACK);

        BorderPane borderPane39 = new BorderPane();
        borderPane39.setCenter(label9);
        borderPane39.setPrefSize(300,60);
        BorderPane borderPane40 = new BorderPane();
        borderPane40.setCenter(jfxTextField12);
        borderPane40.setPrefSize(300,30);
        BorderPane borderPane41 = new BorderPane();
        borderPane41.setCenter(jfxButton12);
        borderPane41.setPrefSize(300,30);
        BorderPane borderPane42 = new BorderPane();
        borderPane42.setCenter(jfxButton13);
        borderPane42.setPrefSize(300,30);
        BorderPane borderPane43 = new BorderPane();
        borderPane43.setPrefSize(600,60);
        borderPane43.setLeft(borderPane42);
        borderPane43.setRight(borderPane41);

        GridPane gridPane6 = new GridPane();;
        gridPane6.add(borderPane39,0,0);
        gridPane6.add(borderPane40,0,1);
        gridPane6.add(borderPane43,0,2);

        gridPane6.setPrefSize(750,580);
        gridPane6.setAlignment(Pos.CENTER);
        gridPane6.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane6.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        chargeScene = new Scene(gridPane6);

        stage = new Stage();
    }

    public Stage getStage()
    {
        return stage;
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    public JFXTextField getJfxTextField()
    {
        return jfxTextField;
    }

    public void setJfxTextField(JFXTextField jfxTextField)
    {
        this.jfxTextField = jfxTextField;
    }

    public JFXTextField getJfxTextField2()
    {
        return jfxTextField2;
    }

    public void setJfxTextField2(JFXTextField jfxTextField2)
    {
        this.jfxTextField2 = jfxTextField2;
    }

    public JFXTextField getJfxTextField3()
    {
        return jfxTextField3;
    }

    public void setJfxTextField3(JFXTextField jfxTextField3)
    {
        this.jfxTextField3 = jfxTextField3;
    }

    public JFXTextField getJfxTextField4()
    {
        return jfxTextField4;
    }

    public void setJfxTextField4(JFXTextField jfxTextField4)
    {
        this.jfxTextField4 = jfxTextField4;
    }

    public JFXTextField getJfxTextField5()
    {
        return jfxTextField5;
    }

    public void setJfxTextField5(JFXTextField jfxTextField5)
    {
        this.jfxTextField5 = jfxTextField5;
    }

    public JFXPasswordField getJfxPasswordField()
    {
        return jfxPasswordField;
    }

    public void setJfxPasswordField(JFXPasswordField jfxPasswordField)
    {
        this.jfxPasswordField = jfxPasswordField;
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

    public Scene getRegistrationScene()
    {
        return registrationScene;
    }

    public void setRegistrationScene(Scene registrationScene)
    {
        this.registrationScene = registrationScene;
    }

    public Scene getEditAllScene()
    {
        return editAllScene;
    }

    public void setEditAllScene(Scene editScene)
    {
        this.editAllScene = editScene;
    }

    public Scene getLoginScene()
    {
        return loginScene;
    }

    public void setLoginScene(Scene loginScene)
    {
        this.loginScene = loginScene;
    }

    public Scene getShowPassengersScene()
    {
        return showPassengersScene;
    }

    public void setShowPassengersScene(Scene showPassengersScene)
    {
        this.showPassengersScene = showPassengersScene;
    }

    public JFXTextField getJfxTextField11()
    {
        return jfxTextField11;
    }

    public void setJfxTextField11(JFXTextField jfxTextField11)
    {
        this.jfxTextField11 = jfxTextField11;
    }

    public JFXPasswordField getJfxPasswordField5()
    {
        return jfxPasswordField5;
    }

    public void setJfxPasswordField5(JFXPasswordField jfxPasswordField5)
    {
        this.jfxPasswordField5 = jfxPasswordField5;
    }

    public JFXButton getJfxButton5()
    {
        return jfxButton5;
    }

    public void setJfxButton5(JFXButton jfxButton5)
    {
        this.jfxButton5 = jfxButton5;
    }

    public JFXButton getJfxButton6()
    {
        return jfxButton6;
    }

    public void setJfxButton6(JFXButton jfxButton6)
    {
        this.jfxButton6 = jfxButton6;
    }

    public JFXButton getJfxButton7()
    {
        return jfxButton7;
    }

    public void setJfxButton7(JFXButton jfxButton7)
    {
        this.jfxButton7 = jfxButton7;
    }

    public JFXTextField getJfxTextField6()
    {
        return jfxTextField6;
    }

    public void setJfxTextField6(JFXTextField jfxTextField6)
    {
        this.jfxTextField6 = jfxTextField6;
    }

    public JFXTextField getJfxTextField7()
    {
        return jfxTextField7;
    }

    public void setJfxTextField7(JFXTextField jfxTextField7)
    {
        this.jfxTextField7 = jfxTextField7;
    }

    public JFXTextField getJfxTextField8()
    {
        return jfxTextField8;
    }

    public void setJfxTextField8(JFXTextField jfxTextField8)
    {
        this.jfxTextField8 = jfxTextField8;
    }

    public JFXTextField getJfxTextField9()
    {
        return jfxTextField9;
    }

    public void setJfxTextField9(JFXTextField jfxTextField9)
    {
        this.jfxTextField9 = jfxTextField9;
    }

    public JFXTextField getJfxTextField10()
    {
        return jfxTextField10;
    }

    public void setJfxTextField10(JFXTextField jfxTextField10)
    {
        this.jfxTextField10 = jfxTextField10;
    }

    public JFXPasswordField getJfxPasswordField3()
    {
        return jfxPasswordField3;
    }

    public void setJfxPasswordField3(JFXPasswordField jfxPasswordField3)
    {
        this.jfxPasswordField3 = jfxPasswordField3;
    }

    public JFXButton getJfxButton3()
    {
        return jfxButton3;
    }

    public void setJfxButton3(JFXButton jfxButton3)
    {
        this.jfxButton3 = jfxButton3;
    }

    public JFXButton getJfxButton4()
    {
        return jfxButton4;
    }

    public void setJfxButton4(JFXButton jfxButton4)
    {
        this.jfxButton4 = jfxButton4;
    }

    public JFXButton getJfxButton8()
    {
        return jfxButton8;
    }

    public void setJfxButton8(JFXButton jfxButton8)
    {
        this.jfxButton8 = jfxButton8;
    }

    public JFXButton getJfxButton9()
    {
        return jfxButton9;
    }

    public void setJfxButton9(JFXButton jfxButton9)
    {
        this.jfxButton9 = jfxButton9;
    }

    public ChoiceBox<String> getChoiceBox()
    {
        return choiceBox;
    }

    public void setChoiceBox(ChoiceBox<String> choiceBox)
    {
        this.choiceBox = choiceBox;
    }

    public Scene getMainMenuScene()
    {
        return mainMenuScene;
    }

    public void setMainMenuScene(Scene mainMenuScene)
    {
        this.mainMenuScene = mainMenuScene;
    }

    public JFXPasswordField getJfxPasswordField2()
    {
        return jfxPasswordField2;
    }

    public void setJfxPasswordField2(JFXPasswordField jfxPasswordField2)
    {
        this.jfxPasswordField2 = jfxPasswordField2;
    }

    public JFXPasswordField getJfxPasswordField4()
    {
        return jfxPasswordField4;
    }

    public void setJfxPasswordField4(JFXPasswordField jfxPasswordField4)
    {
        this.jfxPasswordField4 = jfxPasswordField4;
    }

    public JFXPasswordField getJfxPasswordField6()
    {
        return jfxPasswordField6;
    }

    public void setJfxPasswordField6(JFXPasswordField jfxPasswordField6)
    {
        this.jfxPasswordField6 = jfxPasswordField6;
    }

    public JFXButton getJfxButton10()
    {
        return jfxButton10;
    }

    public void setJfxButton10(JFXButton jfxButton10)
    {
        this.jfxButton10 = jfxButton10;
    }

    public JFXButton getJfxButton11()
    {
        return jfxButton11;
    }

    public void setJfxButton11(JFXButton jfxButton11)
    {
        this.jfxButton11 = jfxButton11;
    }

    public Scene getChangePasswordScene()
    {
        return changePasswordScene;
    }

    public void setChangePasswordScene(Scene changePasswordScene)
    {
        this.changePasswordScene = changePasswordScene;
    }

    public JFXTextField getJfxTextField12()
    {
        return jfxTextField12;
    }

    public void setJfxTextField12(JFXTextField jfxTextField12)
    {
        this.jfxTextField12 = jfxTextField12;
    }

    public JFXButton getJfxButton12()
    {
        return jfxButton12;
    }

    public void setJfxButton12(JFXButton jfxButton12)
    {
        this.jfxButton12 = jfxButton12;
    }

    public JFXButton getJfxButton13()
    {
        return jfxButton13;
    }

    public void setJfxButton13(JFXButton jfxButton13)
    {
        this.jfxButton13 = jfxButton13;
    }

    public Scene getChargeScene()
    {
        return chargeScene;
    }

    public void setChargeScene(Scene chargeScene)
    {
        this.chargeScene = chargeScene;
    }

    public Label getLabel9()
    {
        return label9;
    }

    public void setLabel9(Label label9)
    {
        this.label9 = label9;
    }
}
