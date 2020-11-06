package assign;

public class PaymentDetails {
	private String paymentDetails;

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentDetails=" + paymentDetails + "]";
	}

	public PaymentDetails(String paymentDetails) {
		super();
		this.paymentDetails = paymentDetails;
	}

}
