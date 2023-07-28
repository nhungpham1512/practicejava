package org.example;

public class TheCanCuoc {
        private String fullName;
        private int age;
        private boolean isBoy = false;
        private String personalIdentification;
        private String address;

    public TheCanCuoc(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

   public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
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
        return  "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                ", personalIdentification='" + personalIdentification + '\'' +
                ", address='" + address ;

    }
}
