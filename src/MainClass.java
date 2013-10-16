import java.util.ArrayList;

import parrot.Parrot;
import Animal.Animal;


public class MainClass {

    
    public static void main(String[] args) {
	Animal cat = new Animal("cat", "grrey", 5, 4, true);
	Parrot parrot = new Parrot();
	parrot.setAge(12);
	parrot.setAngry(true);
	parrot.setColorOfAnimal("blue");
	parrot.setKindOfAnimal("wave parrot");
	parrot.setWeight(1);
	
	ArrayList<Animal> AnimalList = new ArrayList<Animal>();
	
	AnimalList.add(cat);
	AnimalList.add(parrot);
	AnimalList.add(new Animal("Dog", "red", 6, 7, false));
	
	for (Animal animal : AnimalList) {
	    System.out.println(animal.getKindOfAnimal());
	}
	
	
	System.out.println("\n ");
	
	cat.FinalMethod();
	
	parrot.Fly(3);
	System.out.println(cat.Eat(10));
	Animal.StatMethod();
    }

}
