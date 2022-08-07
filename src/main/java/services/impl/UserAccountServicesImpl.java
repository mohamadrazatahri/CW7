package services.impl;

import entity.UserType;
import services.UserAccountServices;

public class UserAccountServicesImpl implements UserAccountServices {

    @Override
    public double creditCal(UserType userType,double price) {
        if (userType == UserType.MEMBER) {
            return price * 0.8;
        } else if (userType == UserType.ADMIN_USER) {
            return 0;
        } else if (userType == UserType.STUDENT_USER) {
            return price;
        } else if (userType == UserType.TEACHER_USER) {
            return price * 0.6;
        } else {
            System.out.println(" ERROR 404 ");
            return price;

        }

    }

    @Override
    public void login() {

    }

    @Override
    public void signup() {

    }

}
