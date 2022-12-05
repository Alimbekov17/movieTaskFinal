import impl.DownloadImpl;
import impl.FindImpl;
import impl.SortImpl;
import store.Cast;
import store.Director;
import store.Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindImpl find = new FindImpl();
        SortImpl sort = new SortImpl();
        DownloadImpl download = new DownloadImpl();
        List<Movies> movies = new ArrayList<>();
        moviesStore(movies);

        String press;

        while (true){
            commands();
            System.out.print("Press: ");
            press = scanner.next();

            if (press.equals("12")){
                System.out.println("Goodbye!");
                break;
            }
            switch (press) {
                case "1" -> find.getAllMovies(movies).forEach(System.out::println);
                case "2" -> find.getMoviesByCategory(movies);
                case "3" -> find.getMoviesByGenre(movies);
                case "4" -> find.findMovieByName(movies);
                case "5" -> find.findMovieByActorName(movies);
                case "6" -> find.findMovieByDirector(movies);
                case "7" -> find.findMovieByYear(movies);
                case "8" -> sort.sortByMovieName(movies);
                case "9" -> sort.sortByYear(movies);
                case "10" -> sort.sortByDirector(movies);
                case "11" -> download.download(movies);
                default -> System.out.println("\nWrong Command\n");
            }
        }

    }









    static void commands(){
        System.out.println("""
                ============== * Commands * ==============
                
                Press  1 - Print Catalog
                Press  2 - Print movies by Categories
                Press  3 - Print movies by Genres
                Press  4 - Find a movie or Tv Show by full or part name
                Press  5 - Find a movie by actor's name
                Press  6 - Find a movie or Tv Show by director's name
                Press  7 - Find a movie or Tv Show by year
                Press  8 - Sort catalog by name
                Press  9 - Sort catalog by year
                Press 10 - Sort catalog by director
                Press 11 - To download a Movie
                
                Press 12 - To quit the program
                               
                ==========================================""");
    }

    static void moviesStore(List<Movies> movies){

        movies.add(new Movies("The Shawshank Redemption", "Movie", "Drama", 1995,
                "Two imprisoned men bond over a number of years, " +
                        "\n             finding solace and eventual redemption through acts of common decency.",
                new Director("Frank", "Darabont"),
                List.of(new Cast("Morgan", "Freeman", "Ellis"))));

        movies.add(new Movies("The Godfather", "Movie", "Drama/Crime", 1972,
                "The aging patriarch of an organized crime dynasty in postwar New York City " +
                        "\n             transfers control of his clandestine empire to his reluctant youngest son.",
                new Director("Francis", "Coppola"),
                List.of(new Cast("Marlon","Brando", "Don Vito Corleone"),
                        new Cast("Al","Pacino", "Michael Corleone"))));

        movies.add(new Movies("The Dark Knight", "Movie", "Action", 2008,
                "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must " +
                        "\n             accept one of the greatest psychological and physical tests of his ability " +
                        "to fight injustice.",
                new Director("Christopher", "Nolan"),
                List.of(new Cast("Christian","Bale", "Batman, Bruce Wayne"),
                        new Cast("Heath","Ledger", "Joker"))));

        movies.add(new Movies("Angry Men", "Movie", "Drama/Crime", 1957,
                "A dissenting juror in a murder trial slowly manages to convince the others " +
                        "\n             that the case is not as obviously clear as it seemed in court.",
                new Director("Sidney", "Lumet"),
                List.of(new Cast("Henry","Fonda", "Juror #8"))));

        movies.add(new Movies("The Lord Of The Rings: The Return Of The King", "Movie", "Fantasy",
                2003,
                "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his " +
                        "\n             gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                new Director("Peter", "Jackson"),
                List.of(new Cast("Elijah","Wood", "Frodo Baggins"),
                        new Cast("Ian","McKellen", "Gandalf"))));

        movies.add(new Movies("The Lord Of The Rings: The Fellowship Of The Rings", "Movie",
                "Fantasy", 2001,
                "A young hobbit, Frodo, who has found the One Ring that belongs to the Dark Lord Sauron, " +
                        "\n             begins his journey with eight companions to Mount Doom, the only place " +
                        "where it can be destroyed.",
                new Director("Peter", "Jackson"),
                List.of(new Cast("Elijah","Wood", "Frodo Baggins"),
                        new Cast("Ian","McKellen", "Gandalf"),
                        new Cast("Viggo","Mortensen", "Aragorn"))));

        movies.add(new Movies("Forrest Gump", "Movie", "Drama/Romance", 1994,
                "Forrest, a man with low IQ, recounts the early years of his life when he found himself " +
                        "\n             in the middle of key historical events. All he wants now is to be reunited with " +
                        "his childhood sweetheart, Jenny.",
                new Director("Robert", "Zemeckis"),
                List.of(new Cast("Tom","Hanks", "Forrest Gump"))));

        movies.add(new Movies("Inception", "Movie", "Action/Sci-fi", 2010,
                "Cobb steals information from his targets by entering their dreams. Saito offers to wipe " +
                        "\n             clean Cobb's criminal history as payment for performing an inception on his sick competitor's son.",
                new Director("Christopher", "Nolan"),
                List.of(new Cast("Leonardo","DiCaprio", "Cobb"),
                        new Cast("Cillian","Murphy", "Fischer"),
                        new Cast("Tom","Hardy", "Eames"))));

        movies.add(new Movies("Guardians of the Galaxy Vol. 1", "Movie", "Action/Sci-fi", 2014,
                "Peter escapes from the planet Morag with a valuable orb that Ronan the Accuser wants. " +
                        "\n             He eventually forms a group with unwilling heroes to stop Ronan.",
                new Director("James", "Gunn"),
                List.of(new Cast("Chris","Pratt", "Star-Lord"),
                        new Cast("Vin","Diesel", "Baby Groot"))));

        movies.add(new Movies("Daredevil", "Tv Series", "Action", 2015,
                "A blind lawyer by day, vigilante by night. Matt Murdock fights the crime of New York as Daredevil.",
                new Director("Mark", "Johnson"),
                List.of(new Cast("Charlie","Cox", "Matt Murdock"))));

        movies.add(new Movies("The Beatles: Get Back", "Tv Series", "Documentary", 2021,
                "The Beatles write and rehearse 14 new songs as they plan their first live show in more " +
                        "\n             than two years; includes their unforgettable rooftop concert at London's Savile Row.",
                new Director("Peter", "Jackson"),
                List.of(new Cast("The Beatles","", "Themselves"))));

        movies.add(new Movies("Moon Knight", "Tv Series", "Action fiction", 2022,
                "Steven Grant and mercenary Marc Spector investigate the mysteries of " +
                        "\n             the Egyptian gods from inside the same body.",
                new Director("Mohamed", "Diab"),
                List.of(new Cast("Oscar","Isaac", "Moon Knight"))));

        movies.add(new Movies("Money Heist", "Tv Series", "Thriller", 2017,
                "A criminal mastermind who goes by 'The Professor' has a plan to pull off the biggest " +
                        "\n             heist in recorded history - to print billions of euros in the Royal Mint of Spain. ",
                new Director("Alex", "Pina"),
                List.of(new Cast("Alvaro","Morte", "The Professor"),
                        new Cast("Ursula","Corbero", "Tokyo"))));

        movies.add(new Movies("The Queen's Gambit", "Tv Series", "Historical Drama", 2020,
                "Set during the Cold War era, orphaned chess prodigy Beth Harmon struggles with " +
                        "\n             addiction in a quest to become the greatest chess player in the world.",
                new Director("Scott", "Frank"),
                List.of(new Cast("Anya","Taylor-Joy", "Beth Harmon"))));

        movies.add(new Movies("The Big Bang Theory", "Tv Series", "Sitcom", 2007,
                "The lives of four socially awkward friends, Leonard, Sheldon, Howard and Raj, " +
                        "\n             take a wild turn when they meet the beautiful and free-spirited Penny.",
                new Director("Mark", "Cendrowski"),
                List.of(new Cast("Jim","Parsons", "Sheldon Cooper"),
                        new Cast("Kaley","Cuoco", "Penny"))));

    }
}