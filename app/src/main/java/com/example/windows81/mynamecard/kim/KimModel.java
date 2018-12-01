package com.example.windows81.mynamecard.kim;

public class KimModel {
    private String name;
    private String id;
    private String address;
    private String tel;
    private String email;

    public KimModel(String name, String id, String address, String tel, String email) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
