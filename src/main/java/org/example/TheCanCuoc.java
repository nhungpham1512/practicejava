package org.example;

public class TheCanCuoc {
        private String firstName;
        private String lastName;
        private int age;
        private boolean isBoy = false;
        private String personalIdentification;
        private String address;

    public TheCanCuoc(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        this.isBoy = boy;
    }

    public String getPersonalIdentification() {
        return personalIdentification;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String  toString() {
        return  "fullName='" + firstName + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                ", personalIdentification='" + personalIdentification + '\'' +
                ", address='" + address +"'" ;

    }
}
