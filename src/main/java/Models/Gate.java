package Models;

public class
Gate {

    Integer gateId;
    String gateSize;
    Boolean available;

    public Gate(Integer gateId, String gateSize, Boolean available) {
        this.gateId = gateId;
        this.gateSize = gateSize;
        this.available = available;
    }

    public Integer getGateId() {
        return gateId;
    }

    public void setGateId(Integer gateId) {
        this.gateId = gateId;
    }

    public String getGateSize() {
        return gateSize;
    }

    public void setGateSize(String gateSize) {
        this.gateSize = gateSize;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
