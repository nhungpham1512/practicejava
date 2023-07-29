package org.example;

import java.util.ArrayList;

public class BaiTapTheCanCuoc {
    public static void main(String[] args) {
        TheCanCuoc user01 = new TheCanCuoc("Nhung","Pham", 18);
        user01.setBoy(false);
        user01.setPersonalIdentification("0011");
        user01.setAddress("HaNoi");
        //System.out.println(user01);

        TheCanCuoc user02 = new TheCanCuoc("Tuan", "Ngo",20);
        user02.setBoy(true);
        user02.setPersonalIdentification("0012");
        user02.setAddress("NamDinh");
        //System.out.println(user02);

        TheCanCuoc user03 = new TheCanCuoc("Ngoc", "Tran",31);
        user03.setBoy(false);
        user03.setPersonalIdentification("0013");
        user03.setAddress("HaiPhong");
        //System.out.println(user03);

        TheCanCuoc user04 =new TheCanCuoc("Duong", "Nguyen",17);
        user04.setBoy(true);
        user04.setPersonalIdentification("0014");
        user04.setAddress("HaiPhong");
        //System.out.println(user04);

        TheCanCuoc user05 = new TheCanCuoc("Thanh", "Le",20);
        user05.setBoy(true);
        user05.setPersonalIdentification("0015");
        user05.setAddress("ThaiBinh");
        //System.out.println(user05);

        ArrayList<TheCanCuoc> people = new ArrayList<TheCanCuoc>();
        people.add(new TheCanCuoc("Manh","Vu",26));
        people.add(new TheCanCuoc("Lan","Nguyen",27));
        people.add(new TheCanCuoc("Hung","Phan",16));
        people.add(new TheCanCuoc("Ngan","Nguyen",22));
        people.add(new TheCanCuoc("Duc","Pham",18));
        people.add(user01);
        people.add(user02);
        people.add(user03);
        people.add(user04);
        people.add(user05);

        for (TheCanCuoc user:people) {
            if (user.getLastName().equals("Nguyen")){
                System.out.println(user.getFirstName()+" "+user.getLastName());
            }
        }
        for (TheCanCuoc userAge: people){
            if (userAge.getAge()<=18){
                System.out.println(userAge.getFirstName()+" "+userAge.getLastName()+": "+userAge.getAge());
            }
        }
        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getAge()>18){
                System.out.println(people.get(i));
            }
        }
        int k = 0;
        while (k< people.size()){
            if(people.get(k).getLastName().equals("Pham")){
                System.out.println(people.get(k));
             };
             k++;
        };
        int j = 0;
        do {
            if(people.get(j).getLastName().startsWith("N")){
                System.out.println(people.get(j));
            };
            j++;
        }
        while (j<people.size());
    }
}
