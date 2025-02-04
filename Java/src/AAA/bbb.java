package AAA;

public class bbb {

  static   class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

  static  class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    static  class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }
    
    public static void main(String[] args) {
    	
    	Animal ani=new Animal();
    	ani.makeSound();
    	 Dog dg =new Dog();
    	 dg.makeSound();
	}
}

// Move TestPolymorphism outside
 
