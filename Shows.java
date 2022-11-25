package com.ticketBookingApp;

import java.time.LocalDateTime;
import java.util.Date;

public class Shows {

    String showsId;
    ShowsType showsType;
    LocalDateTime startTime;
    LocalDateTime endTime;
    Movie movie;
    Screen screen;

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String getShowsId() {
        return showsId;
    }

    public ShowsType getShowsType() {
        return showsType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setShowsId(String showsId) {
        this.showsId = showsId;
    }

    public void setShowsType(ShowsType showsType) {
        this.showsType = showsType;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}

enum ShowsType{
    MORNING, AFTERNOON, EVENING;
}
