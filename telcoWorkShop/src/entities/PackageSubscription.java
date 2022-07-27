package entities;

public class PackageSubscription {
	private int id;
	private Package packageId;
	private Subscription subcriptionId;// ?

	public PackageSubscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PackageSubscription(int id, Package packageId, Subscription subcriptionId) {
		super();
		this.id = id;
		this.packageId = packageId;
		this.subcriptionId = subcriptionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Package getPackageId() {
		return packageId;
	}

	public void setPackageId(Package packageId) {
		this.packageId = packageId;
	}

	public Subscription getSubcriptionId() {
		return subcriptionId;
	}

	public void setSubcriptionId(Subscription subcriptionId) {
		this.subcriptionId = subcriptionId;
	}
	
}
