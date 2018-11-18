package com.cast;

public class TestCast {

	public static void main(String args[]){
		
		//Upcasting
		/*Cat cat = new Cat();
		//cat.eat();
		//cat.meow();
		
		//Casting the object to Animal
		Animal animal = (Animal)cat;
		//animal.eat();

		Cat castedAnimal = (Cat)animal;
		castedAnimal.eat();
		castedAnimal.meow();
		*/
		
		//Down casting
		/*Animal animal = new Cat();
		animal.eat();
		Cat cat = (Cat)animal;
		cat.meow();
		*/
		
		//Class Cast Exception
		Animal animal = new Animal();
		animal.eat();
		Cat cat = (Cat)animal;
		cat.eat();
		
		//cat.meow();
		
		
		
	}
}
