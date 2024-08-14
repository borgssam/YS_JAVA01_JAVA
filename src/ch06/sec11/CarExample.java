package ch06.sec11;

import ch06.sec08.Calculator;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ch06.sec08.Car car08 = new ch06.sec08.Car();
		car08.color = "빨강";
		car08.printItem();
		
		ch06.sec09.Car car09 = new ch06.sec09.Car();
		car09.color = "RED";
		car09.printItem();
		
		Calculator cal = new Calculator();
		cal.powerOn();
	}

}