package service;

import store.Movies;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movies> movies);
//-from A to Z
//-from Z to A

    void sortByYear(List<Movies> movies);
//-Ascending
//-Descending

    void sortByDirector(List<Movies>movies);
}
