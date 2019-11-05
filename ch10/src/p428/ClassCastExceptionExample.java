package p428;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changDog(Animal animal) {
		//if(animal instanceof Dog) {
		Dog dog = (Dog) animal;  			//ClassException 발생가능
	    //}
	}
}



class Animal {}
class Dog extends Animal{}
class Cat extends Animal{} 
