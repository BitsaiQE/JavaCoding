package com.javacoding;

public  class Student {
    String firstname;
    String lastname;
    int age;
    String gender;
    double gpa;
    String course;
    String university;
    boolean isInternationalStudent;

    public Student(String firstname,String lastname,int age,String gender,double gpa,String course,String university,boolean isInternationalStudent){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
        this.course = course;
        this.university = university;
        this.isInternationalStudent = isInternationalStudent;
    }


}
