package com.pupu;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : lipu
 * @since : 2020-08-17 21:18
 */
public class Server {


    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        User u = (User)in.readObject();

        System.out.println(u);
    }
}
