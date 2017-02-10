package Model;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by joseph on 2/4/17.
 */
@Singleton
@Local
public class Locations {
    private String city;
    private String street;
    private Map<String,String> cities;
    private Map<String,String> streets;
    private Map<String,Map<String,String>> locations=new HashMap<String, Map<String, String>>();
    private BigInteger latitudes;
    private BigInteger longituudes;

    //create popular cities and streets in the country
    @PostConstruct
    public void init(){
        cities=new HashMap<String, String>();
        cities.put("Nairobi","Nairobi");
        cities.put("Mombasa","Mombasa");
        cities.put("Eldoret","Eldoret");
        //holder for streets. Streets will be created dynamically per city
        Map<String,String> streetsMap=new HashMap<String, String>();
        streetsMap.put("Westlands","Westlands");
        streetsMap.put("Eastlands","Eastlands");
        //to do add more streets
        locations.put("Nairobi",streetsMap);

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public Map<String, String> getStreets() {
        return streets;
    }

    public void setStreets(Map<String, String> streets) {
        this.streets = streets;
    }

    public Map<String, Map<String, String>> getLocations() {
        return locations;
    }

    public BigInteger getLatitudes() {
        return latitudes;
    }

    public void setLatitudes(BigInteger latitudes) {
        this.latitudes = latitudes;
    }

    public BigInteger getLongituudes() {
        return longituudes;
    }

    public void setLongituudes(BigInteger longituudes) {
        this.longituudes = longituudes;
    }
}
