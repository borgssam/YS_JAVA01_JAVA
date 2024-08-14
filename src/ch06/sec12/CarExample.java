package ch06.sec12;

import ch06.sec12.hankook.SnowTier;
import ch06.sec12.kumho.AllSeasonTier;

public class CarExample {

	public static void main(String[] args) {
		// 1  2
		// 
		// 3  4
		// 1:한국 스노우, 2:한국 일반, 3:금호 전천후, 4: 금호 일반
		SnowTier t1 = new SnowTier();
		ch06.sec12.hankook.Tire t2 = new ch06.sec12.hankook.Tire();
		AllSeasonTier t3 = new AllSeasonTier();
		ch06.sec12.kumho.Tire t4 = new ch06.sec12.kumho.Tire();
		System.out.println("1: "+t1.color);
		System.out.println("2: "+t2.color);
		System.out.println("3: "+t3.color);
		System.out.println("4: "+t4.color);

	}

}
