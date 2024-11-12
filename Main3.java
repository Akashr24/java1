package pkg1;
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

public class Main3 {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     myDog.sound(); 
     Animal myAnimal = new Animal();
     myAnimal.sound(); 
 }
}