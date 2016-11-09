package com.honey.bansal.oct.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Simple {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		
		Student s1 = new Student(101, "Vijay", 23);
		Map<Student, Student> map = new HashMap<Student, Student>();
		
		map.put(s1, s1);

		System.out.println("Sorting by Name...");

		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
