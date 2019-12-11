package lambda.expressions;

import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {
		
		String message = "Hello";
		
		Thread t = new Thread(() -> print());
		t.start();
		
		Thread t2 = new Thread(MethodReference::print);
		t2.start();
		
		print2((m) -> System.out.println(m), message);
		
		print2(System.out::println, message);
		
		Consumer<String> c = (m) -> System.out.println(m);
		
		print2(c, message);
	}
	
	public static void print() {
		System.out.println("Hello");
	}
	
	public static void print2(Consumer<String> c, String message) {
		c.accept(message);
	}
	
}
