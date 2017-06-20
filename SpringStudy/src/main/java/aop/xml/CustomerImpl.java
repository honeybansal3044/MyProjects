package aop.xml;

public class CustomerImpl implements CustomerBo {

	@Override
	public void addCustomer() {
		System.out.println("I am inside CustomerImpl.");
	}

}
