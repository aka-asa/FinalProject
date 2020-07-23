import controller.*;
import javafx.application.Application;
import javafx.stage.Stage;
import model.*;

import java.time.LocalDate;

public class Main extends Application
{
    public void start(Stage primaryStage) throws Exception
    {





        PassengerModel passengerModel = new PassengerModel("a","b","c","d","e","f",0);
        PassengerModel.getPassengers().add(passengerModel);
        PassengerModel passengerMode2 = new PassengerModel("g","h","i","j","k","l",0);
        PassengerModel.getPassengers().add(passengerMode2);
        PassengerModel passengerMode3 = new PassengerModel("m","n","o","p","q","r",0);
        PassengerModel.getPassengers().add(passengerMode3);
        PassengerModel passengerMode4 = new PassengerModel("s","t","u","v","w","x",0);
        PassengerModel.getPassengers().add(passengerMode4);

        PassengerController passengerController = new PassengerController();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

