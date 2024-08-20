package ch09.sec07exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		//car.run2();
		car.run3(
		new Tire() {
			@Override
			public void roll() {
				System.out.println("익명자식 타이어3 굴러갑니다.");	
			}
		}		
		);

	}

}
