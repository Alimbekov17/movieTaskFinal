package impl;

import service.Sortable;
import store.Movies;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortImpl implements Sortable {

    public static Comparator<Movies> sortByNameAtoZ = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getMovieName().compareTo(o2.getMovieName());
        }
    };
    public static Comparator<Movies> sortByNameZtoA = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getMovieName().compareTo(o1.getMovieName());
        }
    };

    public static Comparator<Movies> sortByYearAscending = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movies> sortByYearDescending = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getYear()-o1.getYear();
        }
    };
    public static Comparator<Movies> sortByDirectorAtoZ = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getDirector().getDirectorName().compareTo(o2.getDirector().getDirectorName());
        }
    };
    public static Comparator<Movies> sortByDirectorZtoA = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getDirector().getDirectorName().compareTo(o1.getDirector().getDirectorName());
        }
    };

    @Override
    public void sortByMovieName(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        String press;
        while (true){
            System.out.println("Press 1 to sort A to Z\n" +
                    "Press 2 to sort Z to A");
            press = scanner.next();
            if (press.equals("1")) {
                movies.sort(SortImpl.sortByNameAtoZ);
                movies.forEach(System.out::println);
                break;
            } else if (press.equals("2")) {
                movies.sort(SortImpl.sortByNameZtoA);
                movies.forEach(System.out::println);
                break;
            } else {
                System.out.println("Wrong Command!");
            }
        }


    }

    @Override
    public void sortByYear(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        String press;
        while (true){
            System.out.println("Press 1 to sort by ascending\n" +
                    "Press 2 to sort by descending");
            press = scanner.next();
            if (press.equals("1")) {
                movies.sort(SortImpl.sortByYearAscending);
                for (Movies movie : movies) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                    System.out.println("\nYear    : " + movie.getYear() +
                            "\nName    : " + movie.getMovieName() +
                            "\nCategory: " + movie.getCategory() +
                            "\nGenre   : " + movie.getGenre() +
                            "\nAbout   : " + movie.getDescription() +
                            "\nDirector: " + movie.getDirector() + "\n" +
                            "\n ~ Cast of " + movie.getMovieName() + " ~\n");
                    movie.getCast().forEach(System.out::println);
                }
                break;
            } else if (press.equals("2")){
                movies.sort(SortImpl.sortByYearDescending);
                for (Movies movie : movies) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                    System.out.println("\nYear    : " + movie.getYear() +
                            "\nName    : " + movie.getMovieName() +
                            "\nCategory: " + movie.getCategory() +
                            "\nGenre   : " + movie.getGenre() +
                            "\nAbout   : " + movie.getDescription() +
                            "\nDirector: " + movie.getDirector() + "\n" +
                            "\n ~ Cast of " + movie.getMovieName() + " ~\n");
                    movie.getCast().forEach(System.out::println);
                }
                break;
            } else {
                System.out.println("Wrong Command!");
            }
        }


    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        String press;
        while (true){
            System.out.println("Press 1 to sort A to Z\n" +
                    "Press 2 to sort Z to A");
            press = scanner.next();
            if (press.equals("1")) {
                movies.sort(SortImpl.sortByDirectorAtoZ);
                for (Movies movie : movies) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                    System.out.println("\nDirector: " + movie.getDirector() +
                            "\nName    : " + movie.getMovieName() +
                            "\nCategory: " + movie.getCategory() +
                            "\nGenre   : " + movie.getGenre() +
                            "\nYear    : " + movie.getYear() +
                            "\nAbout   : " + movie.getDescription() + "\n"+
                            "\n ~ Cast of " + movie.getMovieName() + " ~\n");
                    movie.getCast().forEach(System.out::println);
                }
                break;
            } else if (press.equals("2")){
                movies.sort(SortImpl.sortByDirectorZtoA);
                for (Movies movie : movies) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                    System.out.println("\nDirector: " + movie.getDirector() +
                            "\nName    : " + movie.getMovieName() +
                            "\nCategory: " + movie.getCategory() +
                            "\nGenre   : " + movie.getGenre() +
                            "\nYear    : " + movie.getYear() +
                            "\nAbout   : " + movie.getDescription() + "\n" +
                            "\n ~ Cast of " + movie.getMovieName() + " ~\n");
                    movie.getCast().forEach(System.out::println);

                }
                break;
            } else {
                System.out.println("Wrong Command!");
            }
        }
    }
}
