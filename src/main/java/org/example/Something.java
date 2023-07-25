package org.example;

public class Something {
    public static void main(String[] args) {
        HinhChuNhat tableA = new HinhChuNhat();
        String fullName = "Nhung";
        DangNhap dangNhap =new DangNhap();
        ThongTin userA = new ThongTin();


        //System.out.println(fullName);
        //System.out.println(tableA);
        System.out.println(dangNhap.hinhChuNhat);
        System.out.println(dangNhap.age);
        System.out.println(dangNhap.isBoy);
        System.out.println(tableA.tinhDienTich());
        System.out.println(ThongTin.userA);
    }

}
