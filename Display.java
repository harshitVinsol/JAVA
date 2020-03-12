package movieApp;

import java.util.Random;
/*
This is the display class made for interaction with the User
 */
public class Display {
    /*
    This is the main method used for insertion of a hardcoded list of movies using addToList() method of MovieApp class
     */
    public static void main(String[] args){
        Random rd = new Random(); // creating Random object
        MovieApp movieApp= new MovieApp();
        movieApp.addToList(new Movie("Sholay", 1960, "Hindi", "Drama", MovieType.BOLLYWOOD, "01-01-1960", rd.nextBoolean()));
        movieApp.addToList(new Movie("Lakshya", 2002, "Hindi", "War", MovieType.BOLLYWOOD, "02-04-2004", rd.nextBoolean()));
        movieApp.addToList(new Movie("Shivaay", 2005, "Tamil", "Dramatic", MovieType.TOLLYWOOD,"19-02-2005", rd.nextBoolean()));
        movieApp.addToList(new Movie("Titanic", 1997, "English", "Romantic", MovieType.HOLLYWOOD,"07-01-1997", rd.nextBoolean()));
        movieApp.addToList(new Movie("Avengers", 2012, "English", "Thriller", MovieType.HOLLYWOOD,"14-07-2012", rd.nextBoolean()));
        movieApp.addToList(new Movie("Robot", 2008, "Telugu", "Action", MovieType.TOLLYWOOD, "12-12-2008", rd.nextBoolean()));
    }
}
