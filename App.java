package com.javacoding;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboardinput = new Scanner(System.in);
        //First number
        System.out.println("Please enter a First name:");
      //  double num1 = keyboardinput.nextDouble();
          String firstname = keyboardinput.next();
        System.out.println("Please enter a Last name:");
        String lastname = keyboardinput.next();
        String name = firstname + lastname;
        //Second number
      //  System.out.println("Please enter Second number:");
     //   double num2 = keyboardinput.nextDouble();
        // Storing values in Variable name sum
       /* if (num1%2 ==0){
            System.out.println("Number is Even");

        }
        else{
            System.out.println("Number is Odd");
        }


        //double sum = num1 + num2;
       // System.out.println(sum);*/
        System.out.println(name);



    }
}
