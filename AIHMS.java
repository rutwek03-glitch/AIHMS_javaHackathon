package aihms;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class AIHMS {
    public static void main(String[] args){
        System.out.println("===== AIHMS: Intelligent Hospital Management System =====");
        int freeBeds=12;
        String bedStatus=freeBeds>0 ? "Beds available" : "No beds available"; // ternary
        System.out.println("\\nTernary operator: "+bedStatus);
        Hospital hospital=new CityHospital("Aurelia City Hospital","Hyderabad",420); // inheritance
        hospital.addDepartment("Cardiology"); hospital.addDepartment("General Medicine"); // composition
        System.out.println("\\nHospital: "+hospital);
        try{
            Patient p1=new Patient(101,"Rahul Sharma",21,"9876543210");
            Patient p2=new Patient(102,"Ananya Rao",24,"9123456780");
            List<Patient> patients=new ArrayList<>(); patients.add(p1); patients.add(p2);
            System.out.println("Regex email valid: "+RegexValidator.isValidEmail("patient@example.com"));
            try{new Patient(0,"Invalid Name",25,"123");}
            catch(InvalidPatientException ex){System.out.println("Caught validation exception: "+ex.getMessage());}
            Doctor doctor=new Doctor(501,"Priya","General Medicine");
            AppointmentService service=new AppointmentService(); // aggregation-style: holds externally created appointments
            service.add(new Appointment(9001,p1,doctor,LocalDate.now(),"Confirmed"));
            service.add(new Appointment(9002,p2,doctor,LocalDate.now().plusDays(1),"Pending"));
            AppointmentRule confirmed=a->a.getStatus().equalsIgnoreCase("Confirmed"); // lambda
            System.out.println("\\nLambda + functional interface: "+service.filter(confirmed));
            System.out.println("Predicate lambda (today): "+service.filterUsingPredicate(a->a.getDate().equals(LocalDate.now())));
            CollectionsModule.demonstrate(patients);
            try{
                PatientFileHandler.save(patients); // file handling
                System.out.println("File contents:");
                for(String line:PatientFileHandler.readAllLines()) System.out.println(line);
            }catch(IOException ex){System.err.println("File handling error: "+ex.getMessage());}
        }catch(InvalidPatientException ex){
            System.err.println("Could not create patient: "+ex.getMessage());
        }catch(RuntimeException ex){
            System.err.println("Unexpected application error: "+ex.getMessage());
        }
        System.out.println("\\nAIHMS demo completed.");
    }
}
