package Models;

import java.util.Date;

public class Departure extends Flight {

    String STD;

    String Destination;


    public Departure(int flyId, String flyType, String size, Date date, Character aoD, String routeNumber, String STD, String destination) {
        super(flyId, flyType, size, date, aoD, routeNumber);
        this.STD = STD;
        Destination = destination;
    }

    public String getSTD() {
        return STD;
    }

    public void setSTD(String STD) {
        this.STD = STD;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
}