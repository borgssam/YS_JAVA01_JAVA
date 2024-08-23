package ch15.sec05.exam03;

import java.util.*;

public class CompableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("홍길동",35));
		treeSet.add(new Person("강감찬",30));
		treeSet.add(new Person("이순신",40));
		treeSet.add(new Person("을지문적",25));
		
		System.out.println(treeSet.size());
		
		for(Person person : treeSet) {
			System.out.println(person.age+" : "+person.name);
		}

	}

}
