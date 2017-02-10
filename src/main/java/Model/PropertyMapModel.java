package Model;

/**
 * Created by joseph on 2/4/17.
 */

import javax.ejb.Local;
import javax.ejb.Singleton;
import java.math.BigInteger;

/**
 * This model creates of all available properties and their markers to be used in GMap
 * **/
@Singleton
@Local
public class PropertyMapModel {
    private String street;
    private BigInteger longitude;
    private BigInteger latitude;
    private int availableUnits;

    public void createMapModel(String street, BigInteger longitude, BigInteger latitude, int availableUnits) {
        this.street = street;
        this.longitude = longitude;
        this.latitude = latitude;
        this.availableUnits = availableUnits;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public void setLongitude(BigInteger longitude) {
        this.longitude = longitude;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }
}
