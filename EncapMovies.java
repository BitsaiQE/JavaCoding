package com.javacoding;

public class EncapMovies {

    public static void main(String[] args) {
        Movies movie1 = new Movies("Bahuballi2","Rajamouli","PG-13");
        //G,PG,PG-13,R,NR
       movie1.setRating("garbage");
       movie1.getRating();


        System.out.println(movie1.getRating());

    }


}
