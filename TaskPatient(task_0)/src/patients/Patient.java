package patients;

public class Patient {
	
	private String surname;
	private String name;
	private String secondname;
	private String address;
	private String phone;
	private long medicalRecordNumber;
	private String diagnosis;
	
	
	
	public Patient(String surname, String name, String secondname,
			String address, String phone, long medicalRecordNumber,
			String diagnosis) {
		setSurname(surname);
		setName(name);
		setSecondname(secondname);
		setAddress(address);
		setPhone(phone);
		setMedicalRecordNumber(medicalRecordNumber);
		setDiagnosis(diagnosis);
	}
	
	public Patient() {
		this("unnamed", "unnamed", "unnamed", "undefined", "undefined", 0000000, "no diagnosis");
	}
		

	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSecondname() {
		return secondname;
	}



	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public long getMedicalRecordNumber() {
		return medicalRecordNumber;
	}



	public void setMedicalRecordNumber(long medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}



	public String getDiagnosis() {
		return diagnosis;
	}



	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	
	@Override
	public String toString() {
		return "Patient [surname=" + surname + ", name=" + name
				+ ", secondname=" + secondname + ", address=" + address
				+ ", phone=" + phone + ", medicalRecordNumber="
				+ medicalRecordNumber + ", diagnosis=" + diagnosis + "]";
	}
	
	
}

