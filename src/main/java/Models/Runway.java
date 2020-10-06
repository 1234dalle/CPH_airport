package Models;

public class Runway {

    String AoD;
    Boolean runwayAvailable;
    Boolean ventePositionAvailable;

    public Runway(String aoD, Boolean runwayAvailable, Boolean ventePositionAvailable) {
        AoD = aoD;
        this.runwayAvailable = runwayAvailable;
        this.ventePositionAvailable = ventePositionAvailable;
    }

    public String getAoD() {
        return AoD;
    }

    public void setAoD(String aoD) {
        AoD = aoD;
    }

    public Boolean getRunwayAvailable() {
        return runwayAvailable;
    }

    public void setRunwayAvailable(Boolean runwayAvailable) {
        this.runwayAvailable = runwayAvailable;
    }

    public Boolean getVentePositionAvailable() {
        return ventePositionAvailable;
    }

    public void setVentePositionAvailable(Boolean ventePositionAvailable) {
        this.ventePositionAvailable = ventePositionAvailable;
    }
}
