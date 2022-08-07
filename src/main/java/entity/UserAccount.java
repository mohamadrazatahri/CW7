package entity;

import java.util.Objects;

public class UserAccount extends Person {

    UserType userType;
    private String userName;
    private String password;
    private boolean isBlocked;
    private double credit;
    private String dor;
    private int borrowedNumber;
    private int reservedNumber;
    private int returnedNumber;
    private double creditClac;

    public UserAccount(UserType userType, String userName, String password, boolean isBlocked, double credit, String dor, int borrowedNumber, int reservedNumber, int returnedNumber) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.isBlocked = isBlocked;
        this.credit = credit;
        this.dor = dor;
        this.borrowedNumber = borrowedNumber;
        this.reservedNumber = reservedNumber;
        this.returnedNumber = returnedNumber;
    }

    public UserAccount(long id, String firstName, String lastName, String birthDate) {
        super(id, firstName, lastName, birthDate);
    }

    public UserAccount() {
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getDor() {
        return dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public int getBorrowedNumber() {
        return borrowedNumber;
    }

    public void setBorrowedNumber(int borrowedNumber) {
        this.borrowedNumber = borrowedNumber;
    }

    public int getReservedNumber() {
        return reservedNumber;
    }

    public void setReservedNumber(int reservedNumber) {
        this.reservedNumber = reservedNumber;
    }

    public int getReturnedNumber() {
        return returnedNumber;
    }

    public void setReturnedNumber(int returnedNumber) {
        this.returnedNumber = returnedNumber;
    }

    public double getCreditClac() {
        return creditClac;
    }

    public void setCreditClac(double creditClac) {
        this.creditClac = creditClac;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userType=" + userType +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isBlocked=" + isBlocked +
                ", credit=" + credit +
                ", dor='" + dor + '\'' +
                ", borrowedNumber=" + borrowedNumber +
                ", reservedNumber=" + reservedNumber +
                ", returnedNumber=" + returnedNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserAccount that = (UserAccount) o;
        return isBlocked == that.isBlocked && Double.compare(that.credit, credit) == 0 && borrowedNumber == that.borrowedNumber && reservedNumber == that.reservedNumber && returnedNumber == that.returnedNumber && userType == that.userType && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(dor, that.dor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userType, userName, password, isBlocked, credit, dor, borrowedNumber, reservedNumber, returnedNumber);
    }

    public double creditCal(UserAccount userAccount) {

        return 0;
    }

}
