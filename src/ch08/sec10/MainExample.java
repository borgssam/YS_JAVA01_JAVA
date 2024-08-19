package ch08.sec10;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//((Bus)vehicle).checkFare();
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		bus.run();
		
		
		//taxi 목적지를 정하다 
		//tank 대포쏜다.
		

	}

}
