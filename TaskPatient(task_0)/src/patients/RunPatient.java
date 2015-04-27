package patients;

public class RunPatient {

	public static void main(String[] args) {
		
		Patient []patientMass = {
				new Patient("Ivanov", "Igor", "Ivanovich", "City of Kharkiv, Symskaya str. h.123", "+380501234561", 1000001, "flu"),
				new Patient("Petron", "Pavel", "Petrovich", "City of Kharkiv, Kolomenskaya str. h.1", "+380964314422", 1000002, "allergy"),
				new Patient("Ignatv", "Andrey", "Pavlovich", "City of Kharkiv, Danilevskogo str. h.56", "+38050342222", 1000003, "measles"),
				new Patient("Fedorov", "Ivvan", "Fedorovich", "City of Kharkiv, Shevchenko str. h.106", "+380936092213", 1000004, "flu"),
				new Patient("Filaton", "Anton", "Evgenievich", "City of Kharkiv, Kolomenskaya str. h.9", "+380577050433", 1000005, "bronchitis"),
				new Patient("Shvidkiy", "Evgeniy", "Ruslanovich", "City of Kharkiv, Petrovskogo str. h.121", "+380997711221", 1000006, "flu"),
				new Patient("Sidorov", "Ryslan", "Fedorovich", "City of Kharkiv, Naychnaz str. h.124", "+38067864533", 1000007, "fracture"),
				new Patient("Danilon", "Petr", "Ivanovich", "City of Kharkiv, Tobolskogo str. h.9", "+380984410943", 1000008, "lichen"),
				new Patient("Sergienko", "Oleg", "Evgenievich", "City of Kharkiv, Symskaya str. h.57", "+380504444777", 1000009, "allergy"),
				new Patient("Semenov", "Egor", "Petrovich", "City of Kharkiv, Shevchenko str. h.32", "+380912022045", 1000010, "bronchitis"),
				
		};
		
		haveDiagnosis(patientMass, "flu");		
		medicalDiapason(patientMass, 1000002, 1000008);
	}

				public static void haveDiagnosis(Patient[] patientMass, String chDiagnosis) {
					System.out.println("-------------Patients diagnosed with: "+chDiagnosis+"-------------------");
				for (Patient patient : patientMass) {
					if (patient.getDiagnosis().equals(chDiagnosis))
					System.out.println(patient.toString());
					}
				
				}
				public static void medicalDiapason(Patient[] patientMass, int start, int finish){
					System.out.println("------------Medical record numbers in the range from "+start + " to " +finish+"------------------");
					for (Patient patient : patientMass) {
						if (patient.getMedicalRecordNumber()>=start && patient.getMedicalRecordNumber()<=finish)
						System.out.println(patient.toString());
					}
					System.out.println("--------------------Medical record numbers out of range---------------------");
					for (Patient patient : patientMass) {
						if (!(patient.getMedicalRecordNumber()>=start && patient.getMedicalRecordNumber()<=finish))
						System.out.println(patient.toString());
					}
				}
}

