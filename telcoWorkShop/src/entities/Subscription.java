package entities;

import java.time.LocalDate;
import java.util.List;

public class Subscription {
	private int id;
	private LocalDate subscriptionCreatedDate;
	private LocalDate subscriptionDueDate;
	private Customer customerId;
	private Service serviceId;
	private List<Invoice> invoices;

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subscription(int id, LocalDate subscriptionCreatedDate, LocalDate subscriptionDueDate, Customer customerId,
			Service serviceId, List<Invoice> invoices) {
		super();
		this.id = id;
		this.subscriptionCreatedDate = subscriptionCreatedDate;
		this.subscriptionDueDate = subscriptionDueDate;
		this.customerId = customerId;
		this.serviceId = serviceId;
		this.invoices = invoices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getSubscriptionCreatedDate() {
		return subscriptionCreatedDate;
	}

	public void setSubscriptionCreatedDate(LocalDate subscriptionCreatedDate) {
		this.subscriptionCreatedDate = subscriptionCreatedDate;
	}

	public LocalDate getSubscriptionDueDate() {
		return subscriptionDueDate;
	}

	public void setSubscriptionDueDate(LocalDate subscriptionDueDate) {
		this.subscriptionDueDate = subscriptionDueDate;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Service getServiceId() {
		return serviceId;
	}

	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

}
