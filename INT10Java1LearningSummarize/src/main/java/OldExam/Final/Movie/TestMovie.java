package OldExam.Final.Movie;

public class TestMovie {
    public static void main(String[] args) {
        Movie a = new Movie("Ant-Man", 1.99, 3);
        Movie b = new Movie("Black Panther", 2.25, 2);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        MovieList ml = new MovieList(2);
        ml.addMovie("Doctor Strange", 1.92, 3);
        ml.addMovie("Iron Man", 2.1, 1);
        ml.resize(5);
        ml.addMovie("The Avengers", 2.33, 1);
        ml.getMovieAt(2);
        Movie m = ml.searchForMovieTitle("Doctor Strange");



    }
}
