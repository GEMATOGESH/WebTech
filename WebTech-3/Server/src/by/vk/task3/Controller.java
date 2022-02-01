package by.vk.task3;

import by.vk.task3.entity.Case;
import by.vk.task3.entity.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Controller {
    public static void init() throws IOException {
        Logic.init();

        ServerSocket listener = null;

        Main.printOut("Server is waiting to accept user...");
        int clientNumber = 0;

        try {
            listener = new ServerSocket(7777);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        try {
            while (true) {

                Socket socketOfServer = listener.accept();
                new ServiceThread(socketOfServer, clientNumber++).start();
            }
        } finally {
            listener.close();
        }
    }

    private static void log(String message) {
        Main.printOut(message);
    }

    static class ServiceThread extends Thread {

        private int clientNumber;
        private Socket socketOfServer;

        public ServiceThread(Socket socketOfServer, int clientNumber) {
            this.clientNumber = clientNumber;
            this.socketOfServer = socketOfServer;
            log("New connection with client# " + this.clientNumber + " at " + socketOfServer);
        }

        @Override
        public void run() {

            try {
                BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
                BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));

                String line = is.readLine();

                os.write("Enter userId: ");
                os.newLine();
                os.flush();
                int userId = Integer.parseInt(is.readLine());
                os.write("Enter pass: ");
                os.newLine();
                os.flush();
                String pass = is.readLine();
                User user = Logic.auth(userId, pass);
                if (user == null) {
                    os.write("Quitting...");
                    os.newLine();
                    os.flush();
                    return;
                }
                os.write("Enter command: ");
                os.newLine();
                os.flush();

                while (true) {
                    line = is.readLine();

                    switch (line) {
                        case  ("newuser"):
                            if (user.getRights() == true) {
                                os.write("Enter id: ");
                                os.newLine();
                                os.flush();
                                int user_id = Integer.parseInt(is.readLine());
                                os.write("Enter pass: ");
                                os.newLine();
                                os.flush();
                                String user_pass = is.readLine();
                                os.write("Enter rights: ");
                                os.newLine();
                                os.flush();
                                boolean user_rights = Boolean.parseBoolean(is.readLine());
                                boolean success = Logic.newUser(new User(user_id, user_pass, user_rights));
                                if (!success) {
                                    os.write("Failure. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                                else {
                                    Logic.saveUsersState();
                                    os.write("Success. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                            }
                        case ("newcase"):
                            if (user.getRights()) {
                                os.write("Enter id: ");
                                os.newLine();
                                os.flush();
                                int case_id = Integer.parseInt(is.readLine());
                                os.write("Enter user id: ");
                                os.newLine();
                                os.flush();
                                int case_user_id = Integer.parseInt(is.readLine());
                                os.write("Enter info: ");
                                os.newLine();
                                os.flush();
                                String case_info = is.readLine();
                                User case_user = Logic.getUser(case_user_id);
                                boolean success = Logic.newCase(new Case(case_id, case_user, case_info));
                                if (success) {
                                    Logic.saveCasesState();
                                    os.write("Success. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                                else {
                                    os.write("Failure. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                            }
                        case ("changeuser"):
                            if (user.getRights()) {
                                os.write("Enter user id: ");
                                os.newLine();
                                os.flush();
                                int user_to_change_id = Integer.parseInt(is.readLine());
                                os.write("Enter new id: ");
                                os.newLine();
                                os.flush();
                                int new_user_id = Integer.parseInt(is.readLine());
                                os.write("Enter new pass: ");
                                os.newLine();
                                os.flush();
                                String new_user_pass = is.readLine();
                                os.write("Enter new rights: ");
                                os.newLine();
                                os.flush();
                                boolean new_user_rights = Boolean.parseBoolean(is.readLine());
                                boolean success = Logic.changeUser(user_to_change_id, new User(new_user_id, new_user_pass, new_user_rights));
                                if (success) {
                                    Logic.saveUsersState();
                                    os.write("Success. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                                else {
                                    os.write("Failure. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                            }
                            else {
                                os.write("You don't have rights. Enter new command: ");
                                os.newLine();
                                os.flush();
                                break;
                            }
                        case ("changecase"):
                            if (user.getRights()) {
                                os.write("Enter case id: ");
                                os.newLine();
                                os.flush();
                                int case_to_change_id = Integer.parseInt(is.readLine());
                                os.write("Enter new case id: ");
                                os.newLine();
                                os.flush();
                                int new_case_id = Integer.parseInt(is.readLine());
                                os.write("Enter new user id: ");
                                os.newLine();
                                os.flush();
                                int case_to_change_user_id = Integer.parseInt(is.readLine());
                                User change_case_user = Logic.getUser(case_to_change_user_id);
                                if (change_case_user == null) {
                                    os.write("User doesn't exist. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                                os.write("Enter new info: ");
                                os.newLine();
                                os.flush();
                                String new_case_info = is.readLine();
                                boolean success = Logic.changeCase(case_to_change_id, new Case(new_case_id, change_case_user, new_case_info));
                                if (success) {
                                    Logic.saveCasesState();
                                    os.write("Success. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                                else {
                                    os.write("Failure. Enter new command: ");
                                    os.newLine();
                                    os.flush();
                                    break;
                                }
                            }
                            else {
                                os.write("You don't have rights. Enter new command: ");
                                os.newLine();
                                os.flush();
                                break;
                            }
                        case ("showcase"):
                            os.write("Enter case id: ");
                            os.newLine();
                            os.flush();
                            int case_to_show = Integer.parseInt(is.readLine());
                            os.write(Logic.showCase(case_to_show) + ". Enter new command: ");
                            os.newLine();
                            os.flush();
                            break;
                        case ("quit"):
                            os.write("Quitting...");
                            os.newLine();
                            os.flush();
                            break;
                        default:
                            os.write("There are no command:  " + line + ". Enter new command: ");
                            os.newLine();
                            os.flush();
                            break;
                    }
                }

            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
