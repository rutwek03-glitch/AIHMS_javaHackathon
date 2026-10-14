# AIHMS Java Modules (CO4 + Additional Topics)

A console Java project inspired by the Intelligent Hospital Management System.

## Run
Requires JDK 8+ (JDK 11+ recommended). From this folder:
```bash
javac -d out src/aihms/*.java
java -cp out aihms.AIHMS
```
The program writes `aihms_patients.csv` in the current directory using fictional demo data only.

## Module map
- `AIHMS.java`: main program, ternary operator, exception handling and demo wiring.
- `CollectionsModule.java`: collection/list operations and `Collections` utility methods.
- `Patient.java`: patient model, validation, `Comparable`.
- `PatientNameComparator.java`: `Comparator` sorting by name.
- `AppointmentService.java`: functional interface, lambda expression, `Predicate`.
- `Hospital.java` + `CityHospital.java`: abstract class and inheritance.
- `Appointment.java` + `Doctor.java` + `Patient.java`: association.
- `Hospital.java`: composition through owned `Department` objects.
- `AppointmentService.java`: aggregation-style storage of externally created appointments.
- `PatientFileHandler.java`: file handling.
- `InvalidPatientException.java`: custom exception handling.
- `RegexValidator.java`: regular expressions for name, phone and email.

## Relationships
- Association: Appointment references Patient and Doctor.
- Composition: Hospital creates/owns its Department objects.
- Aggregation: AppointmentService stores Appointment objects created outside the service; appointments can exist independently.

## Collections methods shown
Examples include `addAll`, `size`, `isEmpty`, `contains`, `containsAll`, `sort`, `min`, `max`, `toArray`, `frequency`, `swap`, `reverse`, `rotate`, `replaceAll`, `shuffle`, `copy`, `disjoint`, `binarySearch`, `get`, `set`, `indexOf`, `lastIndexOf`, `subList`, `remove`, `removeAll`, `retainAll`, `iterator`, and `clear`.
The Java Collections Framework contains many more methods across `Map`, `Queue`, `Deque`, `Set`, concurrent collections and other types; this project demonstrates a useful set of common methods rather than literally every method in the framework.

Privacy note: CSV storage is only for classroom demonstration. Do not store real patient medical data in an unencrypted file.
