package ch13.sec05;

public class Course {
	//모두 등록가능
	public static void regCourseAll(Applicant<?> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이 (전체코스) 등록함");		
	}
	
	//학생만 등록가능
	public static void regCourseStudent(Applicant<? extends Student> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이 (학생)코스 등록함");		
	}
	
	//일반인 직장인만 가능
	public static void regCourseWorker(Applicant<? super Worker> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이 (일반인,직장인)코스 등록함");		
	}

}
