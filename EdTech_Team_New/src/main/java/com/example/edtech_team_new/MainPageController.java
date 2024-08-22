package com.example.edtech_team_new;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;



import java.net.URL;
import java.util.ResourceBundle;
@ServerEndpoint("/websocket")


public class MainPageController implements Initializable {
    @FXML
    private Label date;

    @FXML
    private Label hum;

    @FXML
    private Label lat;

    @FXML
    private Label longg;

    @FXML
    private ImageView photo;

    @FXML
    private Button refresh_btn;

    @FXML
    private Label temp;

    @FXML
    private Label time;

    @FXML
    private Label x;

    @FXML
    private Label y;

    @FXML
    private Label z;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        refresh_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("fkesfa;jf");
            }
        });
        
    }


    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received: " + message);
        try {
            session.getBasicRemote().sendText("Echo: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
