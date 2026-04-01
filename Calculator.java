package workshop;

public class Calculator {
int add(int a,int b) {
	return a+b;
}

int add(int a, int b, int c) {
    return a + b + c;
}

double add(double a, double b) {
    return a + b;
}

double add(double a, double b, double c) {
    return a + b + c;
}
}
class calculatesum{
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum of two integers: " + calc.add(5, 8));

        System.out.println("Sum of three integers: " + calc.add(10, 15, 20));
        System.out.println("Sum of two doubles: " + calc.add(3.5, 2.7));

        System.out.println("Sum of three doubles: " + calc.add(1.1, 2.2, 3.3));
   
	}
}
