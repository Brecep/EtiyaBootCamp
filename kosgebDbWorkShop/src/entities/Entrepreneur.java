package entities;

public class Entrepreneur extends Applicant {
	private int entreprenurId;
	private String firstName;
	private String lastName;

	public Entrepreneur() {
		super();

	}

	public Entrepreneur(int id, String userName, String password, int applicantId, int entreprenurId, String firstName,
			String lastName) {
		super(id, userName, password, applicantId);
		this.entreprenurId = entreprenurId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEntreprenurId() {
		return entreprenurId;
	}

	public void setEntreprenurId(int entreprenurId) {
		this.entreprenurId = entreprenurId;
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

}
