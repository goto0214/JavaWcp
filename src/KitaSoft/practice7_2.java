package KitaSoft;

class Dog1{
	private String Name;
	private int Age;
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int ag){
		Age = ag;
	}
	
	public void ShowProfile() {
		System.out.println("名前は" + Name + "、" + Age + "歳です。");
	}
}

public class practice7_2 {
	public static void main(String[] args) { 
		Dog1 MyDog = new Dog1();
		
		MyDog.SetName("ぽち");
		MyDog.SetAge( 3 );
		MyDog.ShowProfile();
	}
}
