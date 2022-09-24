package polymorphism;

class Animal {
	private String name;
	private String animalAction;
	
	public Animal(String name, String animalAction) {
		this.name = name;
		this.animalAction = animalAction;
	}
	
	public String getName() {
		return "Hey! just an animal here";
	}
	
	public String getAnimalAction() {
		return "Hey! Generic animal action here";
	}
}

class Dog extends Animal {
	public Dog (String name, String animalAction) {
		super(name, animalAction);
	}
	
	public String getName() {
		return "Woof Woof im Dog class that extends from animal class";
	}
	
	public String getAnimalAction() {
		return "Im an animal that can jump";
	}
}

class Fish extends Animal {
	public Fish (String name, String animalAction) {
		super(name, animalAction);
	}
	
	public String getName() {
		return "Glub Glub im Fish class that extends from animal class";
	}
	
	public String getAnimalAction() {
		return "Im an animal that can swim underwater";
	}
}


public class Polymorphism {
	
	public static void main(String[] args ) {
		
		Animal animal = new Animal("animal", "animal");
		Dog dog = new Dog("Sam" , "Woof" );
		Fish fish = new Fish("Gill", "Glub");
		
		System.out.println(animal.getName());
		System.out.println(animal.getAnimalAction());
		System.out.println();
		System.out.println(dog.getName());
		System.out.println(dog.getAnimalAction());
		System.out.println();
		System.out.println(fish.getName());
		System.out.println(fish.getAnimalAction());
	}
}
