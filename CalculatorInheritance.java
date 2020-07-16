package com.javacoding;
//Super Class or Parent Class or Base class
public class CalculatorInheritance {

   public int add(int a, int b) {
        return a+b;
   }
}
//sub class or Child class
class CalcAdv extends CalculatorInheritance{

   /* public int add(int a, int b) {
        return a+b;
    } */

    public int sub(int a, int b){
        return  a-b;
    }
}

class CalcVeryAdv extends CalcAdv{

    public int multi(int a, int b){
        return a*b;
    }
}

