package entities;

public class Cable extends Equipment {
	private double cableLenght;
	private String cableType;

	public Cable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cable(int id, String brandName, String equimentName, String seriNo, Service service, double cableLenght,
			String cableType) {
		super(id, brandName, equimentName, seriNo, service);
		this.cableLenght = cableLenght;
		this.cableType = cableType;
		// TODO Auto-generated constructor stub
	}

	public double getCableLenght() {
		return cableLenght;
	}

	public void setCableLenght(double cableLenght) {
		this.cableLenght = cableLenght;
	}

	public String getCableType() {
		return cableType;
	}

	public void setCableType(String cableType) {
		this.cableType = cableType;
	}

}
