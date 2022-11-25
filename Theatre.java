package com.ticketBookingApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Theatre {
    String theatreId;
    String theatreName;
    City city;
    List<Screen> screen;

    public List<Screen> getScreen() {
        return screen;
    }

    Map<Theatre, List<Screen>> theatreScreenMap;
    Map<Theatre, List<Shows>> theatreShowsMap;

    public Map<Theatre,List<Shows>> getTheatresByMovieCityDate(Movie movie, City city, LocalDateTime date)
    {
       Map<City,List<Theatre>> cityTheatreMap = city.getCityThreatreMap();
       List<Theatre> theatreList = cityTheatreMap.get(city);
       Map<Theatre,List<Shows>> runningTheatreShowsMap = null;
       List<Shows> runningShows = null;
       for(Theatre theatre : theatreList)
       {
         List<Shows> showsList =  theatre.getTheatreShowsMap().get(theatre);
         for(Shows shows: showsList)
         {
             if(shows.movie.getMovieId() == movie.getMovieId() && shows.startTime == date)
             {
              runningShows.add(shows);
             }
         }
         if(!runningShows.isEmpty())
             runningTheatreShowsMap.put(theatre,runningShows);
       }

        return runningTheatreShowsMap;
    }
    public String getTheatreId() {
        return theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public City getCity() {
        return city;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setTheatreScreenMap(Map<Theatre, List<Screen>> theatreScreenMap) {
        this.theatreScreenMap = theatreScreenMap;
    }

    public void setTheatreShowsMap(Map<Theatre, List<Shows>> theatreShowsMap) {
        this.theatreShowsMap = theatreShowsMap;
    }

    public Map<Theatre, List<Screen>> getTheatreScreenMap() {
        return theatreScreenMap;
    }

    public Map<Theatre, List<Shows>> getTheatreShowsMap() {
        return theatreShowsMap;
    }

    public void setScreen(List<Screen> screen)
    {
        this.screen = screen;
    }


}
