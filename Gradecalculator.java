package week2workshop;
import java.util.*;

public class Gradecalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		float marks = sc.nextFloat();
		if (marks>=90) {
			System.out.println("You scored A+");
		}
		else if (marks>=80 && marks<90) {
			System.out.println("You scored A");
		}
		else if (marks>=70 && marks<80) {
			System.out.println("You scored A");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("You scored B+");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("You scored B");
		}
		else if (marks>=50 && marks<60) {
			System.out.println("You scored C");
		}
		else if (marks>=40 && marks<50) {
			System.out.println("You scored C");
		}
		else {
			System.out.println("You failed the exam");
		}
		sc.close();
	}

}
