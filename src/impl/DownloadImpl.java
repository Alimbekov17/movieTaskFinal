package impl;

import service.Downloadable;
import store.Cast;
import store.Movies;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DownloadImpl implements Downloadable {
    @Override
    public void download(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int a = 0;
        String name;

        try (FileWriter fileWriter = new FileWriter("movie.txt")){
            System.out.println("Which movie would you like to download: ");
            while (a < 5) {
                a++;
                name = scanner.nextLine();
                for (Movies movie : movies) {
                    if (movie.getMovieName().toLowerCase().contains(name.toLowerCase())) {
                        System.out.println("\nMovie: " + movie.getMovieName());
                        fileWriter.write("Movie name  : " + movie.getMovieName());
                        fileWriter.write("\nCategory    : " +movie.getCategory());
                        fileWriter.write("\nGenre       : " + movie.getGenre());
                        fileWriter.write("\nRelease date: " + movie.getYear());
                        fileWriter.write("\nAbout       : " + movie.getDescription());
                        fileWriter.write("\nDirector    : " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorSurName() + "\n");
                        fileWriter.write("\n ~ Cast of " + movie.getMovieName() + " ~\n");
                        for (Cast cast : movie.getCast()) {
                            fileWriter.write(cast + "\n");
                        }
                        System.out.println("\nDownload Successful!");
                        counter++;
                    }
                }
                if (counter > 0){
                    break;
                } else {
                    System.out.println("Couldn't find a movie by name: " + name + "\nTry another name: ");
                }
            }
            if (a == 5){
                System.out.println("Try again later!");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("No such file!");
        }
    }
}
