package lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ListSort {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Honey", "Bansal"),
				new Person("Ayaan", "Bansal"),
				new Person("Isha", "Goel")); 

		Collections.sort(list, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		//java7 implementation
		ListSort.print(list, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("H");
			}
		});
		
		//java8 implementation
		ListSort.print(list, p -> p.getFirstName().startsWith("A"));
		
		System.out.println("For each loop");
		list.forEach((p) -> System.out.println(p));
		
		list.forEach(System.out::println);
		
		System.out.println("For each loop stream");
		
		list.stream()
		.filter((p) -> p.getFirstName().startsWith("A"))
		.forEach((p) -> System.out.println(p));;

	}
	
	public static void print(List<Person> list, Condition condition) {
		for(Person p : list) {
			if(condition.test(p)) {
				System.out.println(p.toString());
			}
		}
	}

}

interface Condition {
	boolean test(Person p);
}
