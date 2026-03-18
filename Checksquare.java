package week2workshop;
import java.util.*;

public class Checksquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of rectangle: ");
	float l = sc.nextFloat();
	System.out.println("Enter breadth of rectangle: ");
	float b = sc.nextFloat();
	if (l==b) {
		System.out.println("It is square");
	}
	else {
		System.out.println("It is not a square");
	}
	sc.close();
}

}
