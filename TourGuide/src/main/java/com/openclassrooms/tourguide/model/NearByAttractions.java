package com.openclassrooms.tourguide.model;

import gpsUtil.location.Attraction;
import gpsUtil.location.Location;

public class NearByAttractions {

    private Attraction attraction;
    private Location userLocation;
    private double distance;
    private int userReward;

    public Attraction getAttraction() {
        return attraction;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getUserReward() {
        return userReward;
    }

    public void setUserReward(int userReward) {
        this.userReward = userReward;
    }


}
