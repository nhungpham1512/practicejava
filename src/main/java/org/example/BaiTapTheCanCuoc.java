package org.example;

public class BaiTapTheCanCuoc {
    public static void main(String[] args) {
        TheCanCuoc user01 = new TheCanCuoc("Nhung Pham",18);
        user01.setBoy(false);
        user01.setPersonalIdentification("0011");
        user01.setAddress("HaNoi");
        System.out.println(user01.toString());

        TheCanCuoc user02 = new TheCanCuoc("Tuan Nguyen",20);
        user02.setBoy(true);
        user02.setPersonalIdentification("0012");
        user02.setAddress("NamDinh");
        System.out.println(user02.toString());

        TheCanCuoc user03 = new TheCanCuoc("Ngoc Tran",15);
        user03.setBoy(false);
        user03.setPersonalIdentification("0013");
        user03.setAddress("HaiPhong");
        System.out.println(user03.toString());

        TheCanCuoc user04 =new TheCanCuoc("Duong Nguyen", 32);
        user04.setBoy(true);
        user04.setPersonalIdentification("0014");
        user04.setAddress("HaiPhong");
        System.out.println(user04.toString());

        TheCanCuoc user05 = new TheCanCuoc("Thanh Le",20);
        user05.setBoy(true);
        user05.setPersonalIdentification("0015");
        user05.setAddress("ThaiBinh");
        System.out.println(user05.toString());

        }
}
