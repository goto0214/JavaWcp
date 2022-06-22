package object;

public class KyoutoCleaningShop implements CleaningService{
	String ownerName;
	String address;
	String phone;
	
	public Shirt washShirt(Shirt s) {
		
		return s;
	}
	
	public Towl washTowl(Towl t) {
		return t;
	}
}
