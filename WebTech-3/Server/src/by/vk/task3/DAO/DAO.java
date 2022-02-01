package by.vk.task3.DAO;

import by.vk.task3.entity.Case;
import by.vk.task3.entity.User;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class DAO {
    public static void serializeUsers(ArrayList<User> mas) throws Exception {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("src/by/vk/task3/resources/users.xml")));
        } catch(FileNotFoundException fileNotFound){
            throw new Exception("Cannot open file");
        }

        int length = mas.size();
        encoder.writeObject(length);
        for (Object obj : mas) {
            encoder.writeObject(obj);
        }
        encoder.close();
    }

    public static void serializeCases(ArrayList<Case> mas) throws Exception {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("src/by/vk/task3/resources/cases.xml")));
        } catch(FileNotFoundException fileNotFound){
            throw new Exception("Cannot open file");
        }

        int length = mas.size();
        encoder.writeObject(length);
        for (Object obj : mas) {
            encoder.writeObject(obj);
        }
        encoder.close();
    }

    public static ArrayList<User> deserializeUsers() throws Exception {
        XMLDecoder decoder = null;
        try {
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("src/by/vk/task3/resources/users.xml")));
        } catch (FileNotFoundException e) {
            throw new Exception("Cannot open file");
        }

        ArrayList<User> users = new ArrayList<User>();

        int length = (int) decoder.readObject();
        for (int i = 0; i < length; i++) {
            Object obj = decoder.readObject();
            User buf = (User)obj;
            users.add(buf);
        }

        return users;
    }

    public static ArrayList<Case> deserializeCases() throws Exception {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("src/by/vk/task3/resources/cases.xml")));
        } catch (FileNotFoundException e) {
            throw new Exception("Cannot open file");
        }

        ArrayList<Case> cases = new ArrayList<Case>();

        int length = (int) decoder.readObject();
        for (int i = 0; i < length; i++) {
            Object obj = decoder.readObject();
            Case buf = (Case)obj;
            cases.add(buf);
        }

        return cases;
    }
}
