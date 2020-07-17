package com.javacoding;

public abstract class Employe {
    private String eName;
    private String address;
    private int eID;
    private int  noExtrahours;
    private float payPerHour;
    private float actualSal;
    private float basicPay;

    public Employe(String eName,String address,int eID){
        System.out.println("employee constrctor");

        this.eName = eName;
        this.address = address;
        this.eID = eID;

    }

    public double computePay(){

        float actualSal = (basicPay + (noExtrahours *  payPerHour));

        System.out.println( "pay compuatation :"+actualSal);
        return 0.0;
    }

    public String geteName(){
        return eName;
    }

    public void mailCheck(){
        System.out.println( "mailing check to" + this.eName + " "+this.address);

    }


    public String toString() {
        return eName + " " + address + " " + eID;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAdress){
        address = newAdress;
    }

    public int geteID() {
        return eID;
    }
}
