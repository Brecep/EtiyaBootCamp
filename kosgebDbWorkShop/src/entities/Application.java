package entities;

import java.util.List;

public class Application {
	private int id;
	private List<Applicant> applicants;
	private Credit credit;

	public Application() {
		super();
	}

	public Application(int id, List<Applicant> applicants, Credit credit) {
		super();
		this.id = id;
		this.applicants = applicants;
		this.credit = credit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

}
