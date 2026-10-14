package aihms;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@FunctionalInterface
interface AppointmentRule { boolean test(Appointment appointment); }
public class AppointmentService {
    private final List<Appointment> appointments=new ArrayList<>();
    public void add(Appointment a){appointments.add(a);}
    public List<Appointment> filter(AppointmentRule rule){
        List<Appointment> result=new ArrayList<>();
        for(Appointment a:appointments) if(rule.test(a)) result.add(a);
        return result;
    }
    public List<Appointment> filterUsingPredicate(Predicate<Appointment> rule){
        List<Appointment> result=new ArrayList<>();
        for(Appointment a:appointments) if(rule.test(a)) result.add(a);
        return result;
    }
    public List<Appointment> getAll(){return new ArrayList<>(appointments);}
}
