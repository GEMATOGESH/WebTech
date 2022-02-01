package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	public static Object[] login(String query) throws Exception {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                ResultSet rset = stmt.executeQuery(query);
                if (rset.next()) {
                    String login = rset.getString(1);
                    boolean rights = rset.getBoolean(2);
                    return new Object[] { login, rights };
                }
                else {
                	return null;
                }
            }
        }
        catch(Exception ex){
            throw ex;
        }
	}
	
	public static boolean update(String query) {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                stmt.executeUpdate(query);
                return true;
            }
        }
        catch(Exception ex){
            return false;
        }
	}
	
	public static ArrayList<Room> mangtable(String query) throws Exception {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            
            ArrayList<Room> list = new ArrayList<Room>();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                ResultSet rset = stmt.executeQuery(query);
                while (rset.next()) {
                	int id = rset.getInt(1);
                	String type = rset.getString(2);
                	int cost = rset.getInt(3);
                	boolean booked = rset.getBoolean(4);
                	String user = rset.getString(5);
                	Room room = new Room(id, type, cost, booked, user);
                	
                	list.add(room);
                }
            }
            return list;
        }
        catch(Exception ex){
            throw ex;
        }
	}

	public static ArrayList<Room> usertable(String query) throws Exception {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            
            ArrayList<Room> list = new ArrayList<Room>();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                ResultSet rset = stmt.executeQuery(query);
                while (rset.next()) {
                	int id = rset.getInt(1);
                	String type = rset.getString(2);
                	int cost = rset.getInt(3);
                	boolean booked = rset.getBoolean(4);
                	Room room = new Room(id, type, cost, booked, " ");
                	
                	list.add(room);
                }
            }
            return list;
        }
        catch(Exception ex){
            throw ex;
        }
	}
	

	public static boolean exist(String query) throws Exception {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                ResultSet rset = stmt.executeQuery(query);
                if (rset.next()) {
                    return true;
                }
                else {
                	return false;
                }
            }
        }
        catch(Exception ex){
            throw ex;
        }
	}
	
	public static void book(String id, String user) throws Exception {
		try{
            String url = "jdbc:mysql://localhost:3306/vt";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement stmt = conn.createStatement();

                ResultSet rset = stmt.executeQuery("Select id from auth where login = '" + user + "';");
                rset.next();
                int user_id = rset.getInt(1);
                
                stmt.executeUpdate("update rooms set booked = 1 where id = " + id + ";");
                stmt.executeUpdate("insert into roominuse (room_id, user_id) values (" + id + ", " + user_id + ");");
            }
        }
        catch(Exception ex){
            throw ex;
        }
	}
}
