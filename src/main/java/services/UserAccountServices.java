package services;

import entity.UserType;

public interface UserAccountServices {
    public double creditCal(UserType userType, double price);

    void login();

    void signup();

}
