package entities;

public class MicroBusiness {
	private int id;
	private Applicant applicant;
	private String title;

	public MicroBusiness() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MicroBusiness(int id, Applicant applicant, String title) {
		super();
		this.id = id;
		this.applicant = applicant;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
