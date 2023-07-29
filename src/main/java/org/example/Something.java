package org.example;

import java.util.List;

public class Something {
    public static void main(String[] args) {
        HinhChuNhat tableA = new HinhChuNhat();
        String fullName = "Nhung";
        DangNhap dangNhap =new DangNhap();
        ThongTin userA = new ThongTin();
        userA.setUserName("Nhung");


        //System.out.println(fullName);
        //System.out.println(tableA);
        System.out.println(dangNhap.hinhChuNhat);
        System.out.println(dangNhap.age);
        System.out.println(dangNhap.isBoy);
        System.out.println(tableA.tinhDienTich());
        System.out.println(userA.getUserName());

    }

}
