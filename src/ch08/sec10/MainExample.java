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
		
		

	}

}
