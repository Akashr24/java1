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
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

class Main4 {
    public static void main(String[] args) {
        Animal animal = new Dog(); 
        Animal animal1 = new Cat();// Reference of Animal, but Dog object
        animal1.sound();
        animal.sound();
    }
}

