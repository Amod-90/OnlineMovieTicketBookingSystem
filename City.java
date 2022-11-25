package com.ticketBookingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class City {


    String cityId;
    String cityName;
    Map<City, List<Theatre>> cityThreatreMap;

    public Map<City, List<Theatre>> getCityThreatreMap() {
        return cityThreatreMap;
    }

    public void setCityThreatreMap(City city, Theatre theatre)
    {
        List<Theatre> theatres = cityThreatreMap.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        cityThreatreMap.put(city,theatres);
    }

    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


}
