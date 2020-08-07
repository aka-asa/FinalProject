package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
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

public class ManagerView
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
    private JFXTextField jfxTextField13;
    private JFXTextField jfxTextField14;
    private JFXTextField jfxTextField15;
    private JFXTextField jfxTextField16;
    private JFXTextField jfxTextField17;
    private JFXTextField jfxTextField18;
    private JFXTextField jfxTextField19;
    private JFXTextField jfxTextField20;
    private JFXTextField jfxTextField21;
    private JFXTextField jfxTextField22;
    private JFXTextField jfxTextField23;
    private JFXTextField jfxTextField24;
    private JFXTextField jfxTextField25;
    private JFXTextField jfxTextField26;
    private JFXTextField jfxTextField27;
    private JFXTextField jfxTextField28;
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
    private JFXTextField jfxTextField41;
    private JFXTextField jfxTextField42;
    private JFXTextField jfxTextField43;
    private JFXTextField jfxTextField44;
    private JFXTextField jfxTextField45;
    private JFXTextField jfxTextField46;
    private JFXTextField jfxTextField47;
    private JFXTextField jfxTextField48;
    private JFXTextField jfxTextField49;
    private JFXTextField jfxTextField50;
    private JFXTextField jfxTextField51;
    private JFXTextField jfxTextField52;
    private JFXTextField jfxTextField53;
    private JFXTextField jfxTextField54;
    private JFXTextField jfxTextField55;
    private JFXTextField jfxTextField70;
    private JFXTextField jfxTextField300;
    private JFXTextField jfxTextField301;
    private JFXTextField jfxTextField311;
    private JFXTextField jfxTextField448;
    private JFXTextField jfxTextField449;
    private JFXTextField jfxTextField450;
    private JFXTextField jfxTextField451;
    private JFXTextField jfxTextField452;
    private JFXTextField jfxTextField453;
    private JFXTextField jfxTextField454;
    private JFXTextField jfxTextField455;
    private JFXPasswordField jfxPasswordField;
    private JFXPasswordField jfxPasswordField2;
    private JFXPasswordField jfxPasswordField3;
    private JFXPasswordField jfxPasswordField4;
    private JFXPasswordField jfxPasswordField5;
    private JFXPasswordField jfxPasswordField6;
    private JFXPasswordField jfxPasswordField70;
    private JFXPasswordField jfxPasswordField71;
    private JFXPasswordField jfxPasswordField72;
    private JFXPasswordField jfxPasswordField73;
    private JFXButton jfxButton;
    private JFXButton jfxButton2;
    private JFXButton jfxButton3;
    private JFXButton jfxButton4;
    private JFXButton jfxButton7;
    private JFXButton jfxButton8;
    private JFXButton jfxButton9;
    private JFXButton jfxButton11;
    private JFXButton jfxButton12;
    private JFXButton jfxButton13;
    private JFXButton jfxButton14;
    private JFXButton jfxButton15;
    private JFXButton jfxButton16;
    private JFXButton jfxButton17;
    private JFXButton jfxButton18;
    private JFXButton jfxButton19;
    private JFXButton jfxButton20;
    private JFXButton jfxButton21;
    private JFXButton jfxButton22;
    private JFXButton jfxButton23;
    private JFXButton jfxButton24;
    private JFXButton jfxButton25;
    private JFXButton jfxButton26;
    private JFXButton jfxButton27;
    private JFXButton jfxButton28;
    private JFXButton jfxButton29;
    private JFXButton jfxButton30;
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
    private JFXButton jfxButton41;
    private JFXButton jfxButton42;
    private JFXButton jfxButton43;
    private JFXButton jfxButton46;
    private JFXButton jfxButton47;
    private JFXButton jfxButton48;
    private JFXButton jfxButton49;
    private JFXButton jfxButton50;
    private JFXButton jfxButton51;
    private JFXButton jfxButton52;
    private JFXButton jfxButton53;
    private JFXButton jfxButton70;
    private JFXButton jfxButton71;
    private JFXButton jfxButton72;
    private JFXButton jfxButton74;
    private JFXButton jfxButton75;
    private JFXButton jfxButton446;
    private JFXButton jfxButton447;
    private JFXButton jfxButton448;
    private JFXButton jfxButton449;
    private JFXButton jfxButton452;
    private JFXButton jfxButton453;
    private JFXButton jfxButton544;
    private JFXButton jfxButton545;
    private ChoiceBox <String> choiceBox;
    private TableView <ManagerModel> tableView;
    private TableView <PassengerModel> tableView2;
    private TableView <TicketModel> tableView3;
    private TableView <AirplaneModel> tableView4;
    private TableView <FlightModel> tableView5;
    private TableView <AirplaneModel> tableView6;
    private TableView <TicketModel> tableView7;
    private TableView <FlightModel> tableView8;
    private TableView <AirplaneModel> tableView9;
    private TableView <TicketModel> tableView10;
    private TableView <String> tableView11;
    private TableView <ManagerModel> tableView12;
    private TableView <EmployeeModel> tableView412;
    private TableView <PassengerModel> tableView400;
    private Scene registrationScene;
    private Scene editAllScene;
    private Scene showManagersScene;
    private Scene mainMenuScene;
    private Scene passengerScene;
    private Scene loginScene;
    private Scene changePasswordScene;
    private Scene passengerEditScene;
    private Scene ticketScene;
    private Scene ticketRegistrationScene;
    private Scene ticketEditScene;
    private Scene airplaneScene;
    private Scene airplaneRegistrationScene;
    private Scene airplaneEditScene;
    private Scene flightsOfAirplaneScene;
    private Scene flightScene;
    private Scene flightRegistrationScene;
    private Scene flightEditScene;
    private Scene criticsAndSuggestionsScene;
    private Scene manageManagersScene;
    private Scene managerRegistrationScene;
    private Scene managerEditScene;
    private Scene manageEmployeesScene;
    private Scene employeeRegistrationScene;
    private Scene employeeEditScene;
    private Scene flightsPassengersScene;

    public ManagerView()
    {
//show managers
        tableView = new TableView<ManagerModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<ManagerModel,Long>("id"));
        TableColumn tableColumn2 = new TableColumn("Name");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("name"));
        TableColumn tableColumn3 = new TableColumn("Last Name");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("lastName"));
        TableColumn tableColumn4 = new TableColumn("Username");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<ManagerModel, String>("username"));
        TableColumn tableColumn5 = new TableColumn("Password");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("password"));
        TableColumn tableColumn6 = new TableColumn("Email");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("email"));
        TableColumn tableColumn7 = new TableColumn("Phone Number");
        tableColumn7.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("phoneNumber"));
        tableColumn7.setMinWidth(50);
        TableColumn tableColumn8 = new TableColumn("Address");
        tableColumn8.setCellValueFactory(new PropertyValueFactory<ManagerModel,String>("address"));
        TableColumn tableColumn9 = new TableColumn("Salary");
        tableColumn9.setCellValueFactory(new PropertyValueFactory<ManagerModel,Long>("salary"));

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3,tableColumn4,tableColumn5,tableColumn6,tableColumn7,tableColumn8,tableColumn9);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        BorderPane borderPane31 = new BorderPane();
        borderPane31.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        borderPane31.setCenter(tableView);
        borderPane31.setPrefSize(600,400);

        showManagersScene = new Scene(borderPane31);

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

        GridPane gridPane71 = new GridPane();;
        gridPane71.add(borderPane70,0,0);
        gridPane71.add(borderPane71,0,1);
        gridPane71.add(borderPane72,0,2);
        gridPane71.add(borderPane85,0,3);

        gridPane71.setPrefSize(750,580);
        gridPane71.setAlignment(Pos.CENTER);
        gridPane71.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane71.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        changePasswordScene = new Scene(gridPane71);

//manage employees
        tableView412 = new TableView<EmployeeModel>();
        TableColumn tableColumn450 = new TableColumn("ID");
        tableColumn450.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("id"));
        tableColumn450.setMinWidth(50);
        TableColumn tableColumn451 = new TableColumn("Name");
        tableColumn451.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("name"));
        tableColumn451.setMinWidth(50);
        TableColumn tableColumn452 = new TableColumn("Last Name");
        tableColumn452.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("lastName"));
        tableColumn452.setMinWidth(50);
        tableColumn452.setMinWidth(50);
        TableColumn tableColumn453 = new TableColumn("Username");
        tableColumn453.setCellValueFactory(new PropertyValueFactory<PassengerModel, String>("username"));
        tableColumn453.setMinWidth(50);
        TableColumn tableColumn454 = new TableColumn("Password");
        tableColumn454.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("password"));
        tableColumn454.setMinWidth(50);
        TableColumn tableColumn455 = new TableColumn("Email");
        tableColumn455.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("email"));
        tableColumn455.setMinWidth(100);
        TableColumn tableColumn456 = new TableColumn("Address");
        tableColumn456.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("address"));
        tableColumn456.setMinWidth(50);
        TableColumn tableColumn457 = new TableColumn("Phone Number");
        tableColumn457.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("phoneNumber"));
        tableColumn457.setMinWidth(100);
        TableColumn tableColumn458 = new TableColumn("Salary");
        tableColumn458.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("salary"));
        tableColumn458.setMinWidth(50);
        tableView412.getColumns().addAll(tableColumn450,tableColumn451,tableColumn452,tableColumn453,tableColumn454,tableColumn455,tableColumn456,tableColumn457,tableColumn458);
        tableView412.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label431 = new Label();
        label431.setTextFill(Color.BLACK);
        label431.setText("Select a row from table.");

        jfxButton446 = new JFXButton();
        jfxButton446.setText("Add");
        jfxButton446.setPrefSize(95,25);
        jfxButton446.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton446.setTextFill(Color.BLACK);
        jfxButton447 = new JFXButton();
        jfxButton447.setText("Edit");
        jfxButton447.setPrefSize(95,25);
        jfxButton447.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton447.setTextFill(Color.BLACK);
        jfxButton448 = new JFXButton();
        jfxButton448.setText("Delete");
        jfxButton448.setPrefSize(95,25);
        jfxButton448.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton448.setTextFill(Color.BLACK);
        jfxButton449 = new JFXButton();
        jfxButton449.setText("Back");
        jfxButton449.setPrefSize(95,25);
        jfxButton449.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton449.setTextFill(Color.BLACK);

        BorderPane borderPane475 = new BorderPane();
        borderPane475.setCenter(label431);
        borderPane475.setPrefSize(300,60);
        BorderPane borderPane476 = new BorderPane();
        borderPane476.setCenter(tableView412);
        borderPane476.setPrefSize(300,250);
        BorderPane borderPane477 = new BorderPane();
        borderPane477.setCenter(jfxButton446);
        borderPane477.setPrefSize(300,30);
        BorderPane borderPane478 = new BorderPane();
        borderPane478.setCenter(jfxButton448);
        borderPane478.setPrefSize(300,30);
        BorderPane borderPane479 = new BorderPane();
        borderPane479.setPrefSize(800,60);
        BorderPane borderPane480 = new BorderPane();
        borderPane480.setCenter(jfxButton447);
        borderPane480.setPrefSize(300,30);
        BorderPane borderPane481 = new BorderPane();
        borderPane481.setCenter(jfxButton449);
        borderPane481.setPrefSize(300,30);
        BorderPane borderPane482 = new BorderPane();
        borderPane482.setPrefSize(800,60);
        borderPane479.setLeft(borderPane478);
        borderPane479.setRight(borderPane477);
        borderPane482.setLeft(borderPane481);
        borderPane482.setRight(borderPane480);

        GridPane gridPane417 = new GridPane();
        gridPane417.add(borderPane475,0,0);
        gridPane417.add(borderPane476,0,1);
        gridPane417.add(borderPane479,0,2);
        gridPane417.add(borderPane482,0,3);
        gridPane417.setPrefSize(900,580);
        gridPane417.setAlignment(Pos.CENTER);
        gridPane417.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane417.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        manageEmployeesScene = new Scene(gridPane417);

//add employee
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
        jfxTextField11 = new JFXTextField();
        jfxTextField11.setPromptText("Address");
        jfxTextField11.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField311 = new JFXTextField();
        jfxTextField311.setPromptText("Salary");
        jfxTextField311.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
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
        BorderPane borderPane25 = new BorderPane();
        borderPane25.setCenter(jfxTextField11);
        borderPane25.setPrefSize(600,60);
        BorderPane borderPane325 = new BorderPane();
        borderPane325.setCenter(jfxTextField311);
        borderPane325.setPrefSize(600,60);
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
        gridPane.add(borderPane25,0,7);
        gridPane.add(borderPane325,0,8);
        gridPane.add(borderPane7,0,9);
        gridPane.setPrefSize(750,580);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        employeeRegistrationScene = new Scene(gridPane);

//edit an employee
        jfxTextField448 = new JFXTextField();
        jfxTextField448.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField449 = new JFXTextField();
        jfxTextField449.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField450 = new JFXTextField();
        jfxTextField450.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField451= new JFXTextField();
        jfxTextField451.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField452 = new JFXTextField();
        jfxTextField452.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField453 = new JFXTextField();
        jfxTextField453.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField454 = new JFXTextField();
        jfxTextField454.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField455 = new JFXTextField();
        jfxTextField455.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label432 = new Label();
        Label label433 = new Label();
        Label label434 = new Label();
        Label label435 = new Label();
        Label label436 = new Label();
        Label label437 = new Label();
        Label label438 = new Label();
        Label label439 = new Label();
        label432.setTextFill(Color.BLACK);
        label433.setTextFill(Color.BLACK);
        label434.setTextFill(Color.BLACK);
        label435.setTextFill(Color.BLACK);
        label436.setTextFill(Color.BLACK);
        label437.setTextFill(Color.BLACK);
        label438.setTextFill(Color.BLACK);
        label439.setTextFill(Color.BLACK);
        label432.setText("Name");
        label433.setText("Last Name");
        label434.setText("Username");
        label435.setText("Password");
        label436.setText("Email");
        label437.setText("Phone Number");
        label438.setText("Address");
        label439.setText("Salary");

        jfxButton452 = new JFXButton();
        jfxButton452.setText("Enter");
        jfxButton452.setPrefSize(95,25);
        jfxButton452.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton452.setTextFill(Color.BLACK);
        jfxButton453 = new JFXButton();
        jfxButton453.setText("Back");
        jfxButton453.setPrefSize(95,25);
        jfxButton453.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton453.setTextFill(Color.BLACK);

        BorderPane borderPane495 = new BorderPane();
        borderPane495.setLeft(label432);
        borderPane495.setPrefSize(300,30);
        BorderPane borderPane496 = new BorderPane();
        borderPane496.setCenter(jfxTextField448);
        borderPane496.setPrefSize(300,30);
        BorderPane borderPane497 = new BorderPane();
        borderPane497.setLeft(label433);
        borderPane497.setPrefSize(300,30);
        BorderPane borderPane498 = new BorderPane();
        borderPane498.setCenter(jfxTextField449);
        borderPane498.setPrefSize(300,30);
        BorderPane borderPane499 = new BorderPane();
        borderPane499.setLeft(label434);
        borderPane499.setPrefSize(300,30);
        BorderPane borderPane500 = new BorderPane();
        borderPane500.setCenter(jfxTextField450);
        borderPane500.setPrefSize(300,30);
        BorderPane borderPane501 = new BorderPane();
        borderPane501.setLeft(label435);
        borderPane501.setPrefSize(300,30);
        BorderPane borderPane502 = new BorderPane();
        borderPane502.setCenter(jfxTextField451);
        borderPane502.setPrefSize(300,30);
        BorderPane borderPane503 = new BorderPane();
        borderPane503.setLeft(label436);
        borderPane503.setPrefSize(300,30);
        BorderPane borderPane504 = new BorderPane();
        borderPane504.setCenter(jfxTextField452);
        borderPane504.setPrefSize(300,30);
        BorderPane borderPane505 = new BorderPane();
        borderPane505.setLeft(label437);
        borderPane505.setPrefSize(300,30);
        BorderPane borderPane506 = new BorderPane();
        borderPane506.setCenter(jfxTextField453);
        borderPane506.setPrefSize(300,30);
        BorderPane borderPane507 = new BorderPane();
        borderPane507.setLeft(label438);
        borderPane507.setPrefSize(300,30);
        BorderPane borderPane508 = new BorderPane();
        borderPane508.setCenter(jfxTextField454);
        borderPane508.setPrefSize(300,30);
        BorderPane borderPane509 = new BorderPane();
        borderPane509.setLeft(label439);
        borderPane509.setPrefSize(300,30);
        BorderPane borderPane510 = new BorderPane();
        borderPane510.setCenter(jfxTextField455);
        borderPane510.setPrefSize(300,30);

        BorderPane borderPane511 = new BorderPane();
        borderPane511.setPrefSize(600,60);
        BorderPane borderPane512 = new BorderPane();
        borderPane512.setCenter(jfxButton452);
        BorderPane borderPane513 = new BorderPane();
        borderPane513.setCenter(jfxButton453);
        borderPane511.setRight(borderPane512);
        borderPane511.setLeft(borderPane513);

        GridPane gridPane419 = new GridPane();
        gridPane419.add(borderPane496,0,0);
        gridPane419.add(borderPane495,0,1);
        gridPane419.add(borderPane498,0,2);
        gridPane419.add(borderPane497,0,3);
        gridPane419.add(borderPane500,0,4);
        gridPane419.add(borderPane499,0,5);
        gridPane419.add(borderPane502,0,6);
        gridPane419.add(borderPane501,0,7);
        gridPane419.add(borderPane504,0,8);
        gridPane419.add(borderPane503,0,9);
        gridPane419.add(borderPane506,0,10);
        gridPane419.add(borderPane505,0,11);
        gridPane419.add(borderPane508,0,12);
        gridPane419.add(borderPane507,0,13);
        gridPane419.add(borderPane510,0,14);
        gridPane419.add(borderPane509,0,15);
        gridPane419.add(borderPane511,0,16);
        gridPane419.setPrefSize(750,750);
        gridPane419.setAlignment(Pos.CENTER);
        gridPane419.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane419.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        employeeEditScene = new Scene(gridPane419);

//manager main menu
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
        choiceBox.getItems().add("Edit account (cannot be accessed by super admin)");
        choiceBox.getItems().add("Change password");
        choiceBox.getItems().add("Manage employees");
        choiceBox.getItems().add("Manage passengers");
        choiceBox.getItems().add("Manage flights");
        choiceBox.getItems().add("Manage tickets");
        choiceBox.getItems().add("Manage airplanes");
        choiceBox.getItems().add("Manage critics and suggestions");
        choiceBox.getItems().add("Manage managers (only accessible by super admin)");

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
        gridPane2.add(borderPane27,0,10);
        gridPane2.add(borderPane26,0,11);
        gridPane2.add(borderPane22,0,12);

        gridPane2.setPrefSize(750,580);
        gridPane2.setAlignment(Pos.CENTER);
        gridPane2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane2.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        editAllScene = new Scene(gridPane2);

//manage passengers
        tableView2 = new TableView<PassengerModel>();
        TableColumn tableColumn10 = new TableColumn("ID");
        tableColumn10.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("id"));
        tableColumn10.setMinWidth(50);
        TableColumn tableColumn11 = new TableColumn("Name");
        tableColumn11.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("name"));
        tableColumn11.setMinWidth(50);
        TableColumn tableColumn12 = new TableColumn("Last Name");
        tableColumn12.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("lastName"));
        tableColumn12.setMinWidth(50);
        TableColumn tableColumn13 = new TableColumn("Username");
        tableColumn13.setCellValueFactory(new PropertyValueFactory<PassengerModel, String>("username"));
        tableColumn13.setMinWidth(50);
        TableColumn tableColumn14 = new TableColumn("Password");
        tableColumn14.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("password"));
        tableColumn14.setMinWidth(50);
        TableColumn tableColumn15 = new TableColumn("Email");
        tableColumn15.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("email"));
        tableColumn15.setMinWidth(100);
        TableColumn tableColumn16 = new TableColumn("Phone Number");
        tableColumn16.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("phoneNumber"));
        tableColumn16.setMinWidth(100);
        TableColumn tableColumn17 = new TableColumn("Credit");
        tableColumn17.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("credit"));
        tableColumn17.setMinWidth(50);
        tableView2.getColumns().addAll(tableColumn10,tableColumn11,tableColumn12,tableColumn13,tableColumn14,tableColumn15,tableColumn16,tableColumn17);
        tableView2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label9 = new Label();
        label9.setTextFill(Color.BLACK);
        label9.setText("Select a row from table.");

//        jfxButton10 = new JFXButton();
//        jfxButton10.setText("Add");
//        jfxButton10.setPrefSize(95,25);
//        jfxButton10.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
//        jfxButton10.setTextFill(Color.BLACK);
        jfxButton11 = new JFXButton();
        jfxButton11.setText("Edit");
        jfxButton11.setPrefSize(95,25);
        jfxButton11.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton11.setTextFill(Color.BLACK);
        jfxButton12 = new JFXButton();
        jfxButton12.setText("Delete");
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
        borderPane40.setCenter(tableView2);
        borderPane40.setPrefSize(300,250);
//        BorderPane borderPane41 = new BorderPane();
//        borderPane41.setCenter(jfxButton10);
//        borderPane41.setPrefSize(300,30);
        BorderPane borderPane42 = new BorderPane();
        borderPane42.setCenter(jfxButton11);
        borderPane42.setPrefSize(300,30);
        BorderPane borderPane43 = new BorderPane();
        borderPane43.setPrefSize(800,60);
        BorderPane borderPane28 = new BorderPane();
        borderPane28.setCenter(jfxButton12);
        borderPane28.setPrefSize(300,30);
        BorderPane borderPane29 = new BorderPane();
        borderPane29.setCenter(jfxButton13);
        borderPane29.setPrefSize(300,30);
        BorderPane borderPane30 = new BorderPane();
        borderPane30.setPrefSize(800,60);
        borderPane30.setLeft(borderPane28);
//        borderPane30.setRight(borderPane41);
        borderPane43.setLeft(borderPane29);
        borderPane43.setRight(borderPane42);

        GridPane gridPane6 = new GridPane();;
        gridPane6.add(borderPane39,0,0);
        gridPane6.add(borderPane40,0,1);
        gridPane6.add(borderPane30,0,2);
        gridPane6.add(borderPane43,0,3);

        gridPane6.setPrefSize(900,580);
        gridPane6.setAlignment(Pos.CENTER);
        gridPane6.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane6.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        passengerScene = new Scene(gridPane6);

//edit a passenger menu
        jfxTextField18 = new JFXTextField();
        jfxTextField18.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField19 = new JFXTextField();
        jfxTextField19.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField20 = new JFXTextField();
        jfxTextField20.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField21= new JFXTextField();
        jfxTextField21.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField22 = new JFXTextField();
        jfxTextField22.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField301 = new JFXTextField();
        jfxTextField301.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label10 = new Label();
        Label label11 = new Label();
        Label label12 = new Label();
        Label label13 = new Label();
        Label label14 = new Label();
        Label label300 = new Label();
        label10.setTextFill(Color.BLACK);
        label11.setTextFill(Color.BLACK);
        label12.setTextFill(Color.BLACK);
        label13.setTextFill(Color.BLACK);
        label14.setTextFill(Color.BLACK);
        label300.setTextFill(Color.BLACK);
        label10.setText("Name");
        label11.setText("Last Name");
        label12.setText("Username");
        label13.setText("Email");
        label14.setText("Phone Number");
        label300.setText("Credit");

        jfxButton7 = new JFXButton();
        jfxButton7.setText("Enter");
        jfxButton7.setPrefSize(95,25);
        jfxButton7.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton7.setTextFill(Color.BLACK);
        jfxButton14 = new JFXButton();
        jfxButton14.setText("Back");
        jfxButton14.setPrefSize(95,25);
        jfxButton14.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton14.setTextFill(Color.BLACK);

        BorderPane borderPane48 = new BorderPane();
        borderPane48.setLeft(label10);
        borderPane48.setPrefSize(300,30);
        BorderPane borderPane49 = new BorderPane();
        borderPane49.setCenter(jfxTextField18);
        borderPane49.setPrefSize(300,30);
        BorderPane borderPane50 = new BorderPane();
        borderPane50.setLeft(label11);
        borderPane50.setPrefSize(300,30);
        BorderPane borderPane51 = new BorderPane();
        borderPane51.setCenter(jfxTextField19);
        borderPane51.setPrefSize(300,30);
        BorderPane borderPane52 = new BorderPane();
        borderPane52.setLeft(label12);
        borderPane52.setPrefSize(300,30);
        BorderPane borderPane53 = new BorderPane();
        borderPane53.setCenter(jfxTextField20);
        borderPane53.setPrefSize(300,30);
        BorderPane borderPane54 = new BorderPane();
        borderPane54.setLeft(label13);
        borderPane54.setPrefSize(300,30);
        BorderPane borderPane55 = new BorderPane();
        borderPane55.setCenter(jfxTextField21);
        borderPane55.setPrefSize(300,30);
        BorderPane borderPane56 = new BorderPane();
        borderPane56.setLeft(label14);
        borderPane56.setPrefSize(300,30);
        BorderPane borderPane57 = new BorderPane();
        borderPane57.setCenter(jfxTextField22);
        borderPane57.setPrefSize(300,30);
        BorderPane borderPane301 = new BorderPane();
        borderPane301.setLeft(label300);
        borderPane301.setPrefSize(300,30);
        BorderPane borderPane302 = new BorderPane();
        borderPane302.setCenter(jfxTextField301);
        borderPane302.setPrefSize(300,30);
        BorderPane borderPane58 = new BorderPane();
        borderPane58.setPrefSize(600,60);
        BorderPane borderPane59 = new BorderPane();
        borderPane59.setCenter(jfxButton7);
        BorderPane borderPane60 = new BorderPane();
        borderPane60.setCenter(jfxButton14);
        borderPane58.setRight(borderPane59);
        borderPane58.setLeft(borderPane60);

        GridPane gridPane5 = new GridPane();
        gridPane5.add(borderPane49,0,0);
        gridPane5.add(borderPane48,0,1);
        gridPane5.add(borderPane51,0,2);
        gridPane5.add(borderPane50,0,3);
        gridPane5.add(borderPane53,0,4);
        gridPane5.add(borderPane52,0,5);
        gridPane5.add(borderPane55,0,6);
        gridPane5.add(borderPane54,0,7);
        gridPane5.add(borderPane57,0,8);
        gridPane5.add(borderPane56,0,9);
        gridPane5.add(borderPane302,0,10);
        gridPane5.add(borderPane301,0,11);
        gridPane5.add(borderPane58,0,12);
        gridPane5.setPrefSize(750,580);
        gridPane5.setAlignment(Pos.CENTER);
        gridPane5.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane5.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        passengerEditScene = new Scene(gridPane5);

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

        GridPane gridPane7 = new GridPane();;
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

//manage airplanes
        tableView4 = new TableView<AirplaneModel>();
        tableView4.setPrefSize(600,400);

        TableColumn tableColumn21 = new TableColumn("ID");
        tableColumn21.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Long>("id"));

        TableColumn tableColumn22 = new TableColumn("Number Of Seats");
        tableColumn22.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Integer>("numberOfSeats"));

        tableView4.getColumns().addAll(tableColumn21,tableColumn22);
        tableView4.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label17 = new Label();
        label17.setTextFill(Color.BLACK);
        label17.setText("Select a row from table.");

        jfxButton23 = new JFXButton();
        jfxButton23.setText("Add");
        jfxButton23.setPrefSize(95,25);
        jfxButton23.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton23.setTextFill(Color.BLACK);
        jfxButton24 = new JFXButton();
        jfxButton24.setText("Edit");
        jfxButton24.setPrefSize(95,25);
        jfxButton24.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton24.setTextFill(Color.BLACK);
        jfxButton25 = new JFXButton();
        jfxButton25.setText("Delete");
        jfxButton25.setPrefSize(95,25);
        jfxButton25.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton25.setTextFill(Color.BLACK);
        jfxButton26 = new JFXButton();
        jfxButton26.setText("Back");
        jfxButton26.setPrefSize(95,25);
        jfxButton26.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton26.setTextFill(Color.BLACK);

        BorderPane borderPane111 = new BorderPane();
        borderPane111.setCenter(label17);
        borderPane111.setPrefSize(300,60);
        BorderPane borderPane112 = new BorderPane();
        borderPane112.setCenter(tableView4);
        borderPane112.setPrefSize(300,250);
        BorderPane borderPane113 = new BorderPane();
        borderPane113.setCenter(jfxButton23);
        borderPane113.setPrefSize(300,30);
        BorderPane borderPane114 = new BorderPane();
        borderPane114.setCenter(jfxButton24);
        borderPane114.setPrefSize(300,30);
        BorderPane borderPane115 = new BorderPane();
        borderPane115.setPrefSize(600,60);
        BorderPane borderPane116 = new BorderPane();
        borderPane116.setCenter(jfxButton25);
        borderPane116.setPrefSize(300,30);
        BorderPane borderPane117 = new BorderPane();
        borderPane117.setCenter(jfxButton26);
        borderPane117.setPrefSize(300,30);
        BorderPane borderPane118 = new BorderPane();
        borderPane118.setPrefSize(600,60);
        borderPane118.setLeft(borderPane116);
        borderPane118.setRight(borderPane113);
        borderPane115.setLeft(borderPane117);
        borderPane115.setRight(borderPane114);

        GridPane gridPane10 = new GridPane();;
        gridPane10.add(borderPane111,0,0);
        gridPane10.add(borderPane112,0,1);
        gridPane10.add(borderPane118,0,2);
        gridPane10.add(borderPane115,0,3);
        gridPane10.setPrefSize(750,580);
        gridPane10.setAlignment(Pos.CENTER);
        gridPane10.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane10.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        airplaneScene = new Scene(gridPane10);

//add airplane
        jfxTextField27 = new JFXTextField();
        jfxTextField27.setPromptText("Number Of Seats");
        jfxTextField27.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton27 = new JFXButton();
        jfxButton27.setText("Enter");
        jfxButton27.setPrefSize(95,25);
        jfxButton27.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton27.setTextFill(Color.BLACK);
        jfxButton28 = new JFXButton();
        jfxButton28.setText("Back");
        jfxButton28.setPrefSize(95,25);
        jfxButton28.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton28.setTextFill(Color.BLACK);

        BorderPane borderPane119 = new BorderPane();
        borderPane119.setCenter(jfxTextField27);
        borderPane119.setPrefSize(600,60);
        BorderPane borderPane120 = new BorderPane();
        borderPane120.setPrefSize(600,60);
        BorderPane borderPane121 = new BorderPane();
        borderPane121.setCenter(jfxButton27);
        BorderPane borderPane122 = new BorderPane();
        borderPane122.setCenter(jfxButton28);
        borderPane120.setRight(borderPane121);
        borderPane120.setLeft(borderPane122);

        GridPane gridPane11 = new GridPane();
        gridPane11.add(borderPane119,0,0);
        gridPane11.add(borderPane120,0,1);
        gridPane11.setPrefSize(750,580);
        gridPane11.setAlignment(Pos.CENTER);
        gridPane11.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane11.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        airplaneRegistrationScene = new Scene(gridPane11);

//edit an airplane menu
        jfxTextField28 = new JFXTextField();
        jfxTextField28.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField28 = new JFXTextField();
        jfxTextField28.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label18 = new Label();
        label18.setTextFill(Color.BLACK);
        label18.setText("Number Of Seats");

        jfxButton29 = new JFXButton();
        jfxButton29.setText("Enter");
        jfxButton29.setPrefSize(95,25);
        jfxButton29.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton29.setTextFill(Color.BLACK);
        jfxButton30 = new JFXButton();
        jfxButton30.setText("Back");
        jfxButton30.setPrefSize(95,25);
        jfxButton30.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton30.setTextFill(Color.BLACK);

        BorderPane borderPane123 = new BorderPane();
        borderPane123.setLeft(label18);
        borderPane123.setPrefSize(300,30);
        BorderPane borderPane124 = new BorderPane();
        borderPane124.setCenter(jfxTextField28);
        borderPane124.setPrefSize(300,30);
        BorderPane borderPane125 = new BorderPane();
        borderPane125.setPrefSize(600,60);
        BorderPane borderPane126 = new BorderPane();
        borderPane126.setCenter(jfxButton29);
        BorderPane borderPane127 = new BorderPane();
        borderPane127.setCenter(jfxButton30);
        borderPane125.setRight(borderPane126);
        borderPane125.setLeft(borderPane127);

        GridPane gridPane12 = new GridPane();
        gridPane12.add(borderPane124,0,0);
        gridPane12.add(borderPane123,0,1);
        gridPane12.add(borderPane125,0,2);
        gridPane12.setPrefSize(750,580);
        gridPane12.setAlignment(Pos.CENTER);
        gridPane12.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane12.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        airplaneEditScene = new Scene(gridPane12);

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
        jfxButton35.setPrefSize(190,25);
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

//manage critics and suggestions
        tableView11 = new TableView<String>();
        TableColumn<String, String> tableColumn49 = new TableColumn<>();
        tableView11.getColumns().addAll(tableColumn49);
        tableColumn49.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
        tableColumn49.setText("Critics And Suggestions");
        tableView11.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label30 = new Label();
        label30.setTextFill(Color.BLACK);
        label30.setText("Select a message from table.");

        jfxButton41 = new JFXButton();
        jfxButton41.setText("Show");
        jfxButton41.setPrefSize(95,25);
        jfxButton41.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton41.setTextFill(Color.BLACK);
        jfxButton42 = new JFXButton();
        jfxButton42.setText("Delete");
        jfxButton42.setPrefSize(95,25);
        jfxButton42.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton42.setTextFill(Color.BLACK);
        jfxButton43 = new JFXButton();
        jfxButton43.setText("Back");
        jfxButton43.setPrefSize(95,25);
        jfxButton43.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton43.setTextFill(Color.BLACK);

        BorderPane borderPane169 = new BorderPane();
        borderPane169.setCenter(label30);
        borderPane169.setPrefSize(600,60);
        BorderPane borderPane170 = new BorderPane();
        borderPane170.setCenter(tableView11);
        borderPane170.setPrefSize(600,250);
        BorderPane borderPane171 = new BorderPane();
        borderPane171.setPrefSize(600,120);
        BorderPane borderPane172 = new BorderPane();
        borderPane172.setCenter(jfxButton41);
        BorderPane borderPane173 = new BorderPane();
        borderPane173.setCenter(jfxButton42);
        BorderPane borderPane174 = new BorderPane();
        borderPane174.setCenter(jfxButton43);
        borderPane171.setLeft(borderPane174);
        borderPane171.setCenter(borderPane173);
        borderPane171.setRight(borderPane172);

        GridPane gridPane16 = new GridPane();
        gridPane16.add(borderPane169,0,0);
        gridPane16.add(borderPane170,0,1);
        gridPane16.add(borderPane171,0,2);
        gridPane16.setPrefSize(750,580);
        gridPane16.setAlignment(Pos.CENTER);
        gridPane16.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane16.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        criticsAndSuggestionsScene = new Scene(gridPane16);

//manage managers (for super admin)
        tableView12 = new TableView<ManagerModel>();
 //       tableView12.setPrefSize(800,400);
        TableColumn tableColumn50 = new TableColumn("ID");
        tableColumn50.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("id"));
        tableColumn50.setMinWidth(50);
        TableColumn tableColumn51 = new TableColumn("Name");
        tableColumn51.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("name"));
        tableColumn51.setMinWidth(50);
        TableColumn tableColumn52 = new TableColumn("Last Name");
        tableColumn52.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("lastName"));
        tableColumn52.setMinWidth(50);
        TableColumn tableColumn53 = new TableColumn("Username");
        tableColumn53.setCellValueFactory(new PropertyValueFactory<PassengerModel, String>("username"));
        tableColumn53.setMinWidth(50);
        TableColumn tableColumn54 = new TableColumn("Password");
        tableColumn54.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("password"));
        tableColumn54.setMinWidth(50);
        TableColumn tableColumn55 = new TableColumn("Email");
        tableColumn55.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("email"));
        tableColumn55.setMinWidth(100);
        TableColumn tableColumn56 = new TableColumn("Address");
        tableColumn56.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("address"));
        tableColumn56.setMinWidth(50);
        TableColumn tableColumn57 = new TableColumn("Phone Number");
        tableColumn57.setCellValueFactory(new PropertyValueFactory<PassengerModel,String>("phoneNumber"));
        tableColumn57.setMinWidth(100);
        TableColumn tableColumn58 = new TableColumn("Salary");
        tableColumn58.setCellValueFactory(new PropertyValueFactory<PassengerModel,Long>("salary"));
        tableColumn58.setMinWidth(50);
        tableView12.getColumns().addAll(tableColumn50,tableColumn51,tableColumn52,tableColumn53,tableColumn54,tableColumn55,tableColumn56,tableColumn57,tableColumn58);
        tableView12.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label label31 = new Label();
        label31.setTextFill(Color.BLACK);
        label31.setText("Select a row from table.");

        jfxButton46 = new JFXButton();
        jfxButton46.setText("Add");
        jfxButton46.setPrefSize(95,25);
        jfxButton46.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton46.setTextFill(Color.BLACK);
        jfxButton47 = new JFXButton();
        jfxButton47.setText("Edit");
        jfxButton47.setPrefSize(95,25);
        jfxButton47.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton47.setTextFill(Color.BLACK);
        jfxButton48 = new JFXButton();
        jfxButton48.setText("Delete");
        jfxButton48.setPrefSize(95,25);
        jfxButton48.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton48.setTextFill(Color.BLACK);
        jfxButton49 = new JFXButton();
        jfxButton49.setText("Back");
        jfxButton49.setPrefSize(95,25);
        jfxButton49.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton49.setTextFill(Color.BLACK);

        BorderPane borderPane175 = new BorderPane();
        borderPane175.setCenter(label31);
        borderPane175.setPrefSize(300,60);
        BorderPane borderPane176 = new BorderPane();
        borderPane176.setCenter(tableView12);
        borderPane176.setPrefSize(800,250);
        BorderPane borderPane177 = new BorderPane();
        borderPane177.setCenter(jfxButton46);
        borderPane177.setPrefSize(300,30);
        BorderPane borderPane178 = new BorderPane();
        borderPane178.setCenter(jfxButton48);
        borderPane178.setPrefSize(300,30);
        BorderPane borderPane179 = new BorderPane();
        borderPane179.setPrefSize(800,60);
        BorderPane borderPane180 = new BorderPane();
        borderPane180.setCenter(jfxButton47);
        borderPane180.setPrefSize(300,30);
        BorderPane borderPane181 = new BorderPane();
        borderPane181.setCenter(jfxButton49);
        borderPane181.setPrefSize(300,30);
        BorderPane borderPane182 = new BorderPane();
        borderPane182.setPrefSize(800,60);
        borderPane179.setLeft(borderPane178);
        borderPane179.setRight(borderPane177);
        borderPane182.setLeft(borderPane181);
        borderPane182.setRight(borderPane180);

        GridPane gridPane17 = new GridPane();;
        gridPane17.add(borderPane175,0,0);
        gridPane17.add(borderPane176,0,1);
        gridPane17.add(borderPane179,0,2);
        gridPane17.add(borderPane182,0,3);
        gridPane17.setPrefSize(900,580);
        gridPane17.setAlignment(Pos.CENTER);
        gridPane17.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane17.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        manageManagersScene = new Scene(gridPane17);

//add managers (for super admin)
        jfxTextField41 = new JFXTextField();
        jfxTextField41.setPromptText("Name");
        jfxTextField41.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField42 = new JFXTextField();
        jfxTextField42.setPromptText("Last Name");
        jfxTextField42.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField43 = new JFXTextField();
        jfxTextField43.setPromptText("Username");
        jfxTextField43.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField44= new JFXTextField();
        jfxTextField44.setPromptText("Email");
        jfxTextField44.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField45 = new JFXTextField();
        jfxTextField45.setPromptText("Phone Number");
        jfxTextField45.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField46 = new JFXTextField();
        jfxTextField46.setPromptText("Address");
        jfxTextField46.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField47 = new JFXTextField();
        jfxTextField47.setPromptText("Salary");
        jfxTextField47.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField5 = new JFXPasswordField();
        jfxPasswordField5.setPromptText("Password");
        jfxPasswordField5.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxPasswordField6 = new JFXPasswordField();
        jfxPasswordField6.setPromptText("Confirm Password");
        jfxPasswordField6.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        jfxButton50 = new JFXButton();
        jfxButton50.setText("Enter");
        jfxButton50.setPrefSize(95,25);
        jfxButton50.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton50.setTextFill(Color.BLACK);
        jfxButton51 = new JFXButton();
        jfxButton51.setText("Back");
        jfxButton51.setPrefSize(95,25);
        jfxButton51.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton51.setTextFill(Color.BLACK);

        BorderPane borderPane183 = new BorderPane();
        borderPane183.setCenter(jfxTextField41);
        borderPane138.setPrefSize(600,60);
        BorderPane borderPane184 = new BorderPane();
        borderPane184.setCenter(jfxTextField42);
        borderPane184.setPrefSize(600,60);
        BorderPane borderPane185 = new BorderPane();
        borderPane185.setCenter(jfxTextField43);
        borderPane185.setPrefSize(600,60);
        BorderPane borderPane186 = new BorderPane();
        borderPane186.setCenter(jfxPasswordField5);
        borderPane186.setPrefSize(600,60);
        BorderPane borderPane187 = new BorderPane();
        borderPane187.setCenter(jfxPasswordField6);
        borderPane187.setPrefSize(600,60);
        BorderPane borderPane188 = new BorderPane();
        borderPane188.setCenter(jfxTextField44);
        borderPane188.setPrefSize(600,60);
        BorderPane borderPane189 = new BorderPane();
        borderPane189.setCenter(jfxTextField45);
        borderPane189.setPrefSize(600,60);
        BorderPane borderPane190 = new BorderPane();
        borderPane190.setCenter(jfxTextField46);
        borderPane190.setPrefSize(600,60);
        BorderPane borderPane191 = new BorderPane();
        borderPane191.setCenter(jfxTextField47);
        borderPane191.setPrefSize(600,60);
        BorderPane borderPane192 = new BorderPane();
        borderPane192.setPrefSize(600,60);
        BorderPane borderPane193 = new BorderPane();
        borderPane193.setCenter(jfxButton50);
        BorderPane borderPane194 = new BorderPane();
        borderPane194.setCenter(jfxButton51);
        borderPane192.setRight(borderPane193);
        borderPane192.setLeft(borderPane194);

        GridPane gridPane18 = new GridPane();
        gridPane18.add(borderPane183,0,0);
        gridPane18.add(borderPane184,0,1);
        gridPane18.add(borderPane185,0,2);
        gridPane18.add(borderPane186,0,3);
        gridPane18.add(borderPane187,0,4);
        gridPane18.add(borderPane188,0,5);
        gridPane18.add(borderPane189,0,6);
        gridPane18.add(borderPane190,0,7);
        gridPane18.add(borderPane191,0,8);
        gridPane18.add(borderPane192,0,9);
        gridPane18.setPrefSize(1000,600);
        gridPane18.setAlignment(Pos.CENTER);
        gridPane18.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane18.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        managerRegistrationScene = new Scene(gridPane18);

//edit a managers (for super admin)
        jfxTextField48 = new JFXTextField();
        jfxTextField48.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField49 = new JFXTextField();
        jfxTextField49.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField50 = new JFXTextField();
        jfxTextField50.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField51= new JFXTextField();
        jfxTextField51.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField52 = new JFXTextField();
        jfxTextField52.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField53 = new JFXTextField();
        jfxTextField53.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField54 = new JFXTextField();
        jfxTextField54.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");
        jfxTextField55 = new JFXTextField();
        jfxTextField55.setStyle("-fx-prompt-text-fill: black; -fx-text-inner-color: black;");

        Label label32 = new Label();
        Label label33 = new Label();
        Label label34 = new Label();
        Label label35 = new Label();
        Label label36 = new Label();
        Label label37 = new Label();
        Label label38 = new Label();
        Label label39 = new Label();
        label32.setTextFill(Color.BLACK);
        label33.setTextFill(Color.BLACK);
        label34.setTextFill(Color.BLACK);
        label35.setTextFill(Color.BLACK);
        label36.setTextFill(Color.BLACK);
        label37.setTextFill(Color.BLACK);
        label38.setTextFill(Color.BLACK);
        label39.setTextFill(Color.BLACK);
        label32.setText("Name");
        label33.setText("Last Name");
        label34.setText("Username");
        label35.setText("Password");
        label36.setText("Email");
        label37.setText("Phone Number");
        label38.setText("Address");
        label39.setText("Salary");

        jfxButton52 = new JFXButton();
        jfxButton52.setText("Enter");
        jfxButton52.setPrefSize(95,25);
        jfxButton52.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton52.setTextFill(Color.BLACK);
        jfxButton53 = new JFXButton();
        jfxButton53.setText("Back");
        jfxButton53.setPrefSize(95,25);
        jfxButton53.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        jfxButton53.setTextFill(Color.BLACK);

        BorderPane borderPane195 = new BorderPane();
        borderPane195.setLeft(label32);
        borderPane195.setPrefSize(300,30);
        BorderPane borderPane196 = new BorderPane();
        borderPane196.setCenter(jfxTextField48);
        borderPane196.setPrefSize(300,30);
        BorderPane borderPane197 = new BorderPane();
        borderPane197.setLeft(label33);
        borderPane197.setPrefSize(300,30);
        BorderPane borderPane198 = new BorderPane();
        borderPane198.setCenter(jfxTextField49);
        borderPane198.setPrefSize(300,30);
        BorderPane borderPane199 = new BorderPane();
        borderPane199.setLeft(label34);
        borderPane199.setPrefSize(300,30);
        BorderPane borderPane200 = new BorderPane();
        borderPane200.setCenter(jfxTextField50);
        borderPane200.setPrefSize(300,30);
        BorderPane borderPane201 = new BorderPane();
        borderPane201.setLeft(label35);
        borderPane201.setPrefSize(300,30);
        BorderPane borderPane202 = new BorderPane();
        borderPane202.setCenter(jfxTextField51);
        borderPane202.setPrefSize(300,30);
        BorderPane borderPane203 = new BorderPane();
        borderPane203.setLeft(label36);
        borderPane203.setPrefSize(300,30);
        BorderPane borderPane204 = new BorderPane();
        borderPane204.setCenter(jfxTextField52);
        borderPane204.setPrefSize(300,30);
        BorderPane borderPane205 = new BorderPane();
        borderPane205.setLeft(label37);
        borderPane205.setPrefSize(300,30);
        BorderPane borderPane206 = new BorderPane();
        borderPane206.setCenter(jfxTextField53);
        borderPane206.setPrefSize(300,30);
        BorderPane borderPane207 = new BorderPane();
        borderPane207.setLeft(label38);
        borderPane207.setPrefSize(300,30);
        BorderPane borderPane208 = new BorderPane();
        borderPane208.setCenter(jfxTextField54);
        borderPane208.setPrefSize(300,30);
        BorderPane borderPane209 = new BorderPane();
        borderPane209.setLeft(label39);
        borderPane209.setPrefSize(300,30);
        BorderPane borderPane210 = new BorderPane();
        borderPane210.setCenter(jfxTextField55);
        borderPane210.setPrefSize(300,30);

        BorderPane borderPane211 = new BorderPane();
        borderPane211.setPrefSize(600,60);
        BorderPane borderPane212 = new BorderPane();
        borderPane212.setCenter(jfxButton52);
        BorderPane borderPane213 = new BorderPane();
        borderPane213.setCenter(jfxButton53);
        borderPane211.setRight(borderPane212);
        borderPane211.setLeft(borderPane213);

        GridPane gridPane19 = new GridPane();;
        gridPane19.add(borderPane196,0,0);
        gridPane19.add(borderPane195,0,1);
        gridPane19.add(borderPane198,0,2);
        gridPane19.add(borderPane197,0,3);
        gridPane19.add(borderPane200,0,4);
        gridPane19.add(borderPane199,0,5);
        gridPane19.add(borderPane202,0,6);
        gridPane19.add(borderPane201,0,7);
        gridPane19.add(borderPane204,0,8);
        gridPane19.add(borderPane203,0,9);
        gridPane19.add(borderPane206,0,10);
        gridPane19.add(borderPane205,0,11);
        gridPane19.add(borderPane208,0,12);
        gridPane19.add(borderPane207,0,13);
        gridPane19.add(borderPane210,0,14);
        gridPane19.add(borderPane209,0,15);
        gridPane19.add(borderPane211,0,16);
        gridPane19.setPrefSize(750,600);
        gridPane19.setAlignment(Pos.CENTER);
        gridPane19.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane19.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        managerEditScene = new Scene(gridPane19);

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

    public Scene getShowManagersScene()
    {
        return showManagersScene;
    }

    public void setShowManagersScene(Scene showManagersScene)
    {
        this.showManagersScene = showManagersScene;
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

    public JFXTextField getJfxTextField11()
    {
        return jfxTextField11;
    }

    public void setJfxTextField11(JFXTextField jfxTextField11)
    {
        this.jfxTextField11 = jfxTextField11;
    }

    public JFXTextField getJfxTextField13()
    {
        return jfxTextField13;
    }

    public void setJfxTextField13(JFXTextField jfxTextField13)
    {
        this.jfxTextField13 = jfxTextField13;
    }

    public JFXButton getJfxButton11()
    {
        return jfxButton11;
    }

    public void setJfxButton11(JFXButton jfxButton11)
    {
        this.jfxButton11 = jfxButton11;
    }

    public Scene getPassengerScene()
    {
        return passengerScene;
    }

    public void setPassengerScene(Scene passengerScene)
    {
        this.passengerScene = passengerScene;
    }

    public JFXTextField getJfxTextField70()
    {
        return jfxTextField70;
    }

    public void setJfxTextField70(JFXTextField jfxTextField70)
    {
        this.jfxTextField70 = jfxTextField70;
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

    public JFXButton getJfxButton70()
    {
        return jfxButton70;
    }

    public void setJfxButton70(JFXButton jfxButton70)
    {
        this.jfxButton70 = jfxButton70;
    }

    public JFXButton getJfxButton71()
    {
        return jfxButton71;
    }

    public void setJfxButton71(JFXButton jfxButton71)
    {
        this.jfxButton71 = jfxButton71;
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

    public JFXTextField getJfxTextField14()
    {
        return jfxTextField14;
    }

    public void setJfxTextField14(JFXTextField jfxTextField14)
    {
        this.jfxTextField14 = jfxTextField14;
    }

    public JFXTextField getJfxTextField15()
    {
        return jfxTextField15;
    }

    public void setJfxTextField15(JFXTextField jfxTextField15)
    {
        this.jfxTextField15 = jfxTextField15;
    }

    public JFXTextField getJfxTextField16()
    {
        return jfxTextField16;
    }

    public void setJfxTextField16(JFXTextField jfxTextField16)
    {
        this.jfxTextField16 = jfxTextField16;
    }

    public JFXTextField getJfxTextField17()
    {
        return jfxTextField17;
    }

    public void setJfxTextField17(JFXTextField jfxTextField17)
    {
        this.jfxTextField17 = jfxTextField17;
    }

    public JFXPasswordField getJfxPasswordField3()
    {
        return jfxPasswordField3;
    }

    public void setJfxPasswordField3(JFXPasswordField jfxPasswordField3)
    {
        this.jfxPasswordField3 = jfxPasswordField3;
    }

    public JFXPasswordField getJfxPasswordField4()
    {
        return jfxPasswordField4;
    }

    public void setJfxPasswordField4(JFXPasswordField jfxPasswordField4)
    {
        this.jfxPasswordField4 = jfxPasswordField4;
    }

    public TableView<PassengerModel> getTableView2()
    {
        return tableView2;
    }

    public void setTableView2(TableView<PassengerModel> tableView2)
    {
        this.tableView2 = tableView2;
    }

    public JFXTextField getJfxTextField18()
    {
        return jfxTextField18;
    }

    public void setJfxTextField18(JFXTextField jfxTextField18)
    {
        this.jfxTextField18 = jfxTextField18;
    }

    public JFXTextField getJfxTextField19()
    {
        return jfxTextField19;
    }

    public void setJfxTextField19(JFXTextField jfxTextField19)
    {
        this.jfxTextField19 = jfxTextField19;
    }

    public JFXTextField getJfxTextField20()
    {
        return jfxTextField20;
    }

    public void setJfxTextField20(JFXTextField jfxTextField20)
    {
        this.jfxTextField20 = jfxTextField20;
    }

    public JFXTextField getJfxTextField21()
    {
        return jfxTextField21;
    }

    public void setJfxTextField21(JFXTextField jfxTextField21)
    {
        this.jfxTextField21 = jfxTextField21;
    }

    public JFXTextField getJfxTextField22()
    {
        return jfxTextField22;
    }

    public void setJfxTextField22(JFXTextField jfxTextField22)
    {
        this.jfxTextField22 = jfxTextField22;
    }

    public JFXButton getJfxButton7()
    {
        return jfxButton7;
    }

    public void setJfxButton7(JFXButton jfxButton7)
    {
        this.jfxButton7 = jfxButton7;
    }

    public JFXButton getJfxButton14()
    {
        return jfxButton14;
    }

    public void setJfxButton14(JFXButton jfxButton14)
    {
        this.jfxButton14 = jfxButton14;
    }

    public Scene getPassengerEditScene()
    {
        return passengerEditScene;
    }

    public void setPassengerEditScene(Scene passengerEditScene)
    {
        this.passengerEditScene = passengerEditScene;
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

    public TableView<TicketModel> getTableView3()
    {
        return tableView3;
    }

    public void setTableView3(TableView<TicketModel> tableView3)
    {
        this.tableView3 = tableView3;
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

    public JFXTextField getJfxTextField27()
    {
        return jfxTextField27;
    }

    public void setJfxTextField27(JFXTextField jfxTextField27)
    {
        this.jfxTextField27 = jfxTextField27;
    }

    public JFXTextField getJfxTextField28()
    {
        return jfxTextField28;
    }

    public void setJfxTextField28(JFXTextField jfxTextField28)
    {
        this.jfxTextField28 = jfxTextField28;
    }

    public JFXButton getJfxButton23()
    {
        return jfxButton23;
    }

    public void setJfxButton23(JFXButton jfxButton23)
    {
        this.jfxButton23 = jfxButton23;
    }

    public JFXButton getJfxButton24()
    {
        return jfxButton24;
    }

    public void setJfxButton24(JFXButton jfxButton24)
    {
        this.jfxButton24 = jfxButton24;
    }

    public JFXButton getJfxButton25()
    {
        return jfxButton25;
    }

    public void setJfxButton25(JFXButton jfxButton25)
    {
        this.jfxButton25 = jfxButton25;
    }

    public JFXButton getJfxButton26()
    {
        return jfxButton26;
    }

    public void setJfxButton26(JFXButton jfxButton26)
    {
        this.jfxButton26 = jfxButton26;
    }

    public JFXButton getJfxButton27()
    {
        return jfxButton27;
    }

    public void setJfxButton27(JFXButton jfxButton27)
    {
        this.jfxButton27 = jfxButton27;
    }

    public JFXButton getJfxButton28()
    {
        return jfxButton28;
    }

    public void setJfxButton28(JFXButton jfxButton28)
    {
        this.jfxButton28 = jfxButton28;
    }

    public JFXButton getJfxButton29()
    {
        return jfxButton29;
    }

    public void setJfxButton29(JFXButton jfxButton29)
    {
        this.jfxButton29 = jfxButton29;
    }

    public JFXButton getJfxButton30()
    {
        return jfxButton30;
    }

    public void setJfxButton30(JFXButton jfxButton30)
    {
        this.jfxButton30 = jfxButton30;
    }

    public TableView<AirplaneModel> getTableView4()
    {
        return tableView4;
    }

    public void setTableView4(TableView<AirplaneModel> tableView4)
    {
        this.tableView4 = tableView4;
    }

    public Scene getAirplaneScene()
    {
        return airplaneScene;
    }

    public void setAirplaneScene(Scene airplaneScene)
    {
        this.airplaneScene = airplaneScene;
    }

    public Scene getAirplaneRegistrationScene()
    {
        return airplaneRegistrationScene;
    }

    public void setAirplaneRegistrationScene(Scene airplaneRegistrationScene)
    {
        this.airplaneRegistrationScene = airplaneRegistrationScene;
    }

    public Scene getAirplaneEditScene()
    {
        return airplaneEditScene;
    }

    public void setAirplaneEditScene(Scene airplaneEditScene)
    {
        this.airplaneEditScene = airplaneEditScene;
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

    public JFXButton getJfxButton41()
    {
        return jfxButton41;
    }

    public void setJfxButton41(JFXButton jfxButton41)
    {
        this.jfxButton41 = jfxButton41;
    }

    public JFXButton getJfxButton42()
    {
        return jfxButton42;
    }

    public void setJfxButton42(JFXButton jfxButton42)
    {
        this.jfxButton42 = jfxButton42;
    }

    public JFXButton getJfxButton43()
    {
        return jfxButton43;
    }

    public void setJfxButton43(JFXButton jfxButton43)
    {
        this.jfxButton43 = jfxButton43;
    }

    public TableView<String> getTableView11()
    {
        return tableView11;
    }

    public void setTableView11(TableView<String> tableView11)
    {
        this.tableView11 = tableView11;
    }

    public Scene getCriticsAndSuggestionsScene()
    {
        return criticsAndSuggestionsScene;
    }

    public void setCriticsAndSuggestionsScene(Scene criticsAndSuggestionsScene)
    {
        this.criticsAndSuggestionsScene = criticsAndSuggestionsScene;
    }

    public JFXTextField getJfxTextField41()
    {
        return jfxTextField41;
    }

    public void setJfxTextField41(JFXTextField jfxTextField41)
    {
        this.jfxTextField41 = jfxTextField41;
    }

    public JFXTextField getJfxTextField42()
    {
        return jfxTextField42;
    }

    public void setJfxTextField42(JFXTextField jfxTextField42)
    {
        this.jfxTextField42 = jfxTextField42;
    }

    public JFXTextField getJfxTextField43()
    {
        return jfxTextField43;
    }

    public void setJfxTextField43(JFXTextField jfxTextField43)
    {
        this.jfxTextField43 = jfxTextField43;
    }

    public JFXTextField getJfxTextField44()
    {
        return jfxTextField44;
    }

    public void setJfxTextField44(JFXTextField jfxTextField44)
    {
        this.jfxTextField44 = jfxTextField44;
    }

    public JFXTextField getJfxTextField45()
    {
        return jfxTextField45;
    }

    public void setJfxTextField45(JFXTextField jfxTextField45)
    {
        this.jfxTextField45 = jfxTextField45;
    }

    public JFXTextField getJfxTextField46()
    {
        return jfxTextField46;
    }

    public void setJfxTextField46(JFXTextField jfxTextField46)
    {
        this.jfxTextField46 = jfxTextField46;
    }

    public JFXTextField getJfxTextField47()
    {
        return jfxTextField47;
    }

    public void setJfxTextField47(JFXTextField jfxTextField47)
    {
        this.jfxTextField47 = jfxTextField47;
    }

    public JFXTextField getJfxTextField48()
    {
        return jfxTextField48;
    }

    public void setJfxTextField48(JFXTextField jfxTextField48)
    {
        this.jfxTextField48 = jfxTextField48;
    }

    public JFXTextField getJfxTextField49()
    {
        return jfxTextField49;
    }

    public void setJfxTextField49(JFXTextField jfxTextField49)
    {
        this.jfxTextField49 = jfxTextField49;
    }

    public JFXTextField getJfxTextField50()
    {
        return jfxTextField50;
    }

    public void setJfxTextField50(JFXTextField jfxTextField50)
    {
        this.jfxTextField50 = jfxTextField50;
    }

    public JFXTextField getJfxTextField51()
    {
        return jfxTextField51;
    }

    public void setJfxTextField51(JFXTextField jfxTextField51)
    {
        this.jfxTextField51 = jfxTextField51;
    }

    public JFXTextField getJfxTextField52()
    {
        return jfxTextField52;
    }

    public void setJfxTextField52(JFXTextField jfxTextField52)
    {
        this.jfxTextField52 = jfxTextField52;
    }

    public JFXTextField getJfxTextField53()
    {
        return jfxTextField53;
    }

    public void setJfxTextField53(JFXTextField jfxTextField53)
    {
        this.jfxTextField53 = jfxTextField53;
    }

    public JFXTextField getJfxTextField54()
    {
        return jfxTextField54;
    }

    public void setJfxTextField54(JFXTextField jfxTextField54)
    {
        this.jfxTextField54 = jfxTextField54;
    }

    public JFXTextField getJfxTextField55()
    {
        return jfxTextField55;
    }

    public void setJfxTextField55(JFXTextField jfxTextField55)
    {
        this.jfxTextField55 = jfxTextField55;
    }

    public JFXPasswordField getJfxPasswordField5()
    {
        return jfxPasswordField5;
    }

    public void setJfxPasswordField5(JFXPasswordField jfxPasswordField5)
    {
        this.jfxPasswordField5 = jfxPasswordField5;
    }

    public JFXPasswordField getJfxPasswordField6()
    {
        return jfxPasswordField6;
    }

    public void setJfxPasswordField6(JFXPasswordField jfxPasswordField6)
    {
        this.jfxPasswordField6 = jfxPasswordField6;
    }

    public JFXButton getJfxButton46()
    {
        return jfxButton46;
    }

    public void setJfxButton46(JFXButton jfxButton46)
    {
        this.jfxButton46 = jfxButton46;
    }

    public JFXButton getJfxButton47()
    {
        return jfxButton47;
    }

    public void setJfxButton47(JFXButton jfxButton47)
    {
        this.jfxButton47 = jfxButton47;
    }

    public JFXButton getJfxButton48()
    {
        return jfxButton48;
    }

    public void setJfxButton48(JFXButton jfxButton48)
    {
        this.jfxButton48 = jfxButton48;
    }

    public JFXButton getJfxButton49()
    {
        return jfxButton49;
    }

    public void setJfxButton49(JFXButton jfxButton49)
    {
        this.jfxButton49 = jfxButton49;
    }

    public JFXButton getJfxButton50()
    {
        return jfxButton50;
    }

    public void setJfxButton50(JFXButton jfxButton50)
    {
        this.jfxButton50 = jfxButton50;
    }

    public JFXButton getJfxButton51()
    {
        return jfxButton51;
    }

    public void setJfxButton51(JFXButton jfxButton51)
    {
        this.jfxButton51 = jfxButton51;
    }

    public JFXButton getJfxButton52()
    {
        return jfxButton52;
    }

    public void setJfxButton52(JFXButton jfxButton52)
    {
        this.jfxButton52 = jfxButton52;
    }

    public JFXButton getJfxButton53()
    {
        return jfxButton53;
    }

    public void setJfxButton53(JFXButton jfxButton53)
    {
        this.jfxButton53 = jfxButton53;
    }

    public TableView<ManagerModel> getTableView12()
    {
        return tableView12;
    }

    public void setTableView12(TableView<ManagerModel> tableView12)
    {
        this.tableView12 = tableView12;
    }

    public Scene getManageManagersScene()
    {
        return manageManagersScene;
    }

    public void setManageManagersScene(Scene manageManagersScene)
    {
        this.manageManagersScene = manageManagersScene;
    }

    public Scene getManagerRegistrationScene()
    {
        return managerRegistrationScene;
    }

    public void setManagerRegistrationScene(Scene managerRegistrationScene)
    {
        this.managerRegistrationScene = managerRegistrationScene;
    }

    public Scene getManagerEditScene()
    {
        return managerEditScene;
    }

    public void setManagerEditScene(Scene managerEditScene)
    {
        this.managerEditScene = managerEditScene;
    }

    public JFXTextField getJfxTextField300()
    {
        return jfxTextField300;
    }

    public void setJfxTextField300(JFXTextField jfxTextField300)
    {
        this.jfxTextField300 = jfxTextField300;
    }

    public JFXTextField getJfxTextField301()
    {
        return jfxTextField301;
    }

    public void setJfxTextField301(JFXTextField jfxTextField301)
    {
        this.jfxTextField301 = jfxTextField301;
    }

    public TableView<ManagerModel> getTableView()
    {
        return tableView;
    }

    public void setTableView(TableView<ManagerModel> tableView)
    {
        this.tableView = tableView;
    }

    public JFXTextField getJfxTextField311()
    {
        return jfxTextField311;
    }

    public void setJfxTextField311(JFXTextField jfxTextField311)
    {
        this.jfxTextField311 = jfxTextField311;
    }

    public JFXButton getJfxButton446()
    {
        return jfxButton446;
    }

    public void setJfxButton446(JFXButton jfxButton446)
    {
        this.jfxButton446 = jfxButton446;
    }

    public JFXButton getJfxButton447()
    {
        return jfxButton447;
    }

    public void setJfxButton447(JFXButton jfxButton447)
    {
        this.jfxButton447 = jfxButton447;
    }

    public JFXButton getJfxButton448()
    {
        return jfxButton448;
    }

    public void setJfxButton448(JFXButton jfxButton448)
    {
        this.jfxButton448 = jfxButton448;
    }

    public JFXButton getJfxButton449()
    {
        return jfxButton449;
    }

    public void setJfxButton449(JFXButton jfxButton449)
    {
        this.jfxButton449 = jfxButton449;
    }

    public TableView<EmployeeModel> getTableView412()
    {
        return tableView412;
    }

    public void setTableView412(TableView<EmployeeModel> tableView412)
    {
        this.tableView412 = tableView412;
    }

    public Scene getManageEmployeesScene()
    {
        return manageEmployeesScene;
    }

    public void setManageEmployeesScene(Scene manageEmployeesScene)
    {
        this.manageEmployeesScene = manageEmployeesScene;
    }

    public JFXTextField getJfxTextField448()
    {
        return jfxTextField448;
    }

    public void setJfxTextField448(JFXTextField jfxTextField448)
    {
        this.jfxTextField448 = jfxTextField448;
    }

    public JFXTextField getJfxTextField449()
    {
        return jfxTextField449;
    }

    public void setJfxTextField449(JFXTextField jfxTextField449)
    {
        this.jfxTextField449 = jfxTextField449;
    }

    public JFXTextField getJfxTextField450()
    {
        return jfxTextField450;
    }

    public void setJfxTextField450(JFXTextField jfxTextField450)
    {
        this.jfxTextField450 = jfxTextField450;
    }

    public JFXTextField getJfxTextField451()
    {
        return jfxTextField451;
    }

    public void setJfxTextField451(JFXTextField jfxTextField451)
    {
        this.jfxTextField451 = jfxTextField451;
    }

    public JFXTextField getJfxTextField452()
    {
        return jfxTextField452;
    }

    public void setJfxTextField452(JFXTextField jfxTextField452)
    {
        this.jfxTextField452 = jfxTextField452;
    }

    public JFXTextField getJfxTextField453()
    {
        return jfxTextField453;
    }

    public void setJfxTextField453(JFXTextField jfxTextField453)
    {
        this.jfxTextField453 = jfxTextField453;
    }

    public JFXTextField getJfxTextField454()
    {
        return jfxTextField454;
    }

    public void setJfxTextField454(JFXTextField jfxTextField454)
    {
        this.jfxTextField454 = jfxTextField454;
    }

    public JFXTextField getJfxTextField455()
    {
        return jfxTextField455;
    }

    public void setJfxTextField455(JFXTextField jfxTextField455)
    {
        this.jfxTextField455 = jfxTextField455;
    }

    public JFXButton getJfxButton452()
    {
        return jfxButton452;
    }

    public void setJfxButton452(JFXButton jfxButton452)
    {
        this.jfxButton452 = jfxButton452;
    }

    public JFXButton getJfxButton453()
    {
        return jfxButton453;
    }

    public void setJfxButton453(JFXButton jfxButton453)
    {
        this.jfxButton453 = jfxButton453;
    }

    public Scene getEmployeeRegistrationScene()
    {
        return employeeRegistrationScene;
    }

    public void setEmployeeRegistrationScene(Scene employeeRegistrationScene)
    {
        this.employeeRegistrationScene = employeeRegistrationScene;
    }

    public Scene getEmployeeEditScene()
    {
        return employeeEditScene;
    }

    public void setEmployeeEditScene(Scene employeeEditScene)
    {
        this.employeeEditScene = employeeEditScene;
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
