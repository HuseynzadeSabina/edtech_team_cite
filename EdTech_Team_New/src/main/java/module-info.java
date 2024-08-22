module com.example.edtech_team_new {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires tyrus.server;
    requires javax.websocket.api;

    opens com.example.edtech_team_new to javafx.fxml;
    exports com.example.edtech_team_new;

}