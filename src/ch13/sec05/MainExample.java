package ch13.sec05;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.regCourseAll(new Applicant<Person>(new Person()));
		Course.regCourseStudent(new Applicant<HighStudent>(new HighStudent()));
		//Course.regCourseStudent(new Applicant<Worker>(new Worker()));

	}

}
