package Java_practice;

public class Friend {
	private String name;
	private int age;
	private String job;
	
	public Friend(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}
