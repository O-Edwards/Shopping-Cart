
public class Objects extends Attributes {

	public Objects(String name, double price, boolean purchase, int quantity) {
		super(name, price, purchase, quantity);
	}
	
	public boolean equivalence(Attributes item) {
		if (this.getitemName() != item.getitemName()) 
		{
			return false;
		}
		else if (this.getitemPrice() != item.getitemPrice()) 
		{
			return false;
		}
		else if (this.getItemPriority() != item.getItemPriority()) 
		{
			return false;
		}
		else {
		return true;}
	}
		
	public void copyItem(Attributes itemCopy){
		String X = this.getitemName(); 
			itemCopy.setitemName(X); 
		int Y = this.getItemPriority();
			itemCopy.setItemPrioriy(Y);
		double Z = this.getitemPrice();
			itemCopy.setitemPrice(Z);
	}
		
	
	
	
	
	
	
		
	}
	
		
		
	


