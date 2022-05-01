package KitaSoft;


class Animal{
	public String Name;
	public int Age;
	
	public void ShowProfile() {
		System.out.println("名前は" + Name + "、" + Age + "歳です。");
	}
	
	public void Speak() {
		System.out.println(".......");
	}
}

class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
	
	public void Speak() {
		System.out.println("ニャー");
	}
}

class Dog5 extends Animal
{
    public void Run()
    {
        System.out.println( "トコトコ" );
    }
    
    public void Speak() {
    	System.out.println("わんわん");
    }
}

public class practice8_1 {
	public static void main(String[] args) {
		Animal[] MyPets = new Animal[4];
		MyPets[0] = new Cat();
		MyPets[1] = new Dog5();
		MyPets[2] = new Cat();
		MyPets[3] = new Dog5();
		
		for(Animal Pet : MyPets) {
			Pet.Speak();
		}
	}
}
