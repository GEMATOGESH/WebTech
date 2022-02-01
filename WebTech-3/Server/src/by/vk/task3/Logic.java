package by.vk.task3;

import by.vk.task3.DAO.DAO;
import by.vk.task3.entity.Case;
import by.vk.task3.entity.User;

import java.util.ArrayList;

public class Logic {
    static ArrayList<User> users = new ArrayList<User>();
    static ArrayList<Case> cases = new ArrayList<Case>();

    static void init() {
        try {
            users = DAO.deserializeUsers();
            cases = DAO.deserializeCases();
        }
        catch (Exception ex) {
            Main.printOut("Error with database!");
        }
    }

    public static User getUser(int id) {
        User case_user = null;
        for (User obj : users) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }

    public static User auth(int id, String pass) {
        for (User obj : users) {
            if (obj.getId() == id) {
                if (obj.getPass().equals(pass))
                    return obj;
            }
        }
        return null;
    }

    public static void saveUsersState() {
        try {
            DAO.serializeUsers(users);
        }
        catch (Exception ex) {
            Main.printOut("Error while saving users!");
        }
    }

    public static void saveCasesState() {
        try {
            DAO.serializeCases(cases);
        }
        catch (Exception ex) {
            Main.printOut("Error while saving cases!");
        }
    }

    public static boolean newUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                return false;
            }
        }

        users.add(user);
        return true;
    }

    public static boolean newCase(Case obj) {
        for (int i = 0; i < cases.size(); i++) {
            if (cases.get(i).getId() == obj.getId()) {
                return false;
            }
        }

        cases.add(obj);
        return true;
    }

    public static boolean changeUser(int old_user, User new_user) {
        for (User obj : users) {
            if (obj.getId() == old_user) {
                obj = new_user;
                return true;
            }
        }
        return false;
    }

    public static boolean changeCase(int old_case, Case new_case) {
        for (Case obj : cases) {
            if (obj.getId() == old_case) {
                obj = new_case;
                return true;
            }
        }
        return false;
    }

    public static String showCase(int id) {
        for (int i = 0; i < cases.size(); i++) {
            if (cases.get(i).getId() == id) {
                Case obj = cases.get(i);
                return obj.getUser().getId() + ": " + obj.getInfo();
            }
        }
        return "Failure";
    }
}
