package Task2;

import java.util.Scanner;

public class Student_Grade_Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter No of Subjects");
		int ns = sc.nextInt();
		int total = 0;
		for (int i = 0; i < ns; i++) {
			System.out.println("Enter marks obtained in " + (i + 1) + ": ");
			int marks = sc.nextInt();
			total += marks;
		}
		sc.close();

		double averp = (double) total / ns;
		char Grade;
		if (averp >= 90) {
			Grade = 'O';
		} else if (averp >= 80) {
			Grade = 'A';
		} else if (averp >= 70) {
			Grade = 'B';
		} else if (averp > 60) {
			Grade = 'C';
		} else if (averp > 50) {
			Grade = 'D';
		} else if (averp > 40) {
			Grade = 'E';
		} else {
			Grade = 'F';
		}
		System.out.println("Total marks scored is " + total);
		System.out.println("Average percentage gained is " + averp + "%");
		System.out.println("Grade :" + Grade);
		// sc.close();
	}

}
