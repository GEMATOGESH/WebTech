package by.vk.task3.entity;

public class Case {
    int id;
    User user;
    String info;

    public Case() { }

    public Case(int id, User user, String info) {
        this.id = id;
        this.user = user;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
