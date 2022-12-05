package impl;

import service.Findable;
import store.Cast;
import store.Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindImpl implements Findable {
    @Override
    public List<Movies> getAllMovies(List<Movies> movies) {
        System.out.println("\n~~~~~~~~~~~ * All movies * ~~~~~~~~~~~~~");
        return movies;
    }

    @Override
    public void getMoviesByCategory(List<Movies> movies) {
        System.out.println("\n~~~~~~~~ * Category: Movies * ~~~~~~~~~~~~~");

        for (Movies movie : movies) {
            if (movie.getCategory().equals("Movie")){
                System.out.println(movie);
            }
        }
        System.out.println("\n~~~~~~~~ * Category: Tv Series * ~~~~~~~~~");

        for (Movies movie : movies) {
            if(movie.getCategory().equals("Tv Series")){
                System.out.println(movie);
            }
        }
    }
    @Override
    public void getMoviesByGenre(List<Movies> movies) {
        ArrayList<String> genres = new ArrayList<>();
        for (Movies movie : movies) {
            if (movie.getGenre().length()<=7 && !genres.contains(movie.getGenre())) {
                genres.add(movie.getGenre());
            }
        }
        for (String s : genres) {
            System.out.println("\n~~~~~~~~~~~ * Genre: " + s + " * ~~~~~~~~~~~~");
            for (Movies movie : movies) {
                if (movie.getGenre().contains(s)){
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMovieByName(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int a = 0;
        String name;
        System.out.print("Enter a name of the movie or Tv Show: ");

        while (a < 5) {
            a++;
            name = scanner.nextLine();
            for (Movies movie : movies) {
                if (movie.getMovieName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(movie);
                } else {
                    counter++;
                }
            }
            if (counter == movies.size()){
                System.out.println("Couldn't find a movie by name: " + name + "\nTry another name: ");
                counter = 0;
            } else {
                break;
            }

        }
        if (a == 5){
            System.out.println("Try again later!");
            System.out.println();
        }
    }

    @Override
    public void findMovieByActorName(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int a = 0;
        String name;
        System.out.print("Enter a name of actor: ");
        while (a < 5){
            a++;
            name = scanner.next();
            for (Movies movie : movies) {
                for (Cast cast : movie.getCast()) {
                    if (cast.getActorName().equalsIgnoreCase(name) || cast.getActorSurname().equalsIgnoreCase(name)){
                        System.out.println("\nActor: " + cast.getActorName() + " " + cast.getActorSurname());
                        System.out.println(movie);
                        counter++;
                    }
                }
            }
            if (counter > 0){
                break;
            } else {
                System.out.print("Couldn't find any actor by name: " + name + "\nTry another name: ");
            }
        }
        if (a == 5){
            System.out.println("Try again later!");
            System.out.println();
        }
    }
    @Override
    public void findMovieByDirector(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int a = 0;
        System.out.print("Enter a name of Director: ");
        String name;
        while (a < 5) {
            a++;
            name = scanner.next();
            System.out.println();
            for (Movies movie : movies) {
                if (movie.getDirector().getDirectorName().equalsIgnoreCase(name) || movie.getDirector().getDirectorSurName().equalsIgnoreCase(name)){
                    System.out.println("----------- Movies by " + movie.getDirector().getDirectorName()
                            + " " + movie.getDirector().getDirectorSurName() + " ------------");
                    System.out.println(movie);
                    counter++;
                }
            }
            if (counter > 0){
                break;
            } else {
                System.out.print("Couldn't find a director by name: " + name +
                        "\nTry another director: ");
            }
        }
        if (a == 5){
            System.out.println("  Try again later!\n");
        }
    }

    @Override
    public void findMovieByYear(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int a = 0;
        String year = null;
        System.out.print("Enter a year: ");
        while (a < 5){
            a++;
            try {
                year = scanner.next();
                if (year.matches("[a-zA-Z]")) {
                    throw new NumberFormatException();
                } else {
                    for (Movies movie : movies) {
                        if (movie.getYear() == Integer.parseInt(year)) {
                            System.out.println();
                            System.out.println(movie);
                            counter++;
                        }
                    }
                }
                if (counter > 0){
                    break;
                } else {
                    System.out.print("Couldn't find a movie by year: " + year + "\nTry another year: ");
                }
            } catch (NumberFormatException e){
                System.out.print("Year must be number!" +
                        "\nEnter a year: ");
            }

        }
        if (a == 5){
            System.out.println("   Try again later!\n");
        }
    }




}
