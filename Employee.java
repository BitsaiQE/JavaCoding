package com.javacoding;

public class   Employee {
    String name;
    int eID;
    int salary;
    static String ceo;
    static String insuranceprovider;

public Employee(){

        name = "Please enter your name";
        eID = 1001;
        salary = 3000;
         System.out.println("we are in constructor method");

    }

    static  {
        ceo = "Brain Porter";
        insuranceprovider = "Sunlife";
        System.out.println("in static");

    }

 public void show(){
     System.out.println("Employee Name:"+name+ "   "+"Employee ID:"+eID + ":" + salary +":"+ceo +":"+insuranceprovider);
 }


}

