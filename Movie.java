package movieApp;
/*
This is the FoodStore enum used to distribute food according to type of Movie
 */
enum FoodStore{
    DOSA, DAL_MAKHNI, PEPPER_STEAK
}
/*
This is the CostOfProduction enum used to assign average cost of production according to the type of the Movie
 */
enum CostOfProduction{
    HIGH, MEDIUM, LOW
}
/*
This is the Movie class, Central class for the MovieApp Architecture. It has movieName, realeaseYear, language, genre, movieType, releaseDate,
blockbuster, food and costOfProduction as data members.
 */
public class Movie {
    private String movieName;
    private int releaseYear;
    private String language;
    private String genre;
    private String movieType;
    private String releaseDate;
    private boolean blockBuster;
    private FoodStore food;
    private CostOfProduction costOfProduction;
    /*
    @return blockbuster
    */
    public boolean getBlockBuster() {
        return blockBuster;
    }
    /*
    @return movieName
     */
    public String getMovieName() {
        return movieName;
    }
    /*
    @return movieType
     */
    public String getMovieType(){
        return movieType;
    }
    /*
    No args constructor for Movie class
     */
    Movie(){
    }
    /*
    Base Constructor used for insertion with movieName, releaseYear, language, genre, movieType, releaseDate, blockBuster as Arguments
     */
    Movie(String movieName, int releaseYear, String language, String genre, String movieType, String releaseDate, boolean blockBuster){
        this.movieName= movieName;
        this.releaseYear= releaseYear;
        this.language= language;
        this.genre= genre;
        this.movieType= movieType;
        this.releaseDate= releaseDate;
        this.blockBuster= blockBuster;
        switch(movieType){
            case "Bollywood":
                food= FoodStore.DAL_MAKHNI;
                costOfProduction= CostOfProduction.MEDIUM;
                break;
            case "Hollywood":
                food= FoodStore.PEPPER_STEAK;
                costOfProduction= CostOfProduction.HIGH;
                break;
            case "Tollywood":
                food= FoodStore.DOSA;
                costOfProduction= CostOfProduction.LOW;
                break;
        }
    }
    /*
    This is override of toString() to display an instance of Movie class
     */
    public String toString(){
        return ("\nMovie: "+movieName +"\nRelease Year: "+ releaseYear + "\nLanguage: "+ language+ "\nGenre: "+ genre
                + "\nMovie Type: "+movieType+ "\nRelease Date: "+ releaseDate+ "\nBlockbuster: "+ blockBuster+"\nFood: "
                +food.toString()+"\nCost of Production: "+costOfProduction.toString()+"\n");
    }
}
