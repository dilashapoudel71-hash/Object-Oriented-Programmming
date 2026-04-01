package workshop;

class Animal {
 String name;
 int age;

 Animal(String name, int age) {
     this.name = name;
     this.age = age;
     System.out.println("Animal constructor called here");
 }

 void displayAnimal() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

class Dog extends Animal {
 String breed;

 Dog(String name, int age, String breed) {
     super(name, age);  
     this.breed = breed;
     System.out.println("Dog constructor called");
 }

 void displayDog() {
     displayAnimal(); 
     System.out.println("Breed: " + breed);
 }
}

class Main {
 public static void main(String[] args) {
     Dog d1 = new Dog("Tom", 3, "Havanese");
     d1.displayDog();
 }
}
