package movieApp;

import java.util.ArrayList;
import java.util.Scanner;
/*
This is MovieApp class used for interaction between Movie class and Display class
 */
public class MovieApp{
    /*
    method to show main menu
     */
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
                    isBlockBuster(mov);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("*Enter a proper value (1-4 only)*");
            }
        }while(option!=4);
    }
    /*
    method to show a list of all Movies
     */
    void showMovie(ArrayList<Movie> mov){
        for (Movie movie : mov) {
            System.out.println(movie);
        }
    }
    /*
    method to show type menu according to the type of the Movie
     */
    void typeMenu(ArrayList<Movie> mov){
        Scanner scanner= new Scanner(System.in);
        int typeOption;
        do{
            System.out.print("\n======AVAIALBLE TYPES======\n1.Bollywood\n2.Tollwood\n3.Hollywood\n4.Go Back to Main Menu\nSelect a Movie Type: ");
            typeOption= scanner.nextInt();
            switch(typeOption){
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
        }while(typeOption!=4);
    }
    /*
    Method to show a list of Bollywood type of Movies
     */
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
    /*
    Method to show a list of Tollywood type of Movies
     */
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
    /*
    Method to show a list of Hollywood type of Movies
     */
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
    /*
    Method to show whether the Movie is a blockbuster or not
     */
    public void isBlockBuster(ArrayList<movieApp.Movie> mov) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter the name of the Movie: ");
        String movieName=scanner.nextLine();
        for(movieApp.Movie movie:mov){
            if(movie.getMovieName().equals(movieName)){
                if(movie.getBlockBuster()){
                    System.out.println("\nMovie "+movieName+" is a Blockbuster movie!");
                    return;
                }
            }
        }
        System.out.println("\nMovie "+movieName+" is not a Blockbuster movie!");
    }
}