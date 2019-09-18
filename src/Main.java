
import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        String severName = "10.195.174.194";
        int port = 4242;
        try {
            Socket client = new Socket(severName,port);
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("hello from "+client.getLocalAddress());

            InputStream inputStream = client.getInputStream();
            DataInputStream in = new DataInputStream(inputStream);
            System.out.println("服务器回应："+in.readUTF());
            client.close();

        }catch (Exception e){
             e.printStackTrace();
        }
    }
}
