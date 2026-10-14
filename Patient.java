package aihms;
public class Patient implements Comparable<Patient> {
    private final int id; private final String name; private final int age; private final String phone;
    public Patient(int id, String name, int age, String phone) throws InvalidPatientException {
        if (id <= 0) throw new InvalidPatientException("Patient ID must be positive.");
        if (!RegexValidator.isValidName(name)) throw new InvalidPatientException("Invalid patient name.");
        if (age < 0 || age > 120) throw new InvalidPatientException("Age must be between 0 and 120.");
        if (!RegexValidator.isValidPhone(phone)) throw new InvalidPatientException("Phone must contain 10 digits.");
        this.id=id; this.name=name.trim(); this.age=age; this.phone=phone;
    }
    public int getId(){return id;} public String getName(){return name;}
    public int getAge(){return age;} public String getPhone(){return phone;}
    @Override public int compareTo(Patient other){return Integer.compare(id, other.id);}
    public String toCsv(){return id+","+name.replace(",", " ")+","+age+","+phone;}
    @Override public String toString(){return "Patient{id="+id+", name='"+name+"', age="+age+", phone='"+phone+"'}";}
}
