package com.javacoding;

public class InheritanceDemo{
    public static void main(String[] args) {

        CalcVeryAdv c1 = new CalcVeryAdv();
        int sum = c1.add(19,27);
        int sub = c1.sub(99,29);
        int mul = c1.multi(29,37);

        System.out.println("Addition of two numbers is: "+sum);
        System.out.println("Difference of two numbers is: "+sub);
        System.out.println("Multiplication of two numbers is: "+mul);

    }
}