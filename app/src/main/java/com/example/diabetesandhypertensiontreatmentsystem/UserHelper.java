package com.example.diabetesandhypertensiontreatmentsystem;

public class UserHelper {
    String Name ,telephone;
    public UserHelper(){

    }

    public UserHelper(String name, String telephone) {
        Name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
