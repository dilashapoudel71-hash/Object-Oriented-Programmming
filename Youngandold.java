package week2workshop;
import java.util.*;

public class Youngandold {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age of first person: ");
	int a = sc.nextInt();
	System.out.println("Enter the age of second person: ");
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println("First person is older than second one");
	}
	else {
		System.out.println("Second person is older than first one");
	}
	
	sc.close();
}
}
