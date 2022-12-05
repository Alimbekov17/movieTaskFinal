package service;

import store.Movies;

import java.util.List;

public interface Findable {
    List<Movies> getAllMovies(List<Movies>movies);
    void getMoviesByCategory(List<Movies>movies);

    void findMovieByName(List<Movies>movies);

    void findMovieByActorName(List<Movies>movies);

    void findMovieByYear(List<Movies>movies);

    void findMovieByDirector(List<Movies>movies);

    void getMoviesByGenre(List<Movies>movies);

}
