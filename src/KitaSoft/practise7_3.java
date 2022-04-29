package KitaSoft;
class Dog2{
	private String Name;
	private int Age;
	private String Kind;
	
	public Dog2(String kd) {
		Kind = kd;
	}
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int ag) {
		Age = ag;
	}
	
	public void ShowProfile() {
		System.out.println(Kind + "で名前は"+ Name + "、" + Age + "歳です。");
	}
}
public class practise7_3 {
	public static void main(String[] args) {
		Dog2 Dog = new Dog2("秋田犬");
		Dog2 Dog1 = new Dog2("ハスキー犬");
		
		Dog.SetName("ぽち");
		Dog.SetAge(3);
		
		Dog1.SetName("ジョン");
		Dog1.SetAge(5);
		
		Dog.ShowProfile();
		Dog1.ShowProfile();
	}
}

