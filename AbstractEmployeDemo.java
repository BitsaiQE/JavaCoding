package com.javacoding;

public class AbstractEmployeDemo {

    public static void main(String[] args) {

      /*  Employe emp1 = new Employe("Jorge","Northyork",1001);
        System.out.println("\n test mail check using employee ref");
        emp1.mailCheck();*/

        EmpSalary esal = new EmpSalary("Jorge","Northyork, ON",1001,5000.50);
        Employe emp1 = new EmpSalary("Ravi","Northyork",1002,5000);
        esal.mailcheck();
        emp1.mailCheck();
    }
}
