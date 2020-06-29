package view;

import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.FlightModel;

import java.time.LocalDateTime;

public class FlightView extends BorderPane
{

    private Stage stage;

    public FlightView()
    {
        TableView <FlightModel> tableView = new TableView<FlightModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<FlightModel,Long>("id"));

        TableColumn tableColumn2 = new TableColumn("Origin");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("origin"));

        TableColumn tableColumn3 = new TableColumn("Destination");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("destination"));

        TableColumn tableColumn4 = new TableColumn("Date");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<FlightModel, LocalDateTime>("date"));

        TableColumn tableColumn5 = new TableColumn("Time");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<FlightModel,String>("time"));

        TableColumn tableColumn6 = new TableColumn("Number Of Sold Tickets");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<FlightModel,Integer>("numberOfSoldTickets"));

        TableColumn tableColumn7 = new TableColumn("Flight Time");
        tableColumn7.setCellValueFactory(new PropertyValueFactory<FlightModel,Double>("flightTime"));

        TableColumn tableColumn8 = new TableColumn("Flight Condition");
        tableColumn8.setCellValueFactory(new PropertyValueFactory<FlightModel, FlightModel.FlightCondition>("flightCondition"));

        for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
        {
            tableView.getItems().add(FlightModel.getFlights().get(i));
        }

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3,tableColumn4,tableColumn5,tableColumn6,tableColumn7,tableColumn8);
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
