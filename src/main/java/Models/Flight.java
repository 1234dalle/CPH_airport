package Models;

import java.util.Date;

public class Flight {

    int flyId;
    String flyType;
    String size;
    Date date;
    String hour;
    String AoD;
    String RouteNumber;

    public Flight(int flyId, String flyType, String size, Date date, String hour, String aoD, String routeNumber) {
        this.flyId = flyId;
        this.flyType = flyType;
        this.size = size;
        this.date = date;
        this.hour = hour;
        AoD = aoD;
        RouteNumber = routeNumber;
    }

    public Flight() {

    }

    public Flight(int flyId, String flyType, String size, Date date, Character aoD, String routeNumber) {
    }

    public int getFlyId() {
        return flyId;
    }

    public void setFlyId(int flyId) {
        this.flyId = flyId;
    }

    public String getFlyType() {
        return flyType;
    }

    public void setFlyType(String flyType) {
        this.flyType = flyType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAoD() {
        return AoD;
    }

    public void setAoD(String aoD) {
        AoD = aoD;
    }

    public String getRouteNumber() {
        return RouteNumber;
    }

    public void setRouteNumber(String routeNumber) {
        RouteNumber = routeNumber;
    }
}
