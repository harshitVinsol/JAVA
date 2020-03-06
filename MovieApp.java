package movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MovieApp {
    void showMovie(ArrayList<Movie> mov){
        for (Movie movie : mov) {
            System.out.println(movie);
        }
    }
    void menu(ArrayList<Movie> mov){
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\n-------MOVIE APP--------\n1.Show the List of Movies\n2.Find a List of a certain type\n3.Check if a Movie is Blockbuster\n4.Exit\nEnter your choice:");
            option= scanner.nextInt();
            switch (option) {
                case 1:
                    showMovie(mov);
                    break;
                case 2:
                    typeMenu(mov);
                    break;
                case 3:
                    isBlockbuster(mov);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("*Enter a proper value (1-4 only)*");
            }
        }while(option!=4);
        //System.out.println(option);
    }
    void typeMenu(ArrayList<Movie> mov){
        Scanner scanner= new Scanner(System.in);
        int genreOption;
        do{
            System.out.print("\n======AVAIALBLE TYPES======\n1.Bollywood\n2.Tollwood\n3.Hollywood\n4.Go Back to Main Menu\nSelect a Movie Type: ");
            genreOption= scanner.nextInt();
            switch(genreOption){
                case 1:
                    showBollywoodMovies(mov);
                    break;
                case 2:
                    showTollywoodMovies(mov);
                    break;
                case 3:
                    showHollywoodMovies(mov);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("*Enter a proper value (1-6 only)*");
                    break;
            }
        }while(genreOption!=4);
    }
    void showBollywoodMovies(ArrayList<Movie> mov){
        ArrayList<Movie> movieList= new ArrayList<>();
        for(Movie movie:mov){
            if(movie.getMovieType().equals("Bollywood"))
                movieList.add(movie);
        }
        System.out.println("\n===BOLLYWOOD MOVIES===");
        for(Movie movie:movieList)
            System.out.println(movie);
    }
    void showTollywoodMovies(ArrayList<Movie> mov){
        ArrayList<Movie> movieList= new ArrayList<>();
        for(Movie movie:mov){
            if(movie.getMovieType().equals("Tollywood"))
                movieList.add(movie);
        }
        System.out.println("\n===TOLLYWOOD MOVIES===");
        for(Movie movie:movieList)
            System.out.println(movie);
    }
    void showHollywoodMovies(ArrayList<Movie> mov){
        ArrayList<Movie> movieList= new ArrayList<>();
        for(Movie movie:mov){
            if(movie.getMovieType().equals("Hollywood"))
                movieList.add(movie);
        }
        System.out.println("\n===HOLLYWOOD MOVIES===");
        for(Movie movie:movieList)
            System.out.println(movie);
    }
    void isBlockbuster(ArrayList<Movie> mov){
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\nEnter the name of the Movie: ");
        String movieName=scanner.nextLine();
        for(Movie movie:mov){
            if(movie.getMovieName().equals(movieName)){
                if(movie.getBlockBuster()){
                    System.out.println("\nMovie "+movieName+" is a Blockbuster movie!");
                    return;
                }
            }
        }
        System.out.println("\nMovie "+movieName+" is not a Blockbuster movie!");
    }
    public static void main(String[] args){
        Random rd = new Random(); // creating Random object

        Movie mov1= new Movie("Sholay", 1960, "Hindi", "Drama", "Bollywood", "01-01-1960", rd.nextBoolean());
        Movie mov2= new Movie("Lakshya", 2002, "Hindi", "War", "Bollywood", "02-04-2004", rd.nextBoolean());
        Movie mov3= new Movie("Shivaay", 2005, "Tamil", "Dramatic", "Tollywood","19-02-2005", rd.nextBoolean());
        Movie mov4= new Movie("Titanic", 1997, "English", "Romantic", "Hollywood","07-01-1997", rd.nextBoolean());
        Movie mov5= new Movie("Avengers", 2012, "English", "Thriller", "Hollywood","14-07-2012", rd.nextBoolean());

        ArrayList<Movie> movies= new ArrayList<>();

        movies.add(mov1);
        movies.add(mov2);
        movies.add(mov3);
        movies.add(mov4);
        movies.add(mov5);
        MovieApp movieApp= new MovieApp();
        movieApp.menu(movies);
    }
}
