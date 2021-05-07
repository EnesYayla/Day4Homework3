package GameSimulation;

public class Gamer {
	private String firstName;
	private String lastName;
	private String tcKimlikNo;
	private String dateOfBirthYear;
	private String agnomen;

	public Gamer(String firstName, String lastName, String tcKimlikNo, String dateOfBirthYear, String agnomen) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcKimlikNo = tcKimlikNo;
		this.dateOfBirthYear = dateOfBirthYear;
		this.agnomen = agnomen;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(String dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public String getAgnomen() {
		return agnomen;
	}

	public void setAgnomen(String agnomen) {
		this.agnomen = agnomen;
	}

}
