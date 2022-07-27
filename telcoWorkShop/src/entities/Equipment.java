package entities;

public class Equipment {
	private int id;
	private String brandName;
	private String equimentName;
	private String seriNo;
	private Service service;

	public Equipment() {
		super();
	}

	public Equipment(int id, String brandName, String equimentName, String seriNo, Service service) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.equimentName = equimentName;
		this.seriNo = seriNo;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEquimentName() {
		return equimentName;
	}

	public void setEquimentName(String equimentName) {
		this.equimentName = equimentName;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
