package Animal;

import interfacePackage.SomeInterface;

public /*abstract*/ class Animal implements SomeInterface {
    	private String kindOfAnimal;
    	private String colorOfAnimal;
    	private int age;
    	private int weight;
    	private boolean isAngry;
    	

    	public String getKindOfAnimal() {
	    return kindOfAnimal;
	}
	public void setKindOfAnimal(String kindOfAnimal) {
	    this.kindOfAnimal = kindOfAnimal;
	}
	public String getColorOfAnimal() {
	    return colorOfAnimal;
	}
	public void setColorOfAnimal(String colorOfAnimal) {
	    this.colorOfAnimal = colorOfAnimal;
	}
	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}
	public int getWeight() {
	    return weight;
	}
	public void setWeight(int weight) {
	    this.weight = weight;
	}

	public boolean isAngry() {
	    return isAngry;
	}

	public void setAngry(boolean isAngry) {
	    this.isAngry = isAngry;
	}

	//constructor
	public Animal(String kindOfAnimal, String colorOfAnimal, int age, int weight, boolean isAngry) {
	    this.kindOfAnimal = kindOfAnimal;
	    this.colorOfAnimal = colorOfAnimal;
	    this.age = age;
	    this.weight = weight;
	    this.isAngry = isAngry;
	}
	//defoult constructor
	public Animal(){
	}
	
	public String Eat(int amountOffood){
	    weight += amountOffood;
	    isAngry = false;
	    return kindOfAnimal + " ate " + amountOffood + " amount Of food" ;  
	}
	void Run(int miles){
	    isAngry = true;
	    weight -= miles;
	    System.out.println(kindOfAnimal + "ran" + miles + "miles");
	}
	public int ageInDays(){
	    return age * 365;
	}
	public static void StatMethod(){
	    System.out.println("This is static method.");
	}
	public final void FinalMethod(){
	    System.out.println("This is final method.");
	}
	@Override
	public void SomeMethod() {
	    System.out.println("interface implemented");	    
	}
    }


