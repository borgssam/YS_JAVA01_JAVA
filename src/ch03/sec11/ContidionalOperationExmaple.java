package ch03.sec11;

public class ContidionalOperationExmaple {

	public static void main(String[] args) {
		int score = 55;
		String grade = (score>60)? "합격": "불합격";
		System.out.printf("당신의 점수는 %d점이며, 최종 [%s]입니다.", score, grade);			
	}

}
