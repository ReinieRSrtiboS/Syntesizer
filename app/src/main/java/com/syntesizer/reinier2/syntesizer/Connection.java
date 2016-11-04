package com.syntesizer.reinier2.syntesizer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * Created by Reinier2 on 1-11-2016.
 */

public class Connection {

    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    int packageid = 1;
    int id = 404;

    //maakt de connectie aan
    protected Connection(int instrument) {
        try {
            socket = new Socket("10.53.159.89", 8080);  //ip-adres, port
            out = new DataOutputStream(socket.getOutputStream());
            out.writeInt(0);    //hallo
            out.writeInt(instrument);   //geeft instrument door
            in = new DataInputStream(socket.getInputStream());
            id = in.readInt();  //krijgt id van de server
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void send(List<Integer> Package) {
        Package.set(3, packageid); //geeft een id aan het pakket voor te implementeren retransmission
        packageid++;
        try {
            for (int i = 0; i < Package.size(); i++) {
                System.out.println(Package.get(i));     //stuurt alle gegevens 1 voor 1 door naar server
                out.writeInt(Package.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int getID() {
        return id;
    }

    protected void Close() {
        try {
            out.writeInt(404);  //data voor server om af te sluiten
            socket.close();     // sluit de connectie
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
