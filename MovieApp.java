package movieApp;

import java.util.ArrayList;
/*
This is MovieApp class used for interaction between Movie class and Display class
 */
public class MovieApp{
    /*
    An ArrayList to store the list of Movies
     */
    private ArrayList<Movie> movieList= new ArrayList<>();
    /*
    A public method addToList() to add Movies
     */
    public void addToList(Movie mov){
        movieList.add(mov);
    }
    /*
    method to return a list of all Movies
     */
    ArrayList<Movie> showMovie(){
       return movieList;
    }
    /*
    method to return a list of type of movie selected from Bollywood, Hollywood and Tollywood
     */
    ArrayList<Movie> showTypeMovie(MovieType typeMovie){
        ArrayList<Movie> typeMovieList= new ArrayList<>();
        for(Movie mov:movieList){
            if(mov.getMovieType().equals(typeMovie))
                typeMovieList.add(mov);
        }
        return typeMovieList;
    }
    /*
    Method to return whether the Movie is a blockbuster or not
     */
    public boolean isBlockBuster(String movieName) {
        boolean finalBlockBuster= false;
        for(Movie movie:movieList){
            if(movie.getMovieName().equals(movieName)){
                if(movie.getBlockBuster()){
                    finalBlockBuster= true;
                }
            }
        }
        return finalBlockBuster;
    }
}