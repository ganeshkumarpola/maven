package AAA;

class TestPolymorphism {
    public static void main(String[] args) {
        bbb.Animal myAnimal;

        myAnimal = new bbb.Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        myAnimal = new bbb.Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}