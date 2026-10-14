package aihms;
public class CityHospital extends Hospital {
    private final int totalBeds;
    public CityHospital(String name, String city, int totalBeds){super(name,city); this.totalBeds=totalBeds;}
    @Override public int getTotalBeds(){return totalBeds;}
}
