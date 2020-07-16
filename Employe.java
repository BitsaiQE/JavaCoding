package com.javacoding;

public abstract class Employe {
    private String eName;
    private String address;
    private int eID;

    public Employe(String eName,String address,int eID){
        System.out.println("employee constrctor");

        this.eName = eName;
        this.address = address;
        this.eID = eID;

    }

    public double computePay(){
        System.out.println( "pay compuatation");
        return 0.0;
    }

    public String geteName(){
        return eName;
    }

    public void mailCheck(){
        System.out.println( "mailing check to" + this.eName + " "+this.address);

    }


    public String toString() {
        return eName + " " + address + "" + eID;
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
