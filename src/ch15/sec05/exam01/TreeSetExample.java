package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//좌우선순회
		for(Integer s : scores) {
			System.out.print(s + " ");
		}

		System.out.println("\n---------");
		System.out.println(scores.first());
		System.out.println(scores.last());
		
		//꺼꾸로 정렬
		NavigableSet<Integer> descScores = scores.descendingSet();
		System.out.println("\n---------");
		for(Integer s : descScores) {
			System.out.print(s + " ");
		}
		
		NavigableSet<Integer> rangeSet = scores.subSet(80, true, 95, false);
		System.out.println("\n-  80 <= A < 95  --------");
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		
		
		
		
		

	}

}
