public abstract class Attributes {
	public Attributes(String name,double price,boolean purchase, int quantity) {
			itemName=name;
			itemPrice=price;
			itemPurchased=purchase;
			itemQuantity=quantity;
		}
	private String itemName;
		
		public void setitemName(String name){
			this.itemName=name;
		}
		public String getitemName(){
			return itemName;
		}
	
	private double itemPrice;
		public void setitemPrice (double price){
			this.itemPrice= price;
		}
		public double getitemPrice() {
			return itemPrice;
		}
	public int itemPriority;
		public int getItemPriority() {
			return itemPriority;
		}
		public void setItemPrioriy(int itemPriority) {
					try{
						this.itemPriority = itemPriority;
					}
					catch(Exception e) {
						System.out.println("The value attempted is invalid");
					}
		
		}
		
		public int itemQuantity;
			public int getitemQuantity() {
				return itemQuantity;
			}
			public void setitemQuantitiy (int quantity) {
				try{
					this.itemQuantity = quantity;}
				catch(Exception e){
					System.out.println("The value attempted is invalid");
				}
			}
		
	private boolean itemPurchased;
		public void setitemPurchased (boolean purchase){
			this.itemPurchased= purchase;
		}
		public boolean getitemPurchased() {
			return itemPurchased;
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
		
	public static void checkForNum (String name) throws MustBeAllLettersException{
		int digit = 0;
		for(int i=0;i<name.length();i++){
			if (Character.isDigit(name.charAt(i))){
				digit++;
			}
			
		}
		if (digit!=0){
			throw new MustBeAllLettersException(name);
		}
	}
			
}
