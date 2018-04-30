package com.game;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @创建人 niutao
 * @创建时间 2018/4/30
 * @描述
 */
public class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket s = ss.accept();
                System.out.println("a client connect");
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = dis.readUTF();
                System.out.println(str);
                dis.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
