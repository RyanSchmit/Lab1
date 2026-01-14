package Lab1.server;

import java.io.DataInputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

    public static void main (String[] args){
        while(true) {
            try {
                ServerSocket server = new ServerSocket(1111);
                Socket oth = server.accept();
                DataInputStream message = new DataInputStream(oth.getInputStream());
                while (true) {
                    System.out.println(message.readUTF());
                }
            } catch (Exception e) {
                System.out.println("Server error");
            }
        }
    }
}
