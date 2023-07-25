package org.example;

public class BaiTapTheCanCuoc {
    public static void main(String[] args) {
        TheCanCuoc user01 = new TheCanCuoc();
        user01.setName("Nhung");
        user01.setAge(18);
        user01.setisBoy(false);
        user01.setPersonalIdentification("0008");
        user01.setAddress("HaNoi");
        System.out.println(user01.getName()+"\nTuoi:"+ user01.getAge()+"\nGioi tinh(Nam):"+ user01.getisBoy()+"\nChung Minh Thu:"+ user01.getPersonalIdentification()+"\nDia chi:"+ user01.getAddress());
    }
}
