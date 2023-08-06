package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Something {
    public static void main(String[] args) {
        HinhChuNhat tableA = new HinhChuNhat();
        String fullName = "Nhung";
        DangNhap dangNhap = new DangNhap();
        ThongTin userA = new ThongTin();
        userA.setUserName("Nhung");



        //System.out.println(fullName);
        //System.out.println(tableA);
/*        System.out.println(dangNhap.hinhChuNhat);
        System.out.println(dangNhap.age);
        System.out.println(dangNhap.isBoy);
        System.out.println(tableA.tinhDienTich());
        System.out.println(userA.getUserName());*/

/*        List<String> vatnuoi = new ArrayList<>();
        vatnuoi.add("cho");
        vatnuoi.add("meo");
        vatnuoi.add(12);
        System.out.println(vatnuoi);

        List<String> clothes = Arrays.asList("quan dai","quan ngan");
        //clothes.add("ao somi");
        System.out.println(clothes);*/

        List<String> phukien = List.of("giay", "dep", "giay");
        //phukien.add("tat");
        System.out.println(phukien);

        List<String> repeatedList = Collections.nCopies(5, "Hello");
        System.out.println(repeatedList);

        List<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
        System.out.println(numbers1);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .filter(n -> n > 3)      // Lọc các số lớn hơn 3
                .map(n -> n * 2)         // Nhân các số còn lại với 2
                .reduce(0, Integer::sum); // Tính tổng của các số đã nhân

        System.out.println("Tổng của các số lớn hơn 3 sau khi nhân đôi là: " + sum);



    }

}
