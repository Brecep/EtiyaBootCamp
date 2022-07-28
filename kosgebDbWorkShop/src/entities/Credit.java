package entities;

import java.time.LocalDate;

public class Credit {
	private int id;
	private String name;
	private LocalDate startedDate;
	private CreditFeature creditFeature;

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit(int id, String name, LocalDate startedDate,CreditFeature creditFeature) {
		super();
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;
		this.creditFeature=creditFeature;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public CreditFeature getCreditFeature() {
		return creditFeature;
	}

	public void setCreditFeature(CreditFeature creditFeature) {
		this.creditFeature = creditFeature;
	}

}
