public class Attributes {
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
			for(int i=0;i<1;i++) {
				if (itemPriority>0&&itemPriority<=7) {
					this.itemPriority = itemPriority;
					}
				else 
					{System.out.println("Please try again, Priority must be between 1 and 7");
					System.exit(0);}
			}
		}
	private boolean itemPurchased;
		public void setitemPurchased (boolean purchase){
			this.itemPurchased= purchase;
		}
		public boolean getitemPurchased() {
			return itemPurchased;
		}
		

		
	
			
}
