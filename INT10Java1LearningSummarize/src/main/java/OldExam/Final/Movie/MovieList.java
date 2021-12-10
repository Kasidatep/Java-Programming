package OldExam.Final.Movie;

public class MovieList {
    private Movie[] movies;
    private int numberOf5Stories;
    private boolean ture;

    public MovieList(int size){
        size = (size <= 0) ? 10 : size;
        movies = new Movie[size];
    }

    public int getNumberOf5Stories() {
        return numberOf5Stories;
    }

    public boolean isAvailable(){
        if (numberOf5Stories < movies.length) {return ture;}
        else {return false;}
    }

    public boolean addMovie(String title, double hours, int grade){
        if (!isAvailable() || hours <= 0 || grade < 1 || grade > 5) return false;
        movies[numberOf5Stories] = new Movie(title,hours,grade);
        numberOf5Stories++;
        return ture;
    }

    public Movie getMovieAt(int slot){
        if (slot >= numberOf5Stories) return null;
        return movies[slot];
    }

    public boolean resize(int newSize){
        if (newSize <= movies.length) return false;
        Movie[] newMovies = new Movie[newSize];
        for (int i = 0 ; i < numberOf5Stories ; i++){
            newMovies[i] = movies[i];
        }
        movies = newMovies;
        return true;
    }

    public Movie searchForMovieTitle(String title){
        if (title == null) return null;
        for(int i = 0; i < movies.length; i++){
            if (title.equals(movies[i].getTitle())) return movies[i];
        }
        return null;
    }

}
