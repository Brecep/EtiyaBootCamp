package entities;

public class CreditFeature {
	private int creditFeatureId;
	private Credit credit;
	private Feature feature;

	public CreditFeature() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditFeature(int creditFeatureId, Credit credit, Feature feature) {
		super();
		this.creditFeatureId = creditFeatureId;
		this.credit = credit;
		this.feature = feature;
	}

	public int getCreditFeatureId() {
		return creditFeatureId;
	}

	public void setCreditFeatureId(int creditFeatureId) {
		this.creditFeatureId = creditFeatureId;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
