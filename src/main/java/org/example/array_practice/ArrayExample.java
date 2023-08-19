package org.example.array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {


    public static void swap(int[] array, int index0, int index1) {
        int temp = array[index0];
        array[index0] = array[index1];
        array[index1] = temp;
    };


    public static void main(String[] args) {
        //Cho một array là dãy số tự nhiên từ 1 đến 10. Viết chương trình loại bỏ các số chẵn ra khỏi mảng
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                int[] b = {a[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }
        //tạo ra một mảng có 2 phần tử là số tự nhiên. Rồi đổi chỗ 2 phần tử đó
        int[] array = {1, 7};
        swap(array, 0, 6);
        System.out.println(Arrays.toString(array));
    }
}

