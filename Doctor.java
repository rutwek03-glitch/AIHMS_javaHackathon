package aihms;
public class Doctor {
    private final int id; private final String name, specialty;
    public Doctor(int id,String name,String specialty){this.id=id;this.name=name;this.specialty=specialty;}
    public int getId(){return id;} public String getName(){return name;} public String getSpecialty(){return specialty;}
    @Override public String toString(){return "Dr. "+name+" ("+specialty+")";}
}
