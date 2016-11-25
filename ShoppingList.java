import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ShoppingList {
	public static void main(String[] args){
		
//Declaration
	Attributes[] itemAttributes = new Attributes [7];
	Attributes[] shoppingList = new Attributes [7];
	
	
//Instantiation and Attribute Assignment
	//Shopping Catalog Items
		Attributes chicken = new Attributes();
			chicken.setitemName("Chicken");
			chicken.setitemPrice(15.00);
			chicken.setitemPurchased(false);
		Attributes eggs = new Attributes();
			eggs.setitemName("Eggs");
			eggs.setitemPrice(8.25);
			eggs.setitemPurchased(false);
		Attributes vodka = new Attributes();
			vodka.setitemName("Vodka");
			vodka.setitemPrice(49.99);
			vodka.setitemPurchased(false);
		Attributes water = new Attributes();
			water.setitemName("Water");
			water.setitemPrice(12.99);
			water.setitemPurchased(false);
		Attributes juice = new Attributes();
			juice.setitemName("Juice");
			juice.setitemPrice(9.99);
			juice.setitemPurchased(false);
		Attributes fish = new Attributes();
			fish.setitemName("Fish");
			fish.setitemPrice(19.99);
			fish.setitemPurchased(false);
		Attributes steak = new Attributes();
			steak.setitemName("Steak");
			steak.setitemPrice(29.99);
			steak.setitemPurchased(false);
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
		for (int i=0;i<shoppingList.length;i++) {
			answer= input.next();
			if (answer.equalsIgnoreCase("Chicken")) {
				if(Arrays.asList(shoppingList).contains(chicken)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = chicken;
				}
			}
			else if (answer.equalsIgnoreCase("Eggs")) {
				if(Arrays.asList(shoppingList).contains(eggs)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = eggs;
				}
			}
			else if (answer.equalsIgnoreCase("Vodka")) {
				if(Arrays.asList(shoppingList).contains(vodka)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = vodka;
				}
			}
			else if (answer.equalsIgnoreCase("Water")) {
				if(Arrays.asList(shoppingList).contains(water)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = water;
				}
			}
			else if (answer.equalsIgnoreCase("Juice")) {
				if(Arrays.asList(shoppingList).contains(juice)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = juice;
				}
			}
			else if (answer.equalsIgnoreCase("Fish")) {
				if(Arrays.asList(shoppingList).contains(fish)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = fish;
				}
			}
			else if (answer.equalsIgnoreCase("Steak")) {
				if(Arrays.asList(shoppingList).contains(steak)) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = steak;
				}
			}
			else {
				System.out.println("That is an invlaid entry");
				i--;
			}
				
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
	//Priority and Item Display
		System.out.println("These are your items and set priority");
		for(int i=0;i<shoppingList.length;i++){
			System.out.println(itemAttributes[i].getitemName() + "\t" +itemAttributes[i].getItemPriority());
		}
	
	//Shopping
	System.out.println("Perfect now how about you go shopping");
	double money = 59.00;
	System.out.println("You have $"+money+" let's see what you can get in your cart");
	for(int i=0;i<shoppingList.length;i++){
		if(shoppingList[i].getitemPurchased()==false) {
			if(money>shoppingList[i].getitemPrice()){
				money=money-shoppingList[i].getitemPrice();
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
	new DecimalFormat("##.##").format(money);
	System.out.println("You have $"+new DecimalFormat("##.##").format(money)+" left. Have a good day and come back soon!");
	
		



		}
}
