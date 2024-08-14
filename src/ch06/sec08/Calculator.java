package ch06.sec08;

public class Calculator {
	static int age=3;
	void setAge(int age) {
		this.age = age;
	}
	void printAge() {

		System.out.println(this.age);
	}
	public void powerOn() {
		System.out.println("계산기 전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}

	int plus(int x, int y) {
		return x+y;
	}

	double plus(double x, double y) {
		return x+y;
	}
	

	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	//가변길이 매개변수
	int sum(int ...nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		return result;			
	}
	

}
