package org.example;

import org.example.interfaces.IUserManagement;

public class ExampleJava {
    public static class Main {
        static void myMethod(int x) {
            System.out.println(x+5);
        }
    }

    public static void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so lieu tuong ung:");
        int numberA = sc.nextInt();
        int numberB = sc.nextInt();
        for (int i=numberA; i>=numberB; i-- ){
            System.out.print(i +" ");
        };*/

/*        String nameUserA = "NhungPham";


        nameUserA.chars();
        System.out.println(nameUserA.chars());
        //List<String> studentList = List.of("Lan","Long","Tuan","Huong","Thuy","Huy");
        System.out.println();*/
/*
        int[] xxx = {10, 20};
        List<String> list = new ArrayList<String>(10);
        list.add("01");
        list.add("02");
        System.out.println(xxx.length + ", " +list.size());*/

/*        int q = 0;
        for(int p = 0; p< 10; p++){
            q++;
            p+=q;
            System.out.print(p + " ");*/
/*        int x = 10;
        int y = 20;
        swap(x, y);//Chỉ work trong hàm swap. Ngoài hàm swap là không ảnh hưởng tới giá trị ban đầu
        System.out.println(x + " " + y);
    }

    static void swap(int p, int q) {
        int temp = p;
        p = q;
        q = temp;
        System.out.println(p + " " + q);
    }
 */
/*        Main myNumber = new Main();
        myNumber.myMethod(3);*/
/*        IUserManagement user01 = new UserAImp();
        user01.setUsername();
        System.out.println(user01.setUsername());*/
/*        UserBImp user02 = new UserBImp();
        System.out.println(user02.setUsername());*/
        //user01.countAge();
        //System.out.println(user01.countAge());

        //double dienTichTamGiac = (length * width)/2;

/*        System.out.println("dien tich tam giac= "+dienTichTamGiac(4,5));
        long a = 384847522 ;
        long b = 988347273;
        System.out.println("tich:" + (a*b) );

        boolean x = true;
        System.out.println(x);*/

        int a = 6;
        int b = 6;
        boolean c = a==b;
        System.out.println(c);

    }

    double length;
    double width;

    private static double dienTichTamGiac(double length, double width) {
        return (length * width) / 2;
    }

}








