package entities;

import java.util.List;

public class Service {
	private int id;
	private String serviceName;
	private List<Subscription> subscriptions;
	private List<Equipment> equipments;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(int id, String serviceName, List<Subscription> subscriptions, List<Equipment> equipments) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.subscriptions = subscriptions;
		this.equipments = equipments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

}
