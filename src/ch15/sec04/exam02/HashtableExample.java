package ch15.sec04.exam02;

import java.util.*;

import ch15.sec02.exam01.Board;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i<= 1000; i++) {
					map.put(String.valueOf(i),i);
//					if(i%3==0) {
//						map.remove(String.valueOf(i-1));
//					}
				}
			}			
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i<= 20000; i++) {
					map.put(String.valueOf(i),i);
//					if(i%3==0) {
//						map.remove(String.valueOf(i-1));
//					}
				}
			}			
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
			
		}
		
		int size = map.size();
		System.out.println("총수=>"+size);
		

		//전체보기
		System.out.println("전체 보기---------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
        }

	}

}
