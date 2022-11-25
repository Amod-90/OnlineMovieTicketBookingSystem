package com.ticketBookingApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TheatrePartners extends User{
    //All CRUD operations
    // 1. Create/Delete/Update Theatre
    // 2. Create/Delete/Update Screen
    // 3. Add/remove/modify Movies
    // 4. upload Inventory
    Theatre theatre;
    Screen screen;
    Shows shows;
    Seats seats;
//    Movie movie;
    City city;
    List<Shows> showsList;
    List<Movie> movieList = new ArrayList<>();
    Map<Theatre,List<Shows>> theatreShowsMap;
    public void createMovies()
    {

     Movie movie = new Movie();
      city = new City();

      city.setCityId("1");
      city.setCityName("BANGALORE");

      movie.setMovieId("1");
      movie.setMovieName("Drishyam");
      movie.setGenre(Genre.SUSPENSE);
      movie.setLanguage("ENGLISH");
      movie.setLanguage("HINDI");
      movie.setLanguage("TAMIL");
      movie.setLanguage("TELGU");
      movie.setCityMovieMap(city,movie);
        movieList.add(movie);

      Movie movie1 = new Movie();
        movie1.setMovieId("2");
        movie1.setMovieName("BahuBali");
        movie1.setGenre(Genre.ACTION);
        movie1.setLanguage("ENGLISH");
        movie1.setLanguage("HINDI");
        movie1.setLanguage("TAMIL");
        movie1.setLanguage("TELGU");
        movie1.setCityMovieMap(city,movie);
        movieList.add(movie1);

        Movie movie2 = new Movie();
        movie2.setMovieId("3");
        movie2.setMovieName("GOLMAL");
        movie2.setGenre(Genre.COMEDY);
        movie2.setLanguage("ENGLISH");
        movie2.setLanguage("HINDI");
        movie2.setLanguage("TAMIL");
        movie2.setLanguage("TELGU");
        movie2.setCityMovieMap(city,movie);
        movieList.add(movie2);
        movie.setMovieList(movieList);
    }

    public void createTheatres()
    {
      Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId("1");
        pvrTheatre.setTheatreName("PVR");
      city.setCityThreatreMap(city,pvrTheatre);
      pvrTheatre.setScreen(createScreens());
      showsList = createShows(pvrTheatre.getScreen().get(0),movieList.get(0),java.time.LocalDateTime.now());
      theatreShowsMap.put(pvrTheatre,showsList);
      pvrTheatre.setTheatreShowsMap(theatreShowsMap);

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId("2");
        inoxTheatre.setTheatreName("INOX");
        city.setCityThreatreMap(city,inoxTheatre);
        inoxTheatre.setScreen(createScreens());
        theatreShowsMap.put(inoxTheatre,showsList);
        inoxTheatre.setTheatreShowsMap(theatreShowsMap);

        Theatre cinepolisTheatre = new Theatre();
        cinepolisTheatre.setTheatreId("3");
        cinepolisTheatre.setTheatreName("CinePolis");
        city.setCityThreatreMap(city,cinepolisTheatre);
        cinepolisTheatre.setScreen(createScreens());
        theatreShowsMap.put(cinepolisTheatre,showsList);
        cinepolisTheatre.setTheatreShowsMap(theatreShowsMap);

        Theatre cineMaxTheatre = new Theatre();
        cineMaxTheatre.setTheatreId("4");
        cineMaxTheatre.setTheatreName("CineMax");
        city.setCityThreatreMap(city,cineMaxTheatre);
        cineMaxTheatre.setScreen(createScreens());
        theatreShowsMap.put(cineMaxTheatre,showsList);
        cineMaxTheatre.setTheatreShowsMap(theatreShowsMap);


    }

    public List<Screen> createScreens()
    {
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId("1");
        screen1.setScreenlength("10M");
        screen1.setTotalSeatCapacity(450);
        screen1.setSound("Dollwy");
        screen1.setDisplayType(DisplayType.TWO_D);
        screen1.setSeats(createSeats());

        screens.add(screen1);

        Screen screen2 = new Screen();
        screen2.setScreenId("2");
        screen2.setScreenlength("10M");
        screen2.setTotalSeatCapacity(500);
        screen2.setSound("Dollwy");
        screen2.setDisplayType(DisplayType.THREE_D);
        screen2.setSeats(createSeats());

        screens.add(screen2);

        return screens;
    }

    public List<Shows> createShows(Screen screen, Movie movie, LocalDateTime localDateTime)
    {
        List<Shows> showsList = new ArrayList<>();
       Shows morningShow = new Shows();
        morningShow.setShowsId("1");
        morningShow.setShowsType(ShowsType.MORNING);
        morningShow.setMovie(movie);
        morningShow.setScreen(screen);
        morningShow.setStartTime(localDateTime);
       //here we can add datetime + 3hrs
        morningShow.setEndTime(localDateTime);
        showsList.add(morningShow);

        Shows eveningShow = new Shows();
        eveningShow.setShowsId("1");
        eveningShow.setShowsType(ShowsType.MORNING);
        eveningShow.setMovie(movie);
        eveningShow.setScreen(screen);
        eveningShow.setStartTime(localDateTime);
        //here we can add datetime + 3hrs
        eveningShow.setEndTime(localDateTime);
        showsList.add(eveningShow);
        return showsList;
    }

    public List<Seats> createSeats()
    {
        List<Seats> seat = new ArrayList<>();
     // for VIP
        for(int i = 1; i<100;i++)
        {
            Seats seats = new Seats();
            seats.setSeatId("1");
            seats.setRow(1);
            seats.setPrice(500d);
            seats.setSeatType(SeatType.VIP);
            seats.setSeatStatus(SeatStatus.AVAILABLE);
            seat.add(seats);
        }

        // for VIP
        for(int i = 100; i<200;i++)
        {
            Seats seats = new Seats();
            seats.setSeatId("1");
            seats.setRow(1);
            seats.setPrice(500d);
            seats.setSeatType(SeatType.VIP);
            seats.setSeatStatus(SeatStatus.AVAILABLE);
            seat.add(seats);
        }
   return seat;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setShows(Shows shows) {
        this.shows = shows;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }
}
