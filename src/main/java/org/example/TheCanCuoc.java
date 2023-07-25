package org.example;

public class TheCanCuoc {
        TheCanCuoc(){}
        String fullName;
        public String getName(){
            return fullName;
        }
        public void setName(String newfullName){
            this.fullName = newfullName;
        }
        int age;
        public int getAge(){
            return age;
        }
        public void setAge(int newage){
            this.age = newage;
        }
        boolean isBoy = false;
        public boolean getisBoy(){
            return isBoy;
        }
        public void setisBoy(boolean newisBoy){
            this.isBoy = newisBoy;
        }

        String personalIdentification;
        public String getPersonalIdentification(){
            return personalIdentification;
        }

        public void  setPersonalIdentification(String newsetPersonalIdentification){
            this.personalIdentification = newsetPersonalIdentification;
        }
        String address;
        public String getAddress(){
            return address;
        }
        public void setAddress(String newaddress){
            this.address = newaddress;
        }

}
