package com.inheritance;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.stName("Cat");
		cat.stLegs("4");
		cat.stColor("Black");
		System.out.println("Animal1 name       Legs       Color");
		System.out.println(cat.gtName()+"    "+cat.gtLegs()+"   "+cat.gtColor());
	
		System.out.println("\n\n\n");
		Dog dog = new Dog();
		dog.stName("Dog");
		dog.stLegs("4");
		dog.stColor("White");
		dog.setNonVeg(true);
		System.out.println("Animal2 name       Legs       Color  isNonVeg");
		System.out.println(dog.gtName()+"    "+dog.gtLegs()+"   "+dog.gtColor()+"  "+dog.isNonVeg());	
		
		Cow cow = new Cow();
		cow.stName("Cow");
		cow.stLegs("4");
		cow.stColor("White");
		cow.setVeg(true);
		
		System.out.println("Animal3 name       Legs       Color   isVeg");
		System.out.println(cow.gtName()+"    "+cow.gtLegs()+"   "+cow.gtColor()+"  "+cow.isVeg());	
		
	}

}
