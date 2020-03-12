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
    ArrayList<Movie> showTypeMovie(String typeMovie){
        ArrayList<Movie> typeMovieList= new ArrayList<Movie>();
        switch(typeMovie){
            case "Bollywood":
                for(Movie mov: movieList){
                    if(mov.getMovieType().equals("Bollywood"))
                        typeMovieList.add(mov);
                }
                break;

            case "Tollywood":
                for(Movie mov: movieList){
                    if(mov.getMovieType().equals("Tollywood"))
                        typeMovieList.add(mov);
                }
                break;

            case "Hollywood":
                for(Movie mov: movieList){
                    if(mov.getMovieType().equals("Hollywood"))
                        typeMovieList.add(mov);
                }
                break;
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