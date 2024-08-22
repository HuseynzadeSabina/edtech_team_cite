package com.example.edtech_team_new.webSocket;

import org.glassfish.tyrus.server.Server;

import org.glassfish.tyrus.server.Server;
import java.util.HashMap;
import java.util.Map;

public class MyWebSocketServerMain {

    public static void main(String[] args) {
        // Настраиваем параметры сервера (если требуется)
        Map<String, Object> properties = new HashMap<>();

        // Создаем сервер
        Server server = new Server("localhost", 8080, "/websockets", properties, MyWebSocketServer.class);

        try {
            server.start();
            System.out.println("WebSocket server started at ws://localhost:8080/websockets");
            // Ожидание пользовательского ввода для остановки сервера
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }
}

