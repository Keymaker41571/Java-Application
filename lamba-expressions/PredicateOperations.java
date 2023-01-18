class Pokemon {
	
	String name;
	String type;
	double weight;
	double height;
	int id;
	int age;
	
	public Pokemon(String name, String type, double weight, double height, int id, int age) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.id = id;
		this.age =age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Type: " + type +", Weight: " 
			+ weight + ", Height: " + height + ", Id: #" + id + ", Age: " + age;
	}
}

public class PredicateOperations {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon("Charzard", "Fire", 200, 175, 2345, 35);
		
		System.out.println("Charzard ---> " + pokemon.toString() + "\n");	
		
		Predicate<Pokemon> predicate = x -> (x.age > 30 && x.name == "Charzard");
		predicate = x -> (x.weight > 195 && x.height > 150);
		
		System.out.println("Is the pokemon's name Charzard? and is he over 30 years old? " 
				+predicate.test(pokemon) + "\n");
		
		System.out.println("Is the pokemons weight over 205pounds? and his height over 150 inches? "
				+ predicate.test(pokemon));
	
	}
}
