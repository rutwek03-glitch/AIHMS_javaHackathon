package aihms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public abstract class Hospital {
    private final String name, city;
    private final List<Department> departments = new ArrayList<>(); // Composition
    protected Hospital(String name, String city){this.name=name; this.city=city;}
    public String getName(){return name;} public String getCity(){return city;}
    public void addDepartment(String name){departments.add(new Department(name));}
    public List<String> getDepartmentNames(){
        List<String> names=new ArrayList<>();
        for(Department d:departments) names.add(d.name);
        return Collections.unmodifiableList(names);
    }
    public abstract int getTotalBeds();
    private static class Department { private final String name; private Department(String name){this.name=name;} }
    @Override public String toString(){return name+" ("+city+"), beds="+getTotalBeds()+", departments="+getDepartmentNames();}
}
