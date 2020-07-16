package com.javacoding;

public class StaticDemo {

    static int i =0;

    public static void main(String[] args) {

           // i=1005;

        Employee employee1 = new Employee();
        employee1.name = "Sai";
        employee1.eID = 1002;
        employee1.salary = 4000;
      //  Employee.ceo ="Brain Porter";
       // Employee.insurnaceprovider = "Sunlife"

        // another employee

        Employee employee2 = new Employee();
        employee2.name = "Praveena";
        employee2.eID = 1003;
        employee2.salary = 5000;
        int a=1;
        int b=5;
        double sum=a%b;
        System.out.println(sum);
       // Employee.ceo ="Brain Porter";
       // Employee2.insurnaceprovider = "Sunlife"
        employee1.show();
        employee2.show();

    }
}
