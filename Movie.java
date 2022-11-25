package com.ticketBookingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Movie {

    String movieName;
    List<String> language;
    Genre genre;
    Map<Movie, List<Shows>> movieShowsMap;
    Map<City,List<Movie>> cityMovieMap;

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    List<Movie> movieList;

    public void setCityMovieMap(City city,Movie movie) {
        List<Movie> movies = cityMovieMap.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        cityMovieMap.put(city,movies);
    }

    public String getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<String> getLanguage() {
        return language;
    }

    public Genre getGenre() {
        return genre;
    }

    public Map<Movie, List<Shows>> getMovieShowsMap() {
        return movieShowsMap;
    }

    String movieId;

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setLanguage(String language) {
        this.language.add(language);
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setMovieShowsMap(Map<Movie, List<Shows>> movieShowsMap) {
        this.movieShowsMap = movieShowsMap;
    }

    public Movie getMovieByName(String movieName)
    {
       return (Movie) movieList.stream().filter(movie -> movie.equals(movieName));
    }


}

enum Genre{
    ROMANCE, SUSPENSE, THRILLER, HORROR,ACTION, COMEDY, DRAMA, DOCUMENTARY, SCIENCE_FICTION;
}
