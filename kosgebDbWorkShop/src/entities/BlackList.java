package entities;

import java.util.List;

public class BlackList {
	private int id;
	private List<Applicant> applicants;

	public BlackList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlackList(int id, List<Applicant> applicants) {
		super();
		this.id = id;
		this.applicants = applicants;
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

	

}
