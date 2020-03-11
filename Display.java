package movieApp;

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
        Movie[] mov= new Movie[6]; //An array of type Movie for insertion
        MovieApp movieApp= new MovieApp();
        mov[0]= new Movie("Sholay", 1960, "Hindi", "Drama", "Bollywood", "01-01-1960", rd.nextBoolean());
        mov[1]= new Movie("Lakshya", 2002, "Hindi", "War", "Bollywood", "02-04-2004", rd.nextBoolean());
        mov[2]= new Movie("Shivaay", 2005, "Tamil", "Dramatic", "Tollywood","19-02-2005", rd.nextBoolean());
        mov[3]= new Movie("Titanic", 1997, "English", "Romantic", "Hollywood","07-01-1997", rd.nextBoolean());
        mov[4]= new Movie("Avengers", 2012, "English", "Thriller", "Hollywood","14-07-2012", rd.nextBoolean());
        mov[5]= new Movie("Robot", 2008, "Telugu", "Action", "Tollywood", "12-12-2008", rd.nextBoolean());
        /*
        Insertion of movie array using addToList() method
         */
        for(Movie movie:mov){
            movieApp.addToList(movie);
        }
        System.out.println(movieApp.showMovie()); //Displaying the list of Movies just for a check
    }
}
