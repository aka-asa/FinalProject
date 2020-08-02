package view;

import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.AirplaneModel;
import model.ManagerModel;

public class AirplaneView extends BorderPane
{

    private Stage stage;
    private TableView <AirplaneModel> tableView;

    public AirplaneView()
    {
        tableView = new TableView<AirplaneModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Long>("id"));

        TableColumn tableColumn2 = new TableColumn("Number Of Seats");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<AirplaneModel,Integer>("numberOfSeats"));

        tableView.getColumns().addAll(tableColumn,tableColumn2);
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

    public TableView<AirplaneModel> getTableView()
    {
        return tableView;
    }

    public void setTableView(TableView<AirplaneModel> tableView)
    {
        this.tableView = tableView;
    }
}
