package InterfaceConcept;

interface Payment
{
	abstract void payByRupees();
	abstract void payByDollars();	
}

 class CreditCardPayment implements Payment {
    @Override
    public void payByRupees() {
        // Implement the logic for making a payment in Rupees using a credit card
        System.out.println("Payment made in Rupees using a credit card");
    }

    @Override
    public void payByDollars() {
        // Implement the logic for making a payment in Dollars using a credit card
        System.out.println("Payment made in Dollars using a credit card");
    }
}

public class MyClass {

	public static void main(String[] args) {
		
	 Payment p=  (Payment)new CreditCardPayment();
     
       p.payByRupees();
       p.payByDollars();
	}

}
