package aop.xml;

public class CustomerAspect implements ICustomerAspect {

	@Override
	public void showCustomerDetails(ICustomerAspect iCustomerAspect) {
		System.out.println("I am inside CustomerAspect");
	}

}
