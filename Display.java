package movieApp;

import java.util.ArrayList;
import java.util.Random;
/*
This is the display class made for interaction with the User
 */
public class Display {
    /*
    This is the main method used for insertion of a hardcoded list of movies and calling the menu from MovieApp class
     */
    public static void main(String[] args){
        Random rd = new Random(); // creating Random object

        Movie mov1= new Movie("Sholay", 1960, "Hindi", "Drama", "Bollywood", "01-01-1960", rd.nextBoolean());
        Movie mov2= new Movie("Lakshya", 2002, "Hindi", "War", "Bollywood", "02-04-2004", rd.nextBoolean());
        Movie mov3= new Movie("Shivaay", 2005, "Tamil", "Dramatic", "Tollywood","19-02-2005", rd.nextBoolean());
        Movie mov4= new Movie("Titanic", 1997, "English", "Romantic", "Hollywood","07-01-1997", rd.nextBoolean());
        Movie mov5= new Movie("Avengers", 2012, "English", "Thriller", "Hollywood","14-07-2012", rd.nextBoolean());
        Movie mov6= new Movie("Robot", 2008, "Telugu", "Action", "Tollywood", "12-12-2008", rd.nextBoolean());
        ArrayList<Movie> movies= new ArrayList<>();

        movies.add(mov1);
        movies.add(mov2);
        movies.add(mov3);
        movies.add(mov4);
        movies.add(mov5);
        movies.add(mov6);
        MovieApp movieApp= new MovieApp();
        movieApp.menu(movies);
    }
}
