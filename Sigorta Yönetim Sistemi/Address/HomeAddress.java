package Address;

import java.util.Scanner;

public class HomeAddress implements Address{
    private static String Country = null;
    private static String City = null;
    private static String Neighbourhood = null;
    private static String Street= null;
    private static String Building= null;

    @Override
    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public void setCity(String city) {
        City = city;
    }
    @Override
    public void setNeighbourhood(String neighbourhood) {
        Neighbourhood = neighbourhood;
    }
    @Override
    public void setStreet(String street) {
        Street = street;
    }
    @Override
    public void setBuilding(String building) {
        Building = building;
    }
    @Override
    public String getCountry() {
        return Country;
    }
    @Override
    public String getCity() {
        return City;
    }
    @Override
    public String getNeighbourhood() {
        return Neighbourhood;
    }
    @Override
    public String getStreet() {
        return Street;
    }
    @Override
    public String getBuilding() {
        return Building;
    }
}
