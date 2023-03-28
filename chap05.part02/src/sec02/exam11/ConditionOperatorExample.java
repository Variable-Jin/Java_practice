package sec02.exam11;

import java.util.Scanner;

public class ConditionOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("점수 입력:");
		int score = scanner.nextInt();
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		

	}

}
