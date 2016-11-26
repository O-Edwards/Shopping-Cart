import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingList {
	public static void main(String[] args){
		
//Instantiation and Attribute Assignment
	//Shopping Catalog Items
		Objects chicken = new Objects("Chicken",15.00,false,1);
		Objects eggs = new Objects("Eggs",8.25,false,1);
		Objects vodka = new Objects("Vodka",49.99,false,1);
		Objects water = new Objects("Water",12.99,false,1);
		Objects juice = new Objects("Juice",9.99,false,1);
		Objects fish = new Objects("Fish",19.99,false,1);
		Objects steak = new Objects("Steak",29.99,false,1);
		Objects empty = new Objects("empty",0.00,false,1);
//Declaration
	ArrayList<Objects> shopList = new ArrayList<Objects>();
	Attributes[] itemAttributes = new Attributes [7];
	Attributes[] shoppingList = {empty,empty,empty,empty,empty,empty,empty};
		
//Scanner
		Scanner input = new Scanner(System.in);
//Primitive Declaration
		String answer;
		int priority;
		boolean purchase;
//Adding Items into Array
		itemAttributes[0]= chicken;
		itemAttributes[1]= eggs;
		itemAttributes[2]= vodka;
		itemAttributes[3]= water;
		itemAttributes[4]= juice;
		itemAttributes[5]= fish;
		itemAttributes[6]= steak;

//Greeting
		System.out.println("Welcome to Tosin-E-Mart, would you like to see our catalog of items");
//Response
		answer = input.next();

//Catalog View Loop
		if (answer.equalsIgnoreCase("Yes")) {
			for (int i=0;i<itemAttributes.length;i++) {
				System.out.println(itemAttributes[i].getitemName());
			}
		}
		else if (answer.equalsIgnoreCase("No")) {
			System.out.println("Okay,I see that you are already familiar with our items so I'll get out of your way...Happy Shopping!");
		}
		else {
			System.out.println("You chose an invalid choice, please comeback agin later");
			System.exit(0);
		}
//Shopping Item Equivalence
		System.out.println("Select an item from our catalog to be put in your shopping cart");
		System.out.println("If you type an item more then once you will change its quantity");
		System.out.println("Type 'done' when you are finished shopping");
		
		for (int i=0;i<shoppingList.length;i++) {
			answer= input.next();
			if (answer.equalsIgnoreCase("Chicken")) {
				if(shopList.contains(chicken)) {
					int quantity=(chicken.getitemQuantity())+1;
					chicken.setitemQuantitiy(quantity);
					System.out.println("You now have "+chicken.getitemQuantity()+" "+chicken.getitemName()+"s");
					
					i--;
				}
				else {
					shopList.add(chicken);
				}
			}
			else if (answer.equalsIgnoreCase("Eggs")) {
				if(shopList.contains(eggs)) {
					int quantity=(eggs.getitemQuantity())+1;
					eggs.setitemQuantitiy(quantity);
					System.out.println("You now have "+eggs.getitemQuantity()+" cartridges of "+eggs.getitemName());
					
					i--;
				}
				else {
					shopList.add(eggs);
				}
			}
			else if (answer.equalsIgnoreCase("Vodka")) {
				if(shopList.contains(vodka)) {
					int quantity=(vodka.getitemQuantity())+1;
					vodka.setitemQuantitiy(quantity);
					System.out.println("You now have "+vodka.getitemQuantity()+" Handles of "+vodka.getitemName());
					
					i--;
				}
				else {
					shopList.add(vodka);
				}
			}
			else if (answer.equalsIgnoreCase("Water")) {
				if(shopList.contains(water)) {
					int quantity=(water.getitemQuantity())+1;
					water.setitemQuantitiy(quantity);
					System.out.println("You now have "+water.getitemQuantity()+" Bottles of "+water.getitemName());
					
					i--;
				}
				else {
					shopList.add(water);
				}
			}
			else if (answer.equalsIgnoreCase("Juice")) {
				if(shopList.contains(juice)) {
					int quantity=(juice.getitemQuantity())+1;
					juice.setitemQuantitiy(quantity);
					System.out.println("You now have "+juice.getitemQuantity()+" Bottles of "+juice.getitemName());
					
					i--;
				}
				else {
					shopList.add(juice);
				}
			}
			else if (answer.equalsIgnoreCase("Fish")) {
				if(shopList.contains(fish)) {
					int quantity=(fish.getitemQuantity())+1;
					fish.setitemQuantitiy(quantity);
					System.out.println("You now have "+fish.getitemQuantity()+" packages of "+fish.getitemName()+"fillets");
					
					i--;
				}
				else {
					shopList.add(fish);
				}
			}
			else if (answer.equalsIgnoreCase("Steak")) {
				if(shopList.contains(steak)) {
					int quantity=(steak.getitemQuantity())+1;
					steak.setitemQuantitiy(quantity);
					System.out.println("You now have "+steak.getitemQuantity()+" "+steak.getitemName()+"s");
					
					i--;
				}
				else {
					shopList.add(steak);
				}
			}
			else if (answer.equalsIgnoreCase("Done")) {
				break;}
			else {
				System.out.println("That is an invlaid entry");
				i--;
			}
				
		}
//Display Items and Quantities
			System.out.println("");
			System.out.println("This is your current shopping list:\n");
			System.out.println("Item \t   Quantity");
			System.out.println("--------------------------------");
		for (Objects object : shopList ) {
			System.out.println(object.getitemName()+"\t\t"+object.itemQuantity);
		}
		System.out.println("");

//Alter List Quantities
	System.out.println("Would you like to change the quantity for any of your items?");
	answer=input.next();
	if (answer.equalsIgnoreCase("no")) {
		System.out.println("\n");
	}
	else if (answer.equalsIgnoreCase("yes")) {
		System.out.println("Which Item?");
		answer=input.next();
			if (answer.equalsIgnoreCase("chicken")) {
				if (shopList.contains(chicken)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					chicken.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+chicken.getitemQuantity()+" "+chicken.getitemName()+"(s)\n");}
				else {
					System.out.println("You dont have "+chicken.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(chicken);
					int quantity=input.nextInt();
					chicken.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+chicken.getitemQuantity()+" "+chicken.getitemName()+"(s)\n");}
			}
	}
		
	else {
		System.out.println("Your answer is invalid, So I'll just assume that you'd like to continue\n");
	}
		
//Priority Setting and Equivalence
		System.out.println("Now that you have chosen your items, lets set a priority to each");
		System.out.println("When selecting a priority choose a number from 1 to 7 with no repeats");
		System.out.println("What priority would you like to set for "+chicken.getitemName());
		
		//Chicken Priority
		priority = input.nextInt();
		chicken.setItemPrioriy(priority);
		
		//Eggs Priority
		System.out.println("What priority would you like to set for "+eggs.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
			}
			else{
				eggs.setItemPrioriy(priority);
			}
		}
		//Vodka Priority
		System.out.println("What priority would you like to set for "+vodka.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority||eggs.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
			}
			else{
				vodka.setItemPrioriy(priority);}
		}
		//Water Priority
		System.out.println("What priority would you like to set for "+water.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority||eggs.getItemPriority()==priority||vodka.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
			}
			else{
				water.setItemPrioriy(priority);}
		}
		//Juice Priority
		System.out.println("What priority would you like to set for "+juice.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority||eggs.getItemPriority()==priority||vodka.getItemPriority()==priority||water.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
			}
			else{
				juice.setItemPrioriy(priority);}
		}
		//Fish Priority
		System.out.println("What priority would you like to set for "+fish.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority||eggs.getItemPriority()==priority||vodka.getItemPriority()==priority||water.getItemPriority()==priority||juice.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
				
			}
			else{
				fish.setItemPrioriy(priority);}
		}
		//Steak Priority
		System.out.println("What priority would you like to set for "+steak.getitemName());
		for(int i=0;i<1;i++) {
			priority = input.nextInt();
			if (chicken.getItemPriority()==priority||eggs.getItemPriority()==priority||vodka.getItemPriority()==priority||water.getItemPriority()==priority||fish.getItemPriority()==priority||juice.getItemPriority()==priority) {
				System.out.println("You have already used that priority try again");
				i--;
			}
			else{
				steak.setItemPrioriy(priority);}
		}
	//Selection Sort of Priority
		
		//Outer Loop Variable
		int j; //Inner Loop Variable
		int minValue; // Minimum Value
		int minIndex; //Minimum Index Value
		Attributes temp; //Temporary for Swapping
		
			
		for (int i=0;i<shoppingList.length;i++) {
			minValue=shoppingList[i].getItemPriority();
			minIndex=i;
				for (j=i;j<shoppingList.length;j++) {
					if(shoppingList[j].getItemPriority()<minValue){
						minValue=shoppingList[j].getItemPriority();
						minIndex = j;	
					}
				
				}
				if(minValue<shoppingList[i].getItemPriority()) {
					temp=shoppingList[i];
					shoppingList[i]=shoppingList[minIndex];
					shoppingList[minIndex]=temp;
				}
		}
		
		
	//Priority and Item Display
		System.out.println("These are your items and set priority");
		for(int i=0;i<shoppingList.length;i++){
			System.out.println(shoppingList[i].getitemName() + "\t" +shoppingList[i].getItemPriority());
		}
	
	//Shopping
	System.out.println("Perfect now how about you go shopping");
	System.out.println("What is your budget?");
	double bankAccount = input.nextInt();
	System.out.println("You have $"+bankAccount+" let's see what you can get in your cart");
	for(int i=0;i<shoppingList.length;i++){
		if(shoppingList[i].getitemPurchased()==false) {
			if(bankAccount>(shoppingList[i].getitemPrice()*shoppingList[i].getitemQuantity())){
				bankAccount=bankAccount-(shoppingList[i].getitemPrice()*shoppingList[i].getitemQuantity());
				purchase=true;
				shoppingList[i].setitemPurchased(purchase);
			}
			else {
				continue;}
		}
	}
	
	for (int i=0;i<shoppingList.length;i++) {
		if (shoppingList[i].getitemPurchased()==true) {
			System.out.println("You have purchased "+shoppingList[i].getitemName()+ " for "+shoppingList[i].getitemPrice());
		}
	}
	for (int i=0;i<shoppingList.length;i++) {
		if (shoppingList[i].getitemPurchased()==false) {
			System.out.println("You were unable to purchase "+shoppingList[i].getitemName()+ " for "+shoppingList[i].getitemPrice());
		}
	}	
	new DecimalFormat("##.##").format(bankAccount);
	System.out.println("You have $"+new DecimalFormat("##.##").format(bankAccount)+" left. Have a good day and come back soon!");
	
		



		}
}
