package service;

import store.Movies;

import java.util.List;

public interface Downloadable {
    void download(List<Movies> movies);
}
