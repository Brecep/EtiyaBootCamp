package entities;

import java.time.LocalDate;

public class Payment {
	private int id;
	private Canal canalId; // hangi kanal ile odeme islemi yapilir
	private LocalDate paymentDate;
	private Invoice invoice;

	public Payment() {
		super();
	}

	public Payment(int id, Canal canalId, LocalDate paymentDate, Invoice invoice) {
		super();
		this.id = id;
		this.canalId = canalId;
		this.paymentDate = paymentDate;
		this.invoice = invoice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Canal getCanalId() {
		return canalId;
	}

	public void setCanalId(Canal canalId) {
		this.canalId = canalId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
