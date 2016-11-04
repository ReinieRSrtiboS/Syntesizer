package com.syntesizer.reinier2.mylibrary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Reinier2 on 2-11-2016.
 */

public class Server {

    ServerSocket socket;
    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    int packageid = 1;
    int id;

    protected void Connection() {
        try {
            socket = new ServerSocket(8080); //TODO add port and real ip-address;
            clientSocket = socket.accept();
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Run() {
        while
    }
}
