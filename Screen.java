package com.ticketBookingApp;

import java.util.List;
import java.util.Map;

public class Screen {
    String screenId;
    String screenlength;
    String sound;
    DisplayType displayType;
    int totalSeatCapacity;
    List<Seats> seats;
    Map<Screen, List<Shows>> screenShowsMap;

    public String getScreenId() {
        return screenId;
    }

    public String getScreenlength() {
        return screenlength;
    }

    public String getSound() {
        return sound;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public int getTotalSeatCapacity() {
        return totalSeatCapacity;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public Map<Screen, List<Shows>> getScreenShowsMap() {
        return screenShowsMap;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public void setScreenlength(String screenlength) {
        this.screenlength = screenlength;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public void setTotalSeatCapacity(int totalSeatCapacity) {
        this.totalSeatCapacity = totalSeatCapacity;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

    public void setScreenShowsMap(Map<Screen, List<Shows>> screenShowsMap) {
        this.screenShowsMap = screenShowsMap;
    }
}

enum DisplayType{
    TWO_D, THREE_D, FOUR_D;
}
