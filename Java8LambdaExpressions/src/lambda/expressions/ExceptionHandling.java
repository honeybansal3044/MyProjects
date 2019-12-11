package lambda.expressions;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int [] values = {1,2,3,4,5};
		int key = 0;
		
		process(values, key, (v, k) -> System.out.println(v / k));
		
	}
	
	public static void process(int [] values, int key, BiConsumer<Integer, Integer> c) {
		for(int i : values) {
			c.accept(i, key);
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> c) {
		return (v, k) -> {
			try {
				c.accept(v, k);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}

}
