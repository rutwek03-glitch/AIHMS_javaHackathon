package aihms;
import java.util.Comparator;
public class PatientNameComparator implements Comparator<Patient> {
    @Override public int compare(Patient a, Patient b){return a.getName().compareToIgnoreCase(b.getName());}
}
