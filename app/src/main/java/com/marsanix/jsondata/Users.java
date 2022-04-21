package com.marsanix.jsondata;

public class Users {

    private String id, first_name, email, avatar;

    public Users(String id, String first_name, String email, String avatar) {
        this.id = id;
        this.first_name = first_name;
        this.email = email;
        this.avatar = avatar;
    }

    public Users() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
