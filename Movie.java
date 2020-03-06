package movie;

class Movie {
    private String movieName;
    private int releaseYear;
    private String language;
    private String genre;
    private String movieType;
    private String releaseDate;
    private boolean blockBuster;
    private String food;
    enum foodStore{
        DOSA, DAL_MAKHNI, PEPPER_STEAK
    }
    public boolean getBlockBuster() {
        return blockBuster;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getMovieType(){
        return movieType;
    }

    Movie(){
    }
    Movie(String movieName, int releaseYear, String language, String genre, String movieType, String releaseDate, boolean blockBuster){
        this.movieName= movieName;
        this.releaseYear= releaseYear;
        this.language= language;
        this.genre= genre;
        this.movieType= movieType;
        this.releaseDate= releaseDate;
        this.blockBuster= blockBuster;
        foodStore foodtype=null;
        switch(movieType){
            case "Bollywood":
                foodtype= foodStore.DAL_MAKHNI;
                break;
            case "Hollywood":
                foodtype= foodStore.PEPPER_STEAK;
                break;
            case "Tollywood":
                foodtype= foodStore.DOSA;
                break;
        }
        this.food=foodtype.toString();

    }
    public String toString(){
        return ("\nMovie: "+movieName +"\nRelease Year: "+ releaseYear + "\nLanguage: "+ language+ "\nGenre: "+ genre+ "\nMovie Type: "+movieType+ "\nRelease Date: "+ releaseDate+ "\nBlockbuster: "+ blockBuster+"\nFood: "+food+"\n");
    }
}