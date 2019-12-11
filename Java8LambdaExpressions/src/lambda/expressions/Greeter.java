package lambda.expressions;

public class Greeter {

	public static void main(String[] args) {

		Greeting lambdaGreeting = () -> System.out.println("Hello World");
		lambdaGreeting.perform();

	}

}
