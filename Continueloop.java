package week2workshop;

public class Continueloop {
public static void main(String[] args) {
	int n = 10;
	while(n<20) {
		if(n==15) {
			n++;
			continue;
		}
	}
	System.out.println(n);
	n++;
}
}
