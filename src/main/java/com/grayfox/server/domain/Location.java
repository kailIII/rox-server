package com.grayfox.server.domain;

import java.io.Serializable;

public class Location implements Serializable {

    private static final long serialVersionUID = 665032830432086830L;

    private final double latitude;
    private final double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Location other = (Location) obj;
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude)) return false;
        if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude)) return false;
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Location [latitude=").append(latitude).append(", longitude=").append(longitude).append("]").toString();
    }
}