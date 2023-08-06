package org.example;

import org.example.interfaces.IUserManagement;

import java.util.Scanner;

public class UserAImp implements IUserManagement {

    int x=5;
  @Override
    public String setUsername(){
       return ("Nhung");
   }

   public int countAge(){
       //System.out.println(x++);
       return x++;
   }
}
