package com.javacoding;

public class EmpSalary extends Employe {
    private double salary;

    public EmpSalary(String eName, String address, int eID,double salary) {
        super(eName, address, eID);
        setEmpSalary(salary);
    }

    public void mailcheck(){
        System.out.println("salary class mail check");
        System.out.println("Mailing check to  :"+geteName()+"   " +" with salary "+ salary);
    }

    public double getSalary()
    {
        return salary;
    }

    private void setEmpSalary(double newSalary) {
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }

    public double computePay(){
        System.out.println("computing salary pay for "+ geteName() + geteID());
        return salary;
    }
}
