package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.*;

import java.time.LocalDateTime;

public class EmployeeView
{
    private Stage stage;
    private JFXTextField jfxTextField6;
    private JFXTextField jfxTextField7;
    private JFXTextField jfxTextField8;
    private JFXTextField jfxTextField9;
    private JFXTextField jfxTextField10;
    private JFXTextField jfxTextField13;
    private JFXTextField jfxTextField23;
    private JFXTextField jfxTextField24;
    private JFXTextField jfxTextField25;
    private JFXTextField jfxTextField26;
    private JFXTextField jfxTextField29;
    private JFXTextField jfxTextField30;
    private JFXTextField jfxTextField31;
    private JFXTextField jfxTextField32;
    private JFXTextField jfxTextField33;
    private JFXTextField jfxTextField34;
    private JFXTextField jfxTextField35;
    private JFXTextField jfxTextField36;
    private JFXTextField jfxTextField37;
    private JFXTextField jfxTextField38;
    private JFXTextField jfxTextField39;
    private JFXTextField jfxTextField40;
    private JFXTextField jfxTextField70;
    private JFXTextArea jfxTextArea300;
    private JFXPasswordField jfxPasswordField70;
    private JFXPasswordField jfxPasswordField71;
    private JFXPasswordField jfxPasswordField72;
    private JFXPasswordField jfxPasswordField73;
    private JFXButton jfxButton3;
    private JFXButton jfxButton4;
    private JFXButton jfxButton8;
    private JFXButton jfxButton9;
    private JFXButton jfxButton15;
    private JFXButton jfxButton16;
    private JFXButton jfxButton17;
    private JFXButton jfxButton18;
    private JFXButton jfxButton19;
    private JFXButton jfxButton20;
    private JFXButton jfxButton21;
    private JFXButton jfxButton22;
    private JFXButton jfxButton31;
    private JFXButton jfxButton32;
    private JFXButton jfxButton33;
    private JFXButton jfxButton34;
    private JFXButton jfxButton35;
    private JFXButton jfxButton36;
    private JFXButton jfxButton37;
    private JFXButton jfxButton38;
    private JFXButton jfxButton39;
    private JFXButton jfxButton40;
    private JFXButton jfxButton70;
    private JFXButton jfxButton72;
    private JFXButton jfxButton74;
    private JFXButton jfxButton75;
    private JFXButton jfxButton300;
    private JFXButton jfxButton301;
    private JFXButton jfxButton544;
    private JFXButton jfxButton545;
    private ChoiceBox <String> choiceBox;
    private TableView <EmployeeModel> tableView;
    private TableView <TicketModel> tableView3;
    private TableView <FlightModel> tableView5;
    private TableView <AirplaneModel> tableView6;
    private TableView <TicketModel> tableView7;
    private TableView <FlightModel> tableView8;
    private TableView <AirplaneModel> tableView9;
    private TableView <TicketModel> tableView10;
    private TableView <PassengerModel> tableView400;
    private Scene editAllScene;
    private Scene mainMenuScene;
    private Scene loginScene;
    private Scene changePasswordScene;
    private Scene ticketScene;
    private Scene ticketRegistrationScene;
    private Scene ticketEditScene;
    private Scene flightsOfAirplaneScene;
    private Scene flightScene;
    private Scene flightRegistrationScene;
    private Scene flightEditScene;
    private Scene criticsAndSuggestionsScene;
    private Scene showEmployeesScene;
    private Scene flightsPassengersScene;

    public EmployeeView()
    {
//show employees
        tableView = new TableView<EmployeeModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeModel,Long>("id"));
        TableColumn tableColumn2 = new TableColumn("Name");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("name"));
        TableColumn tableColumn3 = new TableColumn("Last Name");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("lastName"));
        TableColumn tableColumn4 = new TableColumn("Username");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<EmployeeModel, String>("username"));
        TableColumn tableColumn5 = new TableColumn("Password");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("password"));
        TableColumn tableColumn6 = new TableColumn("Email");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("email"));
        TableColumn tableColumn7 = new TableColumn("Phone Number");
        tableColumn7.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("phoneNumber"));
        tableColumn7.setMinWidth(50);
        TableColumn tableColumn8 = new TableColumn("Address");
        tableColumn8.setCellValueFactory(new PropertyValueFactory<EmployeeModel,String>("address"));
        TableColumn tableColumn9 = new TableColumn("Salary");
        tableColumn9.setCellValueFactory(new PropertyValueFactory<EmployeeModel,Long>("salary"));

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3,tableColumn4,tableColumn5,tableColumn6,tableColumn7,tableColumn8,tableColumn9);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        BorderPane borderPane31 = new BorderPane();
        borderPane31.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        borderPane31.setCenter(tableView);
        borderPane31.setPrefSize(600,400);

        showEmployeesScene = new Scene(borderPane31);

//login menu
        jfxTextField70 = new JFXTextField();
        jfxTextField70.setPromptText("ID");
        jfxTextField70.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField70 = new JFXPasswordField();
        jfxPasswordField70.setPromptText("Password");
        jfxPasswordField70.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxButton70 = new JFXButton();
        jfxButton70.setText("Enter");
        jfxButton70.setPrefSize(95,25);
        jfxButton70.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton70.setTextFill(Color.BLACK);
        jfxButton72 = new JFXButton();
        jfxButton72.setText("Back");
        jfxButton72.setPrefSize(95,25);
        jfxButton72.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton72.setTextFill(Color.BLACK);

        BorderPane borderPane75 = new BorderPane();
        borderPane75.setCenter(jfxTextField70);
        borderPane75.setPrefSize(600,60);
        BorderPane borderPane76 = new BorderPane();
        borderPane76.setCenter(jfxPasswordField70);
        borderPane76.setPrefSize(600,60);
        BorderPane borderPane77 = new BorderPane();
        borderPane77.setPrefSize(600,60);
        BorderPane borderPane78 = new BorderPane();
        borderPane78.setCenter(jfxButton70);
        BorderPane borderPane80 = new BorderPane();
        borderPane80.setCenter(jfxButton72);
        borderPane77.setRight(borderPane78);
        borderPane77.setLeft(borderPane80);

        GridPane gridPane70 = new GridPane();
        gridPane70.add(borderPane75,0,0);
        gridPane70.add(borderPane76,0,1);
        gridPane70.add(borderPane77,0,2);
        gridPane70.setPrefSize(750,580);
        gridPane70.setAlignment(Pos.CENTER);
        gridPane70.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane70.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        loginScene = new Scene(gridPane70);

//change password
        jfxPasswordField71 = new JFXPasswordField();
        jfxPasswordField71.setPromptText("Old Password");
        jfxPasswordField71.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField72 = new JFXPasswordField();
        jfxPasswordField72.setPromptText("New Password");
        jfxPasswordField72.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField73 = new JFXPasswordField();
        jfxPasswordField73.setPromptText("Confirm New Password");
        jfxPasswordField73.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton74 = new JFXButton();
        jfxButton74.setText("Enter");
        jfxButton74.setPrefSize(95,25);
        jfxButton74.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton74.setTextFill(Color.BLACK);
        jfxButton75 = new JFXButton();
        jfxButton75.setText("Back");
        jfxButton75.setPrefSize(95,25);
        jfxButton75.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton75.setTextFill(Color.BLACK);

        BorderPane borderPane70 = new BorderPane();
        borderPane70.setCenter(jfxPasswordField71);
        borderPane70.setPrefSize(300,60);
        BorderPane borderPane71 = new BorderPane();
        borderPane71.setPrefSize(300,60);
        borderPane71.setCenter(jfxPasswordField72);
        BorderPane borderPane72 = new BorderPane();
        borderPane72.setCenter(jfxPasswordField73);
        borderPane72.setPrefSize(300,60);
        BorderPane borderPane73 = new BorderPane();
        borderPane73.setCenter(jfxButton74);
        borderPane73.setPrefSize(300,30);
        BorderPane borderPane74 = new BorderPane();
        borderPane74.setCenter(jfxButton75);
        borderPane74.setPrefSize(300,30);
        BorderPane borderPane85 = new BorderPane();
        borderPane85.setPrefSize(600,60);
        borderPane85.setLeft(borderPane74);
        borderPane85.setRight(borderPane73);

        GridPane gridPane71 = new GridPane();
        gridPane71.add(borderPane70,0,0);
        gridPane71.add(borderPane71,0,1);
        gridPane71.add(borderPane72,0,2);
        gridPane71.add(borderPane85,0,3);

        gridPane71.setPrefSize(750,580);
        gridPane71.setAlignment(Pos.CENTER);
        gridPane71.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane71.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        changePasswordScene = new Scene(gridPane71);

//employee main menu
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
        choiceBox.getItems().add("Edit account");
        choiceBox.getItems().add("Change password");
        choiceBox.getItems().add("Manage flights");
        choiceBox.getItems().add("Manage tickets");
        choiceBox.getItems().add("Send critics and suggestions");

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

        GridPane gridPane4 = new GridPane();
        gridPane4.add(borderPane32,0,0);
        gridPane4.add(borderPane33,0,1);
        gridPane4.add(borderPane34,0,2);

        gridPane4.setPrefSize(570,270);
        gridPane4.setAlignment(Pos.CENTER);
        gridPane4.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane4.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        mainMenuScene = new Scene(gridPane4);

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
        jfxTextField13 = new JFXTextField();
        jfxTextField13.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label4 = new Label();
        label.setTextFill(Color.BLACK);
        label2.setTextFill(Color.BLACK);
        label3.setTextFill(Color.BLACK);
        label5.setTextFill(Color.BLACK);
        label6.setTextFill(Color.BLACK);
        label4.setTextFill(Color.BLACK);
        label.setText("Name");
        label2.setText("Last Name");
        label3.setText("Username");
        label5.setText("Email");
        label6.setText("Phone Number");
        label4.setText("Address");

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
        BorderPane borderPane26 = new BorderPane();
        borderPane26.setLeft(label4);
        borderPane26.setPrefSize(300,30);
        BorderPane borderPane27 = new BorderPane();
        borderPane27.setCenter(jfxTextField13);
        borderPane27.setPrefSize(300,30);
        BorderPane borderPane22 = new BorderPane();
        borderPane22.setPrefSize(600,60);
        BorderPane borderPane23 = new BorderPane();
        borderPane23.setCenter(jfxButton3);
        BorderPane borderPane24 = new BorderPane();
        borderPane24.setCenter(jfxButton4);
        borderPane22.setRight(borderPane23);
        borderPane22.setLeft(borderPane24);

        GridPane gridPane2 = new GridPane();
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
        gridPane2.add(borderPane27,0,10);
        gridPane2.add(borderPane26,0,11);
        gridPane2.add(borderPane22,0,12);

        gridPane2.setPrefSize(750,580);
        gridPane2.setAlignment(Pos.CENTER);
        gridPane2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane2.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        editAllScene = new Scene(gridPane2);

//manage tickets
        tableView3 = new TableView<TicketModel>();
        tableView3.setPrefSize(600,400);

        TableColumn tableColumn18 = new TableColumn("ID");
        tableColumn18.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("id"));
        TableColumn tableColumn19 = new TableColumn("Price");
        tableColumn19.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("price"));
        TableColumn tableColumn20 = new TableColumn("PenaltyOfCancellation");
        tableColumn20.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("penaltyOfCancellation"));

        tableView3.getColumns().addAll(tableColumn18,tableColumn19,tableColumn20);
        tableView3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label7 = new Label();
        label7.setTextFill(Color.BLACK);
        label7.setText("Select a row from table.");

        jfxButton15 = new JFXButton();
        jfxButton15.setText("Add");
        jfxButton15.setPrefSize(95,25);
        jfxButton15.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton15.setTextFill(Color.BLACK);
        jfxButton16 = new JFXButton();
        jfxButton16.setText("Edit");
        jfxButton16.setPrefSize(95,25);
        jfxButton16.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton16.setTextFill(Color.BLACK);
        jfxButton17 = new JFXButton();
        jfxButton17.setText("Delete");
        jfxButton17.setPrefSize(95,25);
        jfxButton17.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton17.setTextFill(Color.BLACK);
        jfxButton18 = new JFXButton();
        jfxButton18.setText("Back");
        jfxButton18.setPrefSize(95,25);
        jfxButton18.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton18.setTextFill(Color.BLACK);

        BorderPane borderPane61 = new BorderPane();
        borderPane61.setCenter(label7);
        borderPane61.setPrefSize(300,60);
        BorderPane borderPane62 = new BorderPane();
        borderPane62.setCenter(tableView3);
        borderPane62.setPrefSize(300,250);
        BorderPane borderPane63 = new BorderPane();
        borderPane63.setCenter(jfxButton15);
        borderPane63.setPrefSize(300,30);
        BorderPane borderPane64 = new BorderPane();
        borderPane64.setCenter(jfxButton16);
        borderPane64.setPrefSize(300,30);
        BorderPane borderPane65 = new BorderPane();
        borderPane65.setPrefSize(600,60);
        BorderPane borderPane66 = new BorderPane();
        borderPane66.setCenter(jfxButton17);
        borderPane66.setPrefSize(300,30);
        BorderPane borderPane67 = new BorderPane();
        borderPane67.setCenter(jfxButton18);
        borderPane67.setPrefSize(300,30);
        BorderPane borderPane68 = new BorderPane();
        borderPane68.setPrefSize(600,60);
        borderPane68.setLeft(borderPane66);
        borderPane68.setRight(borderPane63);
        borderPane65.setLeft(borderPane67);
        borderPane65.setRight(borderPane64);

        GridPane gridPane7 = new GridPane();
        gridPane7.add(borderPane61,0,0);
        gridPane7.add(borderPane62,0,1);
        gridPane7.add(borderPane68,0,2);
        gridPane7.add(borderPane65,0,3);
        gridPane7.setPrefSize(750,580);
        gridPane7.setAlignment(Pos.CENTER);
        gridPane7.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane7.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        ticketScene = new Scene(gridPane7);

//add ticket
        jfxTextField23 = new JFXTextField();
        jfxTextField23.setPromptText("Price");
        jfxTextField23.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField24 = new JFXTextField();
        jfxTextField24.setPromptText("Penalty Of Cancellation");
        jfxTextField24.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton19 = new JFXButton();
        jfxButton19.setText("Enter");
        jfxButton19.setPrefSize(95,25);
        jfxButton19.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton19.setTextFill(Color.BLACK);
        jfxButton20 = new JFXButton();
        jfxButton20.setText("Back");
        jfxButton20.setPrefSize(95,25);
        jfxButton20.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton20.setTextFill(Color.BLACK);

        BorderPane borderPane69 = new BorderPane();
        borderPane69.setCenter(jfxTextField23);
        borderPane69.setPrefSize(600,60);
        BorderPane borderPane100 = new BorderPane();
        borderPane100.setCenter(jfxTextField24);
        borderPane100.setPrefSize(600,60);
        BorderPane borderPane101 = new BorderPane();
        borderPane101.setPrefSize(600,60);
        BorderPane borderPane102 = new BorderPane();
        borderPane102.setCenter(jfxButton19);
        BorderPane borderPane103 = new BorderPane();
        borderPane103.setCenter(jfxButton20);
        borderPane101.setRight(borderPane102);
        borderPane101.setLeft(borderPane103);

        GridPane gridPane8 = new GridPane();
        gridPane8.add(borderPane69,0,0);
        gridPane8.add(borderPane100,0,1);
        gridPane8.add(borderPane101,0,2);
        gridPane8.setPrefSize(750,580);
        gridPane8.setAlignment(Pos.CENTER);
        gridPane8.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane8.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        ticketRegistrationScene = new Scene(gridPane8);

//edit a ticket menu
        jfxTextField25 = new JFXTextField();
        jfxTextField25.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField26 = new JFXTextField();
        jfxTextField26.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label15 = new Label();
        Label label16 = new Label();
        label15.setTextFill(Color.BLACK);
        label16.setTextFill(Color.BLACK);
        label15.setText("Price");
        label16.setText("Penalty Of Cancellation");

        jfxButton21 = new JFXButton();
        jfxButton21.setText("Enter");
        jfxButton21.setPrefSize(95,25);
        jfxButton21.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton21.setTextFill(Color.BLACK);
        jfxButton22 = new JFXButton();
        jfxButton22.setText("Back");
        jfxButton22.setPrefSize(95,25);
        jfxButton22.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton22.setTextFill(Color.BLACK);

        BorderPane borderPane104 = new BorderPane();
        borderPane104.setLeft(label15);
        borderPane104.setPrefSize(300,30);
        BorderPane borderPane105 = new BorderPane();
        borderPane105.setCenter(jfxTextField25);
        borderPane105.setPrefSize(300,30);
        BorderPane borderPane106 = new BorderPane();
        borderPane106.setLeft(label16);
        borderPane106.setPrefSize(300,30);
        BorderPane borderPane107 = new BorderPane();
        borderPane107.setCenter(jfxTextField26);
        borderPane107.setPrefSize(300,30);
        BorderPane borderPane108 = new BorderPane();
        borderPane108.setPrefSize(600,60);
        BorderPane borderPane109 = new BorderPane();
        borderPane109.setCenter(jfxButton21);
        BorderPane borderPane110 = new BorderPane();
        borderPane110.setCenter(jfxButton22);
        borderPane108.setRight(borderPane109);
        borderPane108.setLeft(borderPane110);

        GridPane gridPane9 = new GridPane();
        gridPane9.add(borderPane105,0,0);
        gridPane9.add(borderPane104,0,1);
        gridPane9.add(borderPane107,0,2);
        gridPane9.add(borderPane106,0,3);
        gridPane9.add(borderPane108,0,4);
        gridPane9.setPrefSize(750,580);
        gridPane9.setAlignment(Pos.CENTER);
        gridPane9.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane9.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        ticketEditScene = new Scene(gridPane9);

//flights of an airplanes
        tableView8 = new TableView<FlightModel>();
        tableView8.setPrefSize(600,400);
        TableColumn tableColumn36 = new TableColumn("ID");
        tableColumn36.setCellValueFactory(new PropertyValueFactory<FlightModel,Long>("id"));
        TableColumn tableColumn37 = new TableColumn("Origin");
        tableColumn37.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("origin"));
        TableColumn tableColumn38 = new TableColumn("Destination");
        tableColumn38.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("destination"));
        TableColumn tableColumn39 = new TableColumn("Date");
        tableColumn39.setCellValueFactory(new PropertyValueFactory<FlightModel, LocalDateTime>("date"));
        TableColumn tableColumn40 = new TableColumn("Time");
        tableColumn40.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("time"));
        TableColumn tableColumn41 = new TableColumn("Number Of Sold Tickets");
        tableColumn41.setCellValueFactory(new PropertyValueFactory<FlightModel,Integer>("numberOfSoldTickets"));
        TableColumn tableColumn42 = new TableColumn("Flight Time");
        tableColumn42.setCellValueFactory(new PropertyValueFactory<FlightModel,Double>("flightTime"));
        TableColumn tableColumn43 = new TableColumn("Flight Condition");
        tableColumn43.setCellValueFactory(new PropertyValueFactory<FlightModel, FlightModel.FlightCondition>("flightCondition"));
        tableView8.getColumns().addAll(tableColumn36,tableColumn37,tableColumn38,tableColumn39,tableColumn40,tableColumn41,tableColumn42,tableColumn43);
        tableView8.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        BorderPane borderPane136 = new BorderPane();
        borderPane136.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        borderPane136.setCenter(tableView8);
        borderPane136.setPrefSize(600,400);

        flightsOfAirplaneScene = new Scene(borderPane136);

//passengers of flight
        tableView400 = new TableView<PassengerModel>();
        tableView400.setPrefSize(600,400);
        TableColumn tableColumn400 = new TableColumn("ID");
        tableColumn400.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("id"));
        TableColumn tableColumn401 = new TableColumn("Name");
        tableColumn401.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("name"));
        TableColumn tableColumn402 = new TableColumn("Last Name");
        tableColumn402.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("lastName"));
        TableColumn tableColumn403 = new TableColumn("Username");
        tableColumn403.setCellValueFactory(new PropertyValueFactory<PassengerModel, String>("username"));
        TableColumn tableColumn404 = new TableColumn("Password");
        tableColumn404.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("password"));
        TableColumn tableColumn405 = new TableColumn("Email");
        tableColumn405.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("email"));
        TableColumn tableColumn406 = new TableColumn("Phone Number");
        tableColumn406.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("phoneNumber"));
        tableColumn406.setMinWidth(50);
        TableColumn tableColumn407 = new TableColumn("Credit");
        tableColumn407.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("credit"));
        tableView400.getColumns().addAll(tableColumn400,tableColumn401,tableColumn402,tableColumn403,tableColumn404,tableColumn405,tableColumn406,tableColumn407);
        tableView400.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        BorderPane borderPane400 = new BorderPane();
        borderPane400.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        borderPane400.setCenter(tableView400);
        borderPane400.setPrefSize(600,400);

        flightsPassengersScene = new Scene(borderPane400);


//manage flights
        tableView5 = new TableView<FlightModel>();
        TableColumn tableColumn23 = new TableColumn("ID");
        tableColumn23.setCellValueFactory(new PropertyValueFactory<FlightModel,Long>("id"));
        tableColumn23.setMinWidth(50);
        TableColumn tableColumn24 = new TableColumn("Origin");
        tableColumn24.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("origin"));
        tableColumn24.setMinWidth(50);
        TableColumn tableColumn25 = new TableColumn("Destination");
        tableColumn25.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("destination"));
        tableColumn25.setMinWidth(50);
        TableColumn tableColumn26 = new TableColumn("Date");
        tableColumn26.setCellValueFactory(new PropertyValueFactory<FlightModel, LocalDateTime>("date"));
        tableColumn26.setMinWidth(50);
        TableColumn tableColumn27 = new TableColumn("Time");
        tableColumn27.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("time"));
        tableColumn27.setMinWidth(50);
        TableColumn tableColumn28 = new TableColumn("Number Of Sold Tickets");
        tableColumn28.setCellValueFactory(new PropertyValueFactory<FlightModel,Integer>("numberOfSoldTickets"));
        tableColumn28.setMinWidth(100);
        TableColumn tableColumn29 = new TableColumn("Flight Time");
        tableColumn29.setCellValueFactory(new PropertyValueFactory<FlightModel,Double>("flightTime"));
        tableColumn29.setMinWidth(50);
        TableColumn tableColumn30 = new TableColumn("Flight Condition");
        tableColumn30.setCellValueFactory(new PropertyValueFactory<FlightModel, FlightModel.FlightCondition>("flightCondition"));
        tableColumn30.setMinWidth(100);
        tableView5.getColumns().addAll(tableColumn23,tableColumn24,tableColumn25,tableColumn26,tableColumn27,tableColumn28,tableColumn29,tableColumn30);
        tableView5.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label19 = new Label();
        label19.setTextFill(Color.BLACK);
        label19.setText("Select a row from table.");

        jfxButton31 = new JFXButton();
        jfxButton31.setText("Add");
        jfxButton31.setPrefSize(95,25);
        jfxButton31.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton31.setTextFill(Color.BLACK);
        jfxButton32 = new JFXButton();
        jfxButton32.setText("Edit");
        jfxButton32.setPrefSize(95,25);
        jfxButton32.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton32.setTextFill(Color.BLACK);
        jfxButton33 = new JFXButton();
        jfxButton33.setText("Delete");
        jfxButton33.setPrefSize(95,25);
        jfxButton33.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton33.setTextFill(Color.BLACK);
        jfxButton34 = new JFXButton();
        jfxButton34.setText("Back");
        jfxButton34.setPrefSize(95,25);
        jfxButton34.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton34.setTextFill(Color.BLACK);
        jfxButton544 = new JFXButton();
        jfxButton544.setText("See Airplanes Flights");
        jfxButton544.setPrefSize(190,25);
        jfxButton544.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton544.setTextFill(Color.BLACK);
        jfxButton545 = new JFXButton();
        jfxButton545.setText("See Flights Passengers");
        jfxButton545.setPrefSize(190,25);
        jfxButton545.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton545.setTextFill(Color.BLACK);

        BorderPane borderPane128 = new BorderPane();
        borderPane128.setCenter(label19);
        borderPane128.setPrefSize(300,60);
        BorderPane borderPane129 = new BorderPane();
        borderPane129.setCenter(tableView5);
        borderPane129.setPrefSize(900,250);
        BorderPane borderPane130 = new BorderPane();
        borderPane130.setCenter(jfxButton31);
        borderPane130.setPrefSize(300,30);
        BorderPane borderPane131 = new BorderPane();
        borderPane131.setCenter(jfxButton32);
        borderPane131.setPrefSize(300,30);
        BorderPane borderPane132 = new BorderPane();
        borderPane132.setPrefSize(900,60);
        BorderPane borderPane133 = new BorderPane();
        borderPane133.setCenter(jfxButton33);
        borderPane133.setPrefSize(300,30);
        BorderPane borderPane134 = new BorderPane();
        borderPane134.setCenter(jfxButton34);
        borderPane134.setPrefSize(300,30);
        BorderPane borderPane135 = new BorderPane();
        borderPane135.setPrefSize(900,60);
        borderPane135.setLeft(borderPane133);
        borderPane135.setRight(borderPane130);
        borderPane132.setLeft(borderPane134);
        borderPane132.setRight(borderPane131);
        BorderPane borderPane544 = new BorderPane();
        borderPane544.setCenter(jfxButton544);
        borderPane544.setPrefSize(300,30);
        BorderPane borderPane545 = new BorderPane();
        borderPane545.setCenter(jfxButton545);
        borderPane545.setPrefSize(300,30);
        BorderPane borderPane546 = new BorderPane();
        borderPane546.setPrefSize(900,60);
        borderPane546.setLeft(borderPane544);
        borderPane546.setRight(borderPane545);

        GridPane gridPane13 = new GridPane();
        gridPane13.add(borderPane128,0,0);
        gridPane13.add(borderPane129,0,1);
        gridPane13.add(borderPane546,0,2);
        gridPane13.add(borderPane135,0,3);
        gridPane13.add(borderPane132,0,4);
        gridPane13.setPrefSize(1000,580);
        gridPane13.setAlignment(Pos.CENTER);
        gridPane13.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane13.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        flightScene = new Scene(gridPane13);

//add flight
        jfxTextField29 = new JFXTextField();
        jfxTextField29.setPromptText("Origin");
        jfxTextField29.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField30 = new JFXTextField();
        jfxTextField30.setPromptText("Destination");
        jfxTextField30.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField31 = new JFXTextField();
        jfxTextField31.setPromptText("Date");
        jfxTextField31.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField32 = new JFXTextField();
        jfxTextField32.setPromptText("Time");
        jfxTextField32.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField33 = new JFXTextField();
        jfxTextField33.setPromptText("Number Sold Tickets");
        jfxTextField33.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField34= new JFXTextField();
        jfxTextField34.setPromptText("Flight Time");
        jfxTextField34.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label20 = new Label("Please select the airplane.");
        label20.setTextFill(Color.BLACK);
        Label label21 = new Label("Please select the ticket.");
        label21.setTextFill(Color.BLACK);

        tableView6 = new TableView<AirplaneModel>();
        tableView6.setPrefSize(600,400);
        TableColumn tableColumn31 = new TableColumn("ID");
        tableColumn31.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Long>("id"));
        TableColumn tableColumn32 = new TableColumn("Number Of Seats");
        tableColumn32.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Integer>("numberOfSeats"));
        tableView6.getColumns().addAll(tableColumn31,tableColumn32);
        tableView6.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        tableView7 = new TableView<TicketModel>();
        tableView7.setPrefSize(600,400);
        TableColumn tableColumn33 = new TableColumn("ID");
        tableColumn33.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("id"));
        TableColumn tableColumn34 = new TableColumn("Price");
        tableColumn34.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("price"));
        TableColumn tableColumn35 = new TableColumn("PenaltyOfCancellation");
        tableColumn35.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("penaltyOfCancellation"));
        tableView7.getColumns().addAll(tableColumn33,tableColumn34,tableColumn35);
        tableView7.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        jfxButton35 = new JFXButton();
        jfxButton35.setText("See Airplanes Flights");
        jfxButton35.setPrefSize(95,25);
        jfxButton35.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton35.setTextFill(Color.BLACK);
        jfxButton36 = new JFXButton();
        jfxButton36.setText("Enter");
        jfxButton36.setPrefSize(95,25);
        jfxButton36.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton36.setTextFill(Color.BLACK);
        jfxButton37 = new JFXButton();
        jfxButton37.setText("Back");
        jfxButton37.setPrefSize(95,25);
        jfxButton37.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton37.setTextFill(Color.BLACK);

        BorderPane borderPane137 = new BorderPane();
        borderPane137.setCenter(label20);
        borderPane137.setPrefSize(400,60);
        BorderPane borderPane138 = new BorderPane();
        borderPane138.setCenter(label21);
        borderPane138.setPrefSize(400,60);
        BorderPane borderPane139 = new BorderPane();
        borderPane139.setCenter(tableView6);
        borderPane139.setPrefSize(400,120);
        BorderPane borderPane140 = new BorderPane();
        borderPane140.setCenter(tableView7);
        borderPane140.setPrefSize(400,120);
        BorderPane borderPane141 = new BorderPane();
        borderPane141.setCenter(jfxButton35);
        borderPane141.setPrefSize(400,60);
        BorderPane borderPane142 = new BorderPane();
        borderPane142.setCenter(jfxTextField29);
        borderPane142.setPrefSize(400,60);
        BorderPane borderPane143 = new BorderPane();
        borderPane143.setCenter(jfxTextField30);
        borderPane143.setPrefSize(400,60);
        BorderPane borderPane144 = new BorderPane();
        borderPane144.setCenter(jfxTextField31);
        borderPane144.setPrefSize(400,60);
        BorderPane borderPane145 = new BorderPane();
        borderPane145.setCenter(jfxTextField32);
        borderPane145.setPrefSize(400,60);
        BorderPane borderPane146 = new BorderPane();
        borderPane146.setCenter(jfxTextField33);
        borderPane146.setPrefSize(400,60);
        BorderPane borderPane147 = new BorderPane();
        borderPane147.setCenter(jfxTextField34);
        borderPane147.setPrefSize(400,60);
        BorderPane borderPane148 = new BorderPane();
        borderPane148.setCenter(jfxButton36);
        borderPane147.setPrefSize(400,60);
        BorderPane borderPane149 = new BorderPane();
        borderPane149.setCenter(jfxButton37);
        borderPane149.setPrefSize(400,60);

        GridPane gridPane14 = new GridPane();
        gridPane14.add(borderPane137,0,0);
        gridPane14.add(borderPane138,1,0);
        gridPane14.add(borderPane139,0,1);
        gridPane14.add(borderPane140,1,1);
        gridPane14.add(borderPane141,0,2);
        gridPane14.add(borderPane142,0,3);
        gridPane14.add(borderPane143,1,3);
        gridPane14.add(borderPane144,0,4);
        gridPane14.add(borderPane145,1,4);
        gridPane14.add(borderPane146,0,5);
        gridPane14.add(borderPane147,1,5);
        gridPane14.add(borderPane149,0,6);
        gridPane14.add(borderPane148,1,6);
        gridPane14.setPrefSize(1000,600);
        gridPane14.setAlignment(Pos.CENTER);
        gridPane14.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane14.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        flightRegistrationScene = new Scene(gridPane14);

//edit a flight menu
        Label label24 = new Label("Origin");
        label24.setTextFill(Color.BLACK);
        Label label25 = new Label("Destination");
        label25.setTextFill(Color.BLACK);
        Label label26 = new Label("Date");
        label26.setTextFill(Color.BLACK);
        Label label27 = new Label("Time");
        label27.setTextFill(Color.BLACK);
        Label label28 = new Label("Number Sold Tickets");
        label28.setTextFill(Color.BLACK);
        Label label29 = new Label("Flight Time");
        label29.setTextFill(Color.BLACK);

        jfxTextField35 = new JFXTextField();
        jfxTextField35.setPromptText("Origin");
        jfxTextField35.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField36 = new JFXTextField();
        jfxTextField36.setPromptText("Destination");
        jfxTextField36.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField37 = new JFXTextField();
        jfxTextField37.setPromptText("Date");
        jfxTextField37.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField38 = new JFXTextField();
        jfxTextField38.setPromptText("Time");
        jfxTextField38.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField39 = new JFXTextField();
        jfxTextField39.setPromptText("Number Sold Tickets");
        jfxTextField39.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField40= new JFXTextField();
        jfxTextField40.setPromptText("Flight Time");
        jfxTextField40.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label22 = new Label("Please select the airplane.");
        label22.setTextFill(Color.BLACK);
        Label label23 = new Label("Please select the ticket.");
        label23.setTextFill(Color.BLACK);

        tableView9 = new TableView<AirplaneModel>();
        tableView9.setPrefSize(600,400);
        TableColumn tableColumn44 = new TableColumn("ID");
        tableColumn44.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Long>("id"));
        TableColumn tableColumn45 = new TableColumn("Number Of Seats");
        tableColumn45.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Integer>("numberOfSeats"));
        tableView9.getColumns().addAll(tableColumn44,tableColumn45);
        tableView9.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        tableView10 = new TableView<TicketModel>();
        tableView10.setPrefSize(600,400);
        TableColumn tableColumn46 = new TableColumn("ID");
        tableColumn46.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("id"));
        TableColumn tableColumn47 = new TableColumn("Price");
        tableColumn47.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("price"));
        TableColumn tableColumn48 = new TableColumn("PenaltyOfCancellation");
        tableColumn48.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("penaltyOfCancellation"));
        tableView10.getColumns().addAll(tableColumn46,tableColumn47,tableColumn48);
        tableView10.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        jfxButton38 = new JFXButton();
        jfxButton38.setText("See airplane flights");
        jfxButton38.setPrefSize(190,25);
        jfxButton38.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton38.setTextFill(Color.BLACK);
        jfxButton39 = new JFXButton();
        jfxButton39.setText("Enter");
        jfxButton39.setPrefSize(95,25);
        jfxButton39.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton39.setTextFill(Color.BLACK);
        jfxButton40 = new JFXButton();
        jfxButton40.setText("Back");
        jfxButton40.setPrefSize(95,25);
        jfxButton40.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton40.setTextFill(Color.BLACK);

        BorderPane borderPane150 = new BorderPane();
        borderPane150.setCenter(label22);
        borderPane150.setPrefSize(400,60);
        BorderPane borderPane151 = new BorderPane();
        borderPane151.setCenter(label23);
        borderPane151.setPrefSize(400,60);
        BorderPane borderPane152 = new BorderPane();
        borderPane152.setCenter(tableView9);
        borderPane152.setPrefSize(400,120);
        BorderPane borderPane153 = new BorderPane();
        borderPane153.setCenter(tableView10);
        borderPane153.setPrefSize(400,120);
        BorderPane borderPane154 = new BorderPane();
        borderPane154.setCenter(jfxButton38);
        borderPane154.setPrefSize(400,60);
        BorderPane borderPane155 = new BorderPane();
        borderPane155.setCenter(jfxTextField35);
        borderPane155.setPrefSize(400,60);
        BorderPane borderPane156 = new BorderPane();
        borderPane156.setLeft(label24);
        borderPane156.setPrefSize(400,60);
        BorderPane borderPane157 = new BorderPane();
        borderPane157.setCenter(jfxTextField36);
        borderPane157.setPrefSize(400,60);
        BorderPane borderPane158 = new BorderPane();
        borderPane158.setLeft(label25);
        borderPane158.setPrefSize(400,60);
        BorderPane borderPane159 = new BorderPane();
        borderPane159.setCenter(jfxTextField37);
        borderPane159.setPrefSize(400,60);
        BorderPane borderPane160 = new BorderPane();
        borderPane160.setLeft(label26);
        borderPane160.setPrefSize(400,60);
        BorderPane borderPane161 = new BorderPane();
        borderPane161.setCenter(jfxTextField38);
        borderPane161.setPrefSize(400,60);
        BorderPane borderPane162 = new BorderPane();
        borderPane162.setLeft(label27);
        borderPane162.setPrefSize(400,60);
        BorderPane borderPane163 = new BorderPane();
        borderPane163.setCenter(jfxTextField39);
        borderPane163.setPrefSize(400,60);
        BorderPane borderPane164 = new BorderPane();
        borderPane164.setLeft(label28);
        borderPane164.setPrefSize(400,60);
        BorderPane borderPane165 = new BorderPane();
        borderPane165.setCenter(jfxTextField40);
        borderPane165.setPrefSize(400,60);
        BorderPane borderPane166 = new BorderPane();
        borderPane166.setLeft(label29);
        borderPane166.setPrefSize(400,60);
        BorderPane borderPane167 = new BorderPane();
        borderPane167.setCenter(jfxButton39);
        borderPane167.setPrefSize(400,60);
        BorderPane borderPane168 = new BorderPane();
        borderPane168.setCenter(jfxButton40);
        borderPane168.setPrefSize(400,60);

        GridPane gridPane15 = new GridPane();
        gridPane15.add(borderPane150,0,0);
        gridPane15.add(borderPane151,1,0);
        gridPane15.add(borderPane152,0,1);
        gridPane15.add(borderPane153,1,1);
        gridPane15.add(borderPane154,0,2);
        gridPane15.add(borderPane155,0,3);
        gridPane15.add(borderPane156,0,4);
        gridPane15.add(borderPane157,1,3);
        gridPane15.add(borderPane158,1,4);
        gridPane15.add(borderPane159,0,5);
        gridPane15.add(borderPane160,0,6);
        gridPane15.add(borderPane161,1,5);
        gridPane15.add(borderPane162,1,6);
        gridPane15.add(borderPane163,0,7);
        gridPane15.add(borderPane164,0,8);
        gridPane15.add(borderPane165,1,7);
        gridPane15.add(borderPane166,1,8);
        gridPane15.add(borderPane167,1,9);
        gridPane15.add(borderPane168,0,9);
        gridPane15.setPrefSize(1000,600);
        gridPane15.setAlignment(Pos.CENTER);
        gridPane15.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane15.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        flightEditScene = new Scene(gridPane15);

//critics and suggestions menu
        jfxTextArea300 = new JFXTextArea();
        jfxTextArea300.setPromptText("Critics And Suggestions");

        Label label300 = new Label();
        label300.setTextFill(Color.BLACK);
        label300.setText("Please Write your Critics And Suggestions!");

        jfxButton300 = new JFXButton();
        jfxButton300.setText("Send");
        jfxButton300.setPrefSize(95,25);
        jfxButton300.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton300.setTextFill(Color.BLACK);
        jfxButton301 = new JFXButton();
        jfxButton301.setText("Back");
        jfxButton301.setPrefSize(95,25);
        jfxButton301.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton301.setTextFill(Color.BLACK);

        BorderPane borderPane300 = new BorderPane();
        borderPane300.setCenter(label300);
        borderPane300.setPrefSize(300,60);
        BorderPane borderPane301 = new BorderPane();
        borderPane301.setCenter(jfxTextArea300);
        borderPane301.setPrefSize(300,200);
        BorderPane borderPane302 = new BorderPane();
        borderPane302.setCenter(jfxButton300);
        BorderPane borderPane303 = new BorderPane();
        borderPane303.setCenter(jfxButton301);
        BorderPane borderPane304 = new BorderPane();
        borderPane304.setPrefSize(300,120);
        borderPane304.setRight(borderPane302);
        borderPane304.setLeft(borderPane303);

        GridPane gridPane300 = new GridPane();
        gridPane300.add(borderPane300,0,0);
        gridPane300.add(borderPane301,0,1);
        gridPane300.add(borderPane304,0,2);
        gridPane300.setPrefSize(750,580);
        gridPane300.setAlignment(Pos.CENTER);
        gridPane300.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane300.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        criticsAndSuggestionsScene = new Scene(gridPane300);





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

    public JFXTextField getJfxTextField13()
    {
        return jfxTextField13;
    }

    public void setJfxTextField13(JFXTextField jfxTextField13)
    {
        this.jfxTextField13 = jfxTextField13;
    }

    public JFXTextField getJfxTextField23()
    {
        return jfxTextField23;
    }

    public void setJfxTextField23(JFXTextField jfxTextField23)
    {
        this.jfxTextField23 = jfxTextField23;
    }

    public JFXTextField getJfxTextField24()
    {
        return jfxTextField24;
    }

    public void setJfxTextField24(JFXTextField jfxTextField24)
    {
        this.jfxTextField24 = jfxTextField24;
    }

    public JFXTextField getJfxTextField25()
    {
        return jfxTextField25;
    }

    public void setJfxTextField25(JFXTextField jfxTextField25)
    {
        this.jfxTextField25 = jfxTextField25;
    }

    public JFXTextField getJfxTextField26()
    {
        return jfxTextField26;
    }

    public void setJfxTextField26(JFXTextField jfxTextField26)
    {
        this.jfxTextField26 = jfxTextField26;
    }

    public JFXTextField getJfxTextField29()
    {
        return jfxTextField29;
    }

    public void setJfxTextField29(JFXTextField jfxTextField29)
    {
        this.jfxTextField29 = jfxTextField29;
    }

    public JFXTextField getJfxTextField30()
    {
        return jfxTextField30;
    }

    public void setJfxTextField30(JFXTextField jfxTextField30)
    {
        this.jfxTextField30 = jfxTextField30;
    }

    public JFXTextField getJfxTextField31()
    {
        return jfxTextField31;
    }

    public void setJfxTextField31(JFXTextField jfxTextField31)
    {
        this.jfxTextField31 = jfxTextField31;
    }

    public JFXTextField getJfxTextField32()
    {
        return jfxTextField32;
    }

    public void setJfxTextField32(JFXTextField jfxTextField32)
    {
        this.jfxTextField32 = jfxTextField32;
    }

    public JFXTextField getJfxTextField33()
    {
        return jfxTextField33;
    }

    public void setJfxTextField33(JFXTextField jfxTextField33)
    {
        this.jfxTextField33 = jfxTextField33;
    }

    public JFXTextField getJfxTextField34()
    {
        return jfxTextField34;
    }

    public void setJfxTextField34(JFXTextField jfxTextField34)
    {
        this.jfxTextField34 = jfxTextField34;
    }

    public JFXTextField getJfxTextField35()
    {
        return jfxTextField35;
    }

    public void setJfxTextField35(JFXTextField jfxTextField35)
    {
        this.jfxTextField35 = jfxTextField35;
    }

    public JFXTextField getJfxTextField36()
    {
        return jfxTextField36;
    }

    public void setJfxTextField36(JFXTextField jfxTextField36)
    {
        this.jfxTextField36 = jfxTextField36;
    }

    public JFXTextField getJfxTextField37()
    {
        return jfxTextField37;
    }

    public void setJfxTextField37(JFXTextField jfxTextField37)
    {
        this.jfxTextField37 = jfxTextField37;
    }

    public JFXTextField getJfxTextField38()
    {
        return jfxTextField38;
    }

    public void setJfxTextField38(JFXTextField jfxTextField38)
    {
        this.jfxTextField38 = jfxTextField38;
    }

    public JFXTextField getJfxTextField39()
    {
        return jfxTextField39;
    }

    public void setJfxTextField39(JFXTextField jfxTextField39)
    {
        this.jfxTextField39 = jfxTextField39;
    }

    public JFXTextField getJfxTextField40()
    {
        return jfxTextField40;
    }

    public void setJfxTextField40(JFXTextField jfxTextField40)
    {
        this.jfxTextField40 = jfxTextField40;
    }

    public JFXTextField getJfxTextField70()
    {
        return jfxTextField70;
    }

    public void setJfxTextField70(JFXTextField jfxTextField70)
    {
        this.jfxTextField70 = jfxTextField70;
    }

    public JFXTextArea getJfxTextArea300()
    {
        return jfxTextArea300;
    }

    public void setJfxTextArea300(JFXTextArea jfxTextArea300)
    {
        this.jfxTextArea300 = jfxTextArea300;
    }

    public JFXPasswordField getJfxPasswordField70()
    {
        return jfxPasswordField70;
    }

    public void setJfxPasswordField70(JFXPasswordField jfxPasswordField70)
    {
        this.jfxPasswordField70 = jfxPasswordField70;
    }

    public JFXPasswordField getJfxPasswordField71()
    {
        return jfxPasswordField71;
    }

    public void setJfxPasswordField71(JFXPasswordField jfxPasswordField71)
    {
        this.jfxPasswordField71 = jfxPasswordField71;
    }

    public JFXPasswordField getJfxPasswordField72()
    {
        return jfxPasswordField72;
    }

    public void setJfxPasswordField72(JFXPasswordField jfxPasswordField72)
    {
        this.jfxPasswordField72 = jfxPasswordField72;
    }

    public JFXPasswordField getJfxPasswordField73()
    {
        return jfxPasswordField73;
    }

    public void setJfxPasswordField73(JFXPasswordField jfxPasswordField73)
    {
        this.jfxPasswordField73 = jfxPasswordField73;
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

    public JFXButton getJfxButton15()
    {
        return jfxButton15;
    }

    public void setJfxButton15(JFXButton jfxButton15)
    {
        this.jfxButton15 = jfxButton15;
    }

    public JFXButton getJfxButton16()
    {
        return jfxButton16;
    }

    public void setJfxButton16(JFXButton jfxButton16)
    {
        this.jfxButton16 = jfxButton16;
    }

    public JFXButton getJfxButton17()
    {
        return jfxButton17;
    }

    public void setJfxButton17(JFXButton jfxButton17)
    {
        this.jfxButton17 = jfxButton17;
    }

    public JFXButton getJfxButton18()
    {
        return jfxButton18;
    }

    public void setJfxButton18(JFXButton jfxButton18)
    {
        this.jfxButton18 = jfxButton18;
    }

    public JFXButton getJfxButton19()
    {
        return jfxButton19;
    }

    public void setJfxButton19(JFXButton jfxButton19)
    {
        this.jfxButton19 = jfxButton19;
    }

    public JFXButton getJfxButton20()
    {
        return jfxButton20;
    }

    public void setJfxButton20(JFXButton jfxButton20)
    {
        this.jfxButton20 = jfxButton20;
    }

    public JFXButton getJfxButton21()
    {
        return jfxButton21;
    }

    public void setJfxButton21(JFXButton jfxButton21)
    {
        this.jfxButton21 = jfxButton21;
    }

    public JFXButton getJfxButton22()
    {
        return jfxButton22;
    }

    public void setJfxButton22(JFXButton jfxButton22)
    {
        this.jfxButton22 = jfxButton22;
    }

    public JFXButton getJfxButton31()
    {
        return jfxButton31;
    }

    public void setJfxButton31(JFXButton jfxButton31)
    {
        this.jfxButton31 = jfxButton31;
    }

    public JFXButton getJfxButton32()
    {
        return jfxButton32;
    }

    public void setJfxButton32(JFXButton jfxButton32)
    {
        this.jfxButton32 = jfxButton32;
    }

    public JFXButton getJfxButton33()
    {
        return jfxButton33;
    }

    public void setJfxButton33(JFXButton jfxButton33)
    {
        this.jfxButton33 = jfxButton33;
    }

    public JFXButton getJfxButton34()
    {
        return jfxButton34;
    }

    public void setJfxButton34(JFXButton jfxButton34)
    {
        this.jfxButton34 = jfxButton34;
    }

    public JFXButton getJfxButton35()
    {
        return jfxButton35;
    }

    public void setJfxButton35(JFXButton jfxButton35)
    {
        this.jfxButton35 = jfxButton35;
    }

    public JFXButton getJfxButton36()
    {
        return jfxButton36;
    }

    public void setJfxButton36(JFXButton jfxButton36)
    {
        this.jfxButton36 = jfxButton36;
    }

    public JFXButton getJfxButton37()
    {
        return jfxButton37;
    }

    public void setJfxButton37(JFXButton jfxButton37)
    {
        this.jfxButton37 = jfxButton37;
    }

    public JFXButton getJfxButton38()
    {
        return jfxButton38;
    }

    public void setJfxButton38(JFXButton jfxButton38)
    {
        this.jfxButton38 = jfxButton38;
    }

    public JFXButton getJfxButton39()
    {
        return jfxButton39;
    }

    public void setJfxButton39(JFXButton jfxButton39)
    {
        this.jfxButton39 = jfxButton39;
    }

    public JFXButton getJfxButton40()
    {
        return jfxButton40;
    }

    public void setJfxButton40(JFXButton jfxButton40)
    {
        this.jfxButton40 = jfxButton40;
    }

    public JFXButton getJfxButton70()
    {
        return jfxButton70;
    }

    public void setJfxButton70(JFXButton jfxButton70)
    {
        this.jfxButton70 = jfxButton70;
    }

    public JFXButton getJfxButton72()
    {
        return jfxButton72;
    }

    public void setJfxButton72(JFXButton jfxButton72)
    {
        this.jfxButton72 = jfxButton72;
    }

    public JFXButton getJfxButton74()
    {
        return jfxButton74;
    }

    public void setJfxButton74(JFXButton jfxButton74)
    {
        this.jfxButton74 = jfxButton74;
    }

    public JFXButton getJfxButton75()
    {
        return jfxButton75;
    }

    public void setJfxButton75(JFXButton jfxButton75)
    {
        this.jfxButton75 = jfxButton75;
    }

    public JFXButton getJfxButton300()
    {
        return jfxButton300;
    }

    public void setJfxButton300(JFXButton jfxButton300)
    {
        this.jfxButton300 = jfxButton300;
    }

    public JFXButton getJfxButton301()
    {
        return jfxButton301;
    }

    public void setJfxButton301(JFXButton jfxButton301)
    {
        this.jfxButton301 = jfxButton301;
    }

    public ChoiceBox<String> getChoiceBox()
    {
        return choiceBox;
    }

    public void setChoiceBox(ChoiceBox<String> choiceBox)
    {
        this.choiceBox = choiceBox;
    }

    public TableView<EmployeeModel> getTableView()
    {
        return tableView;
    }

    public void setTableView(TableView<EmployeeModel> tableView)
    {
        this.tableView = tableView;
    }

    public TableView<TicketModel> getTableView3()
    {
        return tableView3;
    }

    public void setTableView3(TableView<TicketModel> tableView3)
    {
        this.tableView3 = tableView3;
    }

    public TableView<FlightModel> getTableView5()
    {
        return tableView5;
    }

    public void setTableView5(TableView<FlightModel> tableView5)
    {
        this.tableView5 = tableView5;
    }

    public TableView<AirplaneModel> getTableView6()
    {
        return tableView6;
    }

    public void setTableView6(TableView<AirplaneModel> tableView6)
    {
        this.tableView6 = tableView6;
    }

    public TableView<TicketModel> getTableView7()
    {
        return tableView7;
    }

    public void setTableView7(TableView<TicketModel> tableView7)
    {
        this.tableView7 = tableView7;
    }

    public TableView<FlightModel> getTableView8()
    {
        return tableView8;
    }

    public void setTableView8(TableView<FlightModel> tableView8)
    {
        this.tableView8 = tableView8;
    }

    public TableView<AirplaneModel> getTableView9()
    {
        return tableView9;
    }

    public void setTableView9(TableView<AirplaneModel> tableView9)
    {
        this.tableView9 = tableView9;
    }

    public TableView<TicketModel> getTableView10()
    {
        return tableView10;
    }

    public void setTableView10(TableView<TicketModel> tableView10)
    {
        this.tableView10 = tableView10;
    }

    public Scene getEditAllScene()
    {
        return editAllScene;
    }

    public void setEditAllScene(Scene editAllScene)
    {
        this.editAllScene = editAllScene;
    }

    public Scene getMainMenuScene()
    {
        return mainMenuScene;
    }

    public void setMainMenuScene(Scene mainMenuScene)
    {
        this.mainMenuScene = mainMenuScene;
    }

    public Scene getLoginScene()
    {
        return loginScene;
    }

    public void setLoginScene(Scene loginScene)
    {
        this.loginScene = loginScene;
    }

    public Scene getChangePasswordScene()
    {
        return changePasswordScene;
    }

    public void setChangePasswordScene(Scene changePasswordScene)
    {
        this.changePasswordScene = changePasswordScene;
    }

    public Scene getTicketScene()
    {
        return ticketScene;
    }

    public void setTicketScene(Scene ticketScene)
    {
        this.ticketScene = ticketScene;
    }

    public Scene getTicketRegistrationScene()
    {
        return ticketRegistrationScene;
    }

    public void setTicketRegistrationScene(Scene ticketRegistrationScene)
    {
        this.ticketRegistrationScene = ticketRegistrationScene;
    }

    public Scene getTicketEditScene()
    {
        return ticketEditScene;
    }

    public void setTicketEditScene(Scene ticketEditScene)
    {
        this.ticketEditScene = ticketEditScene;
    }

    public Scene getFlightsOfAirplaneScene()
    {
        return flightsOfAirplaneScene;
    }

    public void setFlightsOfAirplaneScene(Scene flightsOfAirplaneScene)
    {
        this.flightsOfAirplaneScene = flightsOfAirplaneScene;
    }

    public Scene getFlightScene()
    {
        return flightScene;
    }

    public void setFlightScene(Scene flightScene)
    {
        this.flightScene = flightScene;
    }

    public Scene getFlightRegistrationScene()
    {
        return flightRegistrationScene;
    }

    public void setFlightRegistrationScene(Scene flightRegistrationScene)
    {
        this.flightRegistrationScene = flightRegistrationScene;
    }

    public Scene getFlightEditScene()
    {
        return flightEditScene;
    }

    public void setFlightEditScene(Scene flightEditScene)
    {
        this.flightEditScene = flightEditScene;
    }

    public Scene getCriticsAndSuggestionsScene()
    {
        return criticsAndSuggestionsScene;
    }

    public void setCriticsAndSuggestionsScene(Scene criticsAndSuggestionsScene)
    {
        this.criticsAndSuggestionsScene = criticsAndSuggestionsScene;
    }

    public Scene getShowEmployeesScene()
    {
        return showEmployeesScene;
    }

    public void setShowEmployeesScene(Scene showEmployeesScene)
    {
        this.showEmployeesScene = showEmployeesScene;
    }

    public JFXButton getJfxButton544()
    {
        return jfxButton544;
    }

    public void setJfxButton544(JFXButton jfxButton544)
    {
        this.jfxButton544 = jfxButton544;
    }

    public JFXButton getJfxButton545()
    {
        return jfxButton545;
    }

    public void setJfxButton545(JFXButton jfxButton545)
    {
        this.jfxButton545 = jfxButton545;
    }

    public TableView<PassengerModel> getTableView400()
    {
        return tableView400;
    }

    public void setTableView400(TableView<PassengerModel> tableView400)
    {
        this.tableView400 = tableView400;
    }

    public Scene getFlightsPassengersScene()
    {
        return flightsPassengersScene;
    }

    public void setFlightsPassengersScene(Scene flightsPassengersScene)
    {
        this.flightsPassengersScene = flightsPassengersScene;
    }
}
