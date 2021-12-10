package OldExam.Final.Movie;

public class Movie {
    String title;
    double hours;
    int grade;

    Movie(String title, double hours, int grade){
        this.title = (title == null) ? "No Title" : title;
        this.hours = (hours <= 0.0) ? 2.0 : hours;
        this.grade = (grade < 1 || grade > 5) ? 3 : grade;
    }

    public String getTitle() {
        return title;
    }

    public double getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " (" + hours +" hours, grade:" + grade ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.hours, hours) == 0 && grade == movie.grade && title.equals(movie.title);
    }

    public int compareTo(Movie m){
        if (m == null) return 1;
        return m.grade - this.grade;
    }

}
