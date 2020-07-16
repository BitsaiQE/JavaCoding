package com.javacoding;

public class DemoArray {

    public static void main(String[] args) {
        String myStudent = "Ravi";
        String[] mystudentList = {"ravi","swathi","sai","komal","jothsna","pratima","praveena","sushma","priyanka"};
        //indexing start from
       // System.out.println(mystudentList[4]);
        //Print all the array elements

        for (int i =0; i < mystudentList.length;i++){
        try {

            //System.out.println(i+":"+mystudentList[i]);
            System.out.println(mystudentList[11]);
        } catch (Exception e){
           // System.out.println(e);
            if (mystudentList[i].equals("pratima")) {
                System.out.println("Record found");
                break;
            } else {
                System.out.println(i + ":" + mystudentList[i].toUpperCase());
                //break;

            }

         }
        }

    }
}
