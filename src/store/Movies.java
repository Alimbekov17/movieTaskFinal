package store;

import java.util.List;

public class Movies  {
    private String movieName;
    private String category;
    private String genre;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movies(String movieName, String category, String genre, int year, String description, Director director, List<Cast> cast) {
        this.movieName = movieName;
        this.category = category;
        this.genre = genre;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public Movies() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        String a = "";
        System.out.println("\nName    : " + movieName +
                "\nCategory: " + category +
                "\nGenre   : " + genre +
                "\nYear    : " + year +
                "\nAbout   : " + description +
                "\nDirector: " + director
                );
        System.out.println(
                "\n ~ Cast of " + movieName + " ~\n");
        cast.forEach(System.out::println);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return a;
    }

}
