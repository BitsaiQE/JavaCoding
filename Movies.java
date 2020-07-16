package com.javacoding;
public class Movies {
    String title;
    String director;
    private String rating;

    public Movies(String title,String director,String rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    public void  setRating(String rating){
        if (rating.equals("G")||rating.equals("PG")||rating.equals("PG-13")||rating.equals("R")){
            this.rating = rating;
        }else{
            this.rating = "NR";
        }
    }
    public String getRating(){
        return this.rating;
    }


}
