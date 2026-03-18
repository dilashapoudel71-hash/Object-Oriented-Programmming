package week2workshop;
import java.util.*;

public class Medicalcausechecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you have any medical cause? y/n : ");
	String choice = sc.next();
	if (choice.equals("y")) {
		System.out.println("You cannot sit in exam");
	}
	else {
		System.out.println("You can sit in exam");
	}
	sc.close();
}
}
