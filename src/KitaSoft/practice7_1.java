package KitaSoft;

class Dog{
	private String Name;
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void ShowProfile() {
		System.out.println("名前は" + Name + "です。");
	}
}

public class practice7_1 {
	public static void main(String[] args) {
		Dog MyDog = new Dog();
		
		MyDog.SetName("ぽち");
		MyDog.ShowProfile();
	}
}
