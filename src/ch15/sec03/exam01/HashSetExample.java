package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");  //중복불가
		set.add("Spring");
		
		System.out.println("총 객체수: "+ set.size());


	}

}
