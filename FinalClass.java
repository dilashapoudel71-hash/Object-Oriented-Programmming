package workshop;

final class FinalClass {
void display() {
	System.out.println("This is a final class");
}
}
class Child extends FinalClass {   // we cannot extend final class
}
class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child2 extends Parent {
    void show() {   //ERROR
        System.out.println("Trying to override");
    }
}