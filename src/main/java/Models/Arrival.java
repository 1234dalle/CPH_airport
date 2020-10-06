package Models;

import java.util.Date;

public class Arrival extends Flight {

    String STA;
    String Origin;

    public Arrival(int flyId, String flyType, String size, Date date, String hour, String aoD, String routeNumber, String STA, String origin) {
        super(flyId, flyType, size, date, hour, aoD, routeNumber);
        this.STA = STA;
        Origin = origin;
    }

    public Arrival(String STA, String origin) {
        this.STA = STA;
        Origin = origin;
    }

    public Arrival() {
        super();
    }

    public String getSTA() {
        return STA;
    }

    public void setSTA(String STA) {
        this.STA = STA;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}