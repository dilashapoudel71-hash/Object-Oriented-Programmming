package week2workshop;
import java.util.*;

public class Sumofevennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many even numbers you want to add: ");
        int num = sc.nextInt();

        int i = 1;
        int sumOfnum = 0;

        while (i <= num) {
            sumOfnum += (2 * i);  
            i++;
        }

        System.out.println("The sum of first " + num + " even numbers is " + sumOfnum);

        sc.close();
    }
}
