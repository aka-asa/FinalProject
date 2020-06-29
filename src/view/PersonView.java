package view;

import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.AirplaneModel;
import model.FlightModel;
import model.PersonModel;
import model.TicketModel;

import java.time.LocalDateTime;

public class PersonView extends BorderPane
{

    private Stage stage;

    public PersonView()
    {
        TableView <PersonModel> tableView = new TableView<PersonModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<PersonModel,Long>("id"));

        TableColumn tableColumn2 = new TableColumn("Name");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<PersonModel,String>("name"));

        TableColumn tableColumn3 = new TableColumn("Last Name");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<PersonModel,String>("lastName"));

        TableColumn tableColumn4 = new TableColumn("Username");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<PersonModel, String>("username"));

        TableColumn tableColumn5 = new TableColumn("Password");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<PersonModel,String>("password"));

        TableColumn tableColumn6 = new TableColumn("Email");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<PersonModel,String>("email"));

        for (int i=0 ; i<PersonModel.getPersons().size() ; i++)
        {
            tableView.getItems().add(PersonModel.getPersons().get(i));
        }

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3,tableColumn4,tableColumn5,tableColumn6);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,  CornerRadii.EMPTY, new BorderWidths(3))));
        this.setCenter(tableView);
        this.setPrefSize(600,400);

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
