package Address;

public interface Address {
     String Country = null;
     String City = null;
     String Neighbourhood = null;
     String Street= null;
     String Building= null;

     void setCountry(String country);
     void setCity(String city);

     void setNeighbourhood(String neighbourhood);

     void setStreet(String street);

     void setBuilding(String building);

     String getCountry();

     String getCity();

     String getNeighbourhood();

     String getStreet();

     String getBuilding();
}
