package org.example;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\nxin chao ban!\n" +"Toi ten la:");
        System.out.println("Nhung");
        System.out.println('a');
/*        System.out.println(123);
        System.out.println(2+5); */
        String firstName ="Pham";
        String lastName ="Nhung";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        int age = 21;
        boolean under18 = false;
        float experienceYear = 3.5f;
        System.out.println(firstName+"\ntuoi:" +age + "\nnam kinh nghiem:" + experienceYear);
        System.out.println(under18);

        final int DAYOFF =6;
        System.out.println(DAYOFF);

        int x = 6;
        int y = 3;
        System.out.print("tong: ");
        System.out.println(x+y);
        System.out.print("tich: ");
        System.out.println(x*y);
        System.out.print("chia: ");
        System.out.println(x/y);
        System.out.print("hieu: ");
        System.out.println(x-y);

        int a=2, b=3, c=4;
        System.out.println(a+b-c);

        char myName = 0;
        System.out.println(myName);

        int numberA = 6;
        float numberB =numberA;
        System.out.println(numberA);
        System.out.println(numberB);

        double numberC = 9d;
        int numberD =(int)numberC;
        System.out.println(numberC);
        System.out.println(numberD);

        int numberE = 6;
        int z = 10;
        System.out.println(numberE>=z);





    }
}