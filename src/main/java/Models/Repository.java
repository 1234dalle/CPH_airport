package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private Connection conn;

    public Repository() {
        this.conn = com.company.DatabaseConnectionManager.getDatabaseConnection();
    }

    ArrayList<com.company.Arrival> arrivalList = new ArrayList<>();


    public List<com.company.Arrival> readAll() {
        ArrayList<com.company.Arrival> allArrivals = new ArrayList<>();
        try {
            PreparedStatement readAllArrivals = conn.prepareStatement("SELECT snusId, name, brand, price, strength, country, img FROM snus");
            ResultSet rs = readAllArrivals.executeQuery();
            while (rs.next()) {
                com.company.Arrival tempArrival = new com.company.Arrival();
                tempArrival.setFlyId(rs.getInt(1));
                tempArrival.setFlyType(rs.getString(2));
                tempArrival.setOrigin(rs.getString(3));
                tempArrival.setAoD(rs.getString(4));
                tempArrival.setSTA(rs.getString(5));
                tempArrival.setDate(rs.getDate(6));
                tempArrival.setRouteNumber(rs.getString(7));


                arrivalList.add(tempArrival);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrivalList;


    }
}
