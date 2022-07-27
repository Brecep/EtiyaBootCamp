package entities;

import java.time.LocalDate;

public class Invoice {
	private int id;
	private LocalDate dateCreated;
	private LocalDate dueCreated;
	private Subscription subscription;
	private Payment paymentId; // faturaların odeme takibi

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(int id, LocalDate dateCreated, LocalDate dueCreated, Subscription subscription, Payment paymentId) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dueCreated = dueCreated;
		this.subscription = subscription;
		this.paymentId = paymentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDueCreated() {
		return dueCreated;
	}

	public void setDueCreated(LocalDate dueCreated) {
		this.dueCreated = dueCreated;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

}
