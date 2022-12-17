package org.example;
import java.net.*;
import java.io.*;
public class Client {
    public static void main (String[] args) throws IOException {
        {try(Socket ClientSocket = new Socket(host:"127.0.0.1", port:8000) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();

        }catch (I0Expention e){
            System.out.printIn("error404");
        }
        }
    }
}