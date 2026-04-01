package workshop;

class Parent {
 private int privateVar = 1;
 protected int protectedVar = 2;
 public int publicVar = 3;

 int getPrivateVar() {
     return privateVar;
 }
}

class Child extends Parent {

 void display() {

     System.out.println("Private Variable (by getter method): " + getPrivateVar());

     System.out.println("Protected Variable: " + protectedVar);

     System.out.println("Public Variable: " + publicVar);
 }
}

 class accessmodifier {
 public static void main(String[] args) {
     Child c = new Child();
     c.display();
 }
}
