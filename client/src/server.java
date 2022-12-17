package org.example;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket (port:8000);
        while (true){
            Socket clientSocket= serverSocket.accept();
            System.out.printIn("Тверь");
            OutputStreamWriter write = new OutputStreamWriter ((clientSocket.GetOutputStream());
            write.write(str: "x^2-16=0");
            writer.flush();
            writer.flush();

            clientSocket.close();
        }
    }
}
