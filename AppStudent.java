package com.javacoding;

public class AppStudent {
    public static void main(String[] args) {
        Student myStudent1 = new Student("Sushma","Koppula",25,"female",3.5,"mca","AU",true);
        Student myStudent2 = new Student("Ravi","vepula",26,"male",3.8,"bbm","CU",true);
       /* myStudent1.firstname ="Sushma";
        myStudent1.lastname = "Koppula";
        myStudent1.age =25;
        myStudent1.gender ="female";
        myStudent1.course ="mca";
        myStudent1.gpa =  3.5;
        myStudent1.isInternationalStudent = true;*/

        /*Student myStudent2 = new Student();
        myStudent2.firstname ="Ravi";
        myStudent2.lastname = "veppula";
        myStudent2.age =26;
        myStudent2.gender ="male";
        myStudent2.course ="bbm";
        myStudent2.gpa =  4.0;
        myStudent2.isInternationalStudent = true;*/


        System.out.println(myStudent1.isInternationalStudent);
        System.out.println(myStudent1.firstname);
        System.out.println(myStudent2.lastname);
        System.out.println(myStudent2.firstname);


    }
}
