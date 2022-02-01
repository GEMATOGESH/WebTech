package by.vk.task3.entity;

public class User {
    int id;
    String pass;
    boolean rights;

    public User() { }

    public User(int id, String pass, boolean rights) {
        this.id = id;
        this.pass = pass;
        this.rights = rights;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean getRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
