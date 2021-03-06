package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Created by IntelliJ IDEA.
 *
 * This class is the controller for the check in window. All functions
 * in the check in will be handled here
 *
 * @Author: Zacky Kharboutli
 * @Date: 2018-03-29
 * @Project : HotelSystem
 */
public class checkInController {


    public void ShowMainPage (ActionEvent event) throws IOException {
            Parent Checkinpage = FXMLLoader.load(getClass().getResource(String.valueOf("/MainWindow.fxml")));
            Scene mainWindowScene = new Scene(Checkinpage);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(mainWindowScene);
            app_stage.show();
            System.out.println("Main window showed from checkInController");
    }

    public void showCheckOutWindow (ActionEvent event) throws IOException {
        Parent Checkinpage = FXMLLoader.load(getClass().getResource(String.valueOf("/checkOutWindow.fxml")));
        Scene mainWindowScene = new Scene(Checkinpage);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(mainWindowScene);
        app_stage.show();
        System.out.println("CheckOut window showed from checkInController");

    }
    public void ShowGuestManagement (ActionEvent event) throws IOException {
        Parent checkInPage = FXMLLoader.load(getClass().getResource(String.valueOf("/guestManagement.fxml")));
        Scene CheckInScene = new Scene(checkInPage);
        Stage app_stage = (Stage)((Node) event.getSource()    ).getScene().getWindow();
        app_stage.setScene(CheckInScene);
        app_stage.show();
        System.out.println("GuestManagement window showed from checkInController");
    }
}
