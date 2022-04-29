package KitaSoft;
class Dog2{
	private String Name;
	private int Age;
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int ag) {
		Age = ag;
	}
	
	public void ShowProfile() {
		System.out.println("名前は"+ Name + "、" + Age + "歳です。");
	}
}
public class practise7_3 {
	public static void main(String[] args) {
		Dog2 Dog = new Dog2();
		Dog2 Dog1 = new Dog2();
		
		Dog.SetName("ぽち");
		Dog.SetAge(3);
		
		Dog1.SetName("ジョン");
		Dog1.SetAge(5);
		
		Dog.ShowProfile();
		Dog1.ShowProfile();
	}
}

