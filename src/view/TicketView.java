package view;

import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.TicketModel;

public class TicketView extends BorderPane
{

    private Stage stage;

    public TicketView()
    {
        TableView <TicketModel> tableView = new TableView<TicketModel>();
        tableView.setPrefSize(600,400);

        TableColumn tableColumn = new TableColumn("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("id"));


        TableColumn tableColumn2 = new TableColumn("Price");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("price"));


        TableColumn tableColumn3 = new TableColumn("PenaltyOfCancellation");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<TicketModel,Long>("penaltyOfCancellation"));


        for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
        {
            tableView.getItems().add(TicketModel.getTickets().get(i));
        }

        tableView.getColumns().addAll(tableColumn,tableColumn2,tableColumn3);
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
