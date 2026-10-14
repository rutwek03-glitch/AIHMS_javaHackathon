package aihms;
import java.time.LocalDate;
// Association: appointment refers to independently existing Patient and Doctor objects.
public class Appointment {
    private final int id; private final Patient patient; private final Doctor doctor;
    private final LocalDate date; private final String status;
    public Appointment(int id,Patient patient,Doctor doctor,LocalDate date,String status){
        this.id=id;this.patient=patient;this.doctor=doctor;this.date=date;this.status=status;
    }
    public int getId(){return id;} public Patient getPatient(){return patient;}
    public Doctor getDoctor(){return doctor;} public LocalDate getDate(){return date;} public String getStatus(){return status;}
    @Override public String toString(){return "Appointment #"+id+" | "+patient.getName()+" -> "+doctor+" | "+date+" | "+status;}
}
