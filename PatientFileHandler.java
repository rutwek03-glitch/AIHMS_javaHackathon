package aihms;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// Demo only: do not store real patient data in an unsecured CSV file.
public final class PatientFileHandler {
    private static final Path FILE=Paths.get("aihms_patients.csv");
    private PatientFileHandler(){}
    public static void save(List<Patient> patients)throws IOException{
        List<String> lines=new ArrayList<>(); lines.add("id,name,age,phone");
        for(Patient p:patients) lines.add(p.toCsv());
        Files.write(FILE,lines,StandardCharsets.UTF_8);
        System.out.println("Saved "+patients.size()+" patients to "+FILE.toAbsolutePath());
    }
    public static List<String> readAllLines()throws IOException{
        if(!Files.exists(FILE)){System.out.println("Patient file does not exist yet.");return new ArrayList<>();}
        return Files.readAllLines(FILE,StandardCharsets.UTF_8);
    }
}
