package entities;

import java.time.LocalDate;

public class Package {
	private int id;
	private String packageName;
	private LocalDate packageDueDate;
	private LocalDate packageStartedDate;
	private String packageDuration;

	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Package(int id, String packageName, LocalDate packageDueDate, LocalDate packageStartedDate,
			String packageDuration) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.packageDueDate = packageDueDate;
		this.packageStartedDate = packageStartedDate;
		this.packageDuration = packageDuration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public LocalDate getPackageDueDate() {
		return packageDueDate;
	}

	public void setPackageDueDate(LocalDate packageDueDate) {
		this.packageDueDate = packageDueDate;
	}

	public LocalDate getPackageStartedDate() {
		return packageStartedDate;
	}

	public void setPackageStartedDate(LocalDate packageStartedDate) {
		this.packageStartedDate = packageStartedDate;
	}

	public String getPackageDuration() {
		return packageDuration;
	}

	public void setPackageDuration(String packageDuration) {
		this.packageDuration = packageDuration;
	}

}
