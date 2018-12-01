package com.example.windows81.mynamecard.yok;

public class YokModel
{
    private String firstName;
    private String address;
    private String tel;
    private String email;
    private String birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public YokModel(String firstName, String address, String tel, String email, String birthday) {
        this.firstName = firstName;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.birthday = birthday;
    }






}
