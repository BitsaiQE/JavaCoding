package com.javacoding;

public class ExceptionsDemo {

    public static void main(String[] args) {

        try {
            int a[] = new int[7];
            a[6] = 30 / 4;

            System.out.println(+a[6]);
        }
        catch (Exception e){
            System.out.println("System Generated error: "+e);
            //System.out.println("Warning: Division by zero is  not possible, Please use other than zero in the denomincator");
        }

    }
}
