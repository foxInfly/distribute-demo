package com.pupu;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author : lipu
 * @since : 2020-08-17 21:18
 */
public class Client {




    public static void main(String[] args) throws IOException {
        Socket socket = null;
        socket = new Socket("127.0.0.1",8080);

        User user = new User();
        user.setAge(18);
        user.setName("pupu");

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(user);

        socket.close();


    }
}
