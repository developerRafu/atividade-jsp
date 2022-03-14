package miniblog.model;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate loginTime = LocalDate.now();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

}
