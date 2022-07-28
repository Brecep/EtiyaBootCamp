package entities;

public class Applicant extends User {
	private int applicantId;

	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Applicant(int id, String userName, String password, int applicantId) {
		super(id, userName, password);
		this.applicantId = applicantId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

}
