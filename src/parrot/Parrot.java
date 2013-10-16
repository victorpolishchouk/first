package parrot ;

import Animal.Animal;

public class Parrot extends Animal{
    public void Fly(int miles){
	    setAngry(true);
	    setWeight(getWeight() - miles);
	    System.out.println(getKindOfAnimal() + " flyed " + miles + " miles ");
	}
}
