import java.io.*;
import java.net.*;

public class Sender {

    public Socket socket;
    public DataOutputStream dos;

    public Sender(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
        OutputStream os = socket.getOutputStream();
        this.dos = new DataOutputStream(os);
    }

    public void send(String msg) throws IOException {
        dos.writeUTF(msg);
        dos.flush();
    }
}
