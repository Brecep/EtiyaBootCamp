package entities;

public class Modem extends Equipment {
	private String portNumber;
	private String modemType;

	public Modem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modem(int id, String brandName, String equimentName, String seriNo, Service service, String portNumber,
			String modemType) {
		super(id, brandName, equimentName, seriNo, service);
		this.portNumber = portNumber;
		this.modemType = portNumber;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getModemType() {
		return modemType;
	}

	public void setModemType(String modemType) {
		this.modemType = modemType;
	}

}
