package by.vk.task3;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Controller {

    public static void init() {
        final String serverHost = "localhost";

        Socket socketOfClient = null;
        BufferedWriter os = null;
        BufferedReader is = null;

        try {
            socketOfClient = new Socket(serverHost, 7777);

            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
            is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));

        } catch (UnknownHostException e) {
            Main.printOut("Don't know about host " + serverHost);
            return;
        } catch (IOException e) {
            Main.printOut("Couldn't get I/O for the connection to " + serverHost);
            return;
        }

        try {
            BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));

            Main.printOut("Welcome! Press anything to continue...");
            while (true) {
                String line = inputUser.readLine();
                os.write(line);
                os.newLine();
                os.flush();
                String responseLine = is.readLine();
                Main.printOut(responseLine);
                if (line.equals("quit") || responseLine.equals("Quitting...")) {
                    os.close();
                    is.close();
                    socketOfClient.close();
                    break;
                }
            }
        } catch (UnknownHostException e) {
            Main.printOut("Trying to connect to unknown host: " + e);
        } catch (IOException e) {
            Main.printOut("IOException:  " + e);
        }
    }
}
