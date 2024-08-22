package ch13.sec02.exam01;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<Car,String> car1 = new Product<>();
		car1.setKind(new Car());
		car1.setModel("그랜저");
		System.out.printf("%s가", car1.getModel());
		car1.getKind().run();
		

	}

}
