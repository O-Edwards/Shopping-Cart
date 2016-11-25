import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
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
		for (int i=0;i<shoppingList.length;i++) {
			answer= input.next();
			if (answer.equalsIgnoreCase("Chicken")) {
				if(chicken.equivalence(shoppingList[0])||chicken.equivalence(shoppingList[1])||chicken.equivalence(shoppingList[2])||chicken.equivalence(shoppingList[3])||chicken.equivalence(shoppingList[4])||chicken.equivalence(shoppingList[5])||chicken.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = chicken;
				}
			}
			else if (answer.equalsIgnoreCase("Eggs")) {
				if(eggs.equivalence(shoppingList[0])||eggs.equivalence(shoppingList[1])||eggs.equivalence(shoppingList[2])||eggs.equivalence(shoppingList[3])||eggs.equivalence(shoppingList[4])||eggs.equivalence(shoppingList[5])||eggs.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = eggs;
				}
			}
			else if (answer.equalsIgnoreCase("Vodka")) {
				if(vodka.equivalence(shoppingList[0])||vodka.equivalence(shoppingList[1])||vodka.equivalence(shoppingList[2])||vodka.equivalence(shoppingList[3])||vodka.equivalence(shoppingList[4])||vodka.equivalence(shoppingList[5])||vodka.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = vodka;
				}
			}
			else if (answer.equalsIgnoreCase("Water")) {
				if(water.equivalence(shoppingList[0])||water.equivalence(shoppingList[1])||water.equivalence(shoppingList[2])||water.equivalence(shoppingList[3])||water.equivalence(shoppingList[4])||water.equivalence(shoppingList[5])||water.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = water;
				}
			}
			else if (answer.equalsIgnoreCase("Juice")) {
				if(juice.equivalence(shoppingList[0])||juice.equivalence(shoppingList[1])||juice.equivalence(shoppingList[2])||juice.equivalence(shoppingList[3])||juice.equivalence(shoppingList[4])||juice.equivalence(shoppingList[5])||juice.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = juice;
				}
			}
			else if (answer.equalsIgnoreCase("Fish")) {
				if(fish.equivalence(shoppingList[0])||fish.equivalence(shoppingList[1])||fish.equivalence(shoppingList[2])||fish.equivalence(shoppingList[3])||fish.equivalence(shoppingList[4])||fish.equivalence(shoppingList[5])||fish.equivalence(shoppingList[6])) {
					System.out.println("You already have that item");
					i--;
				}
				else {
					shoppingList[i] = fish;
				}
			}
			else if (answer.equalsIgnoreCase("Steak")) {
				if(steak.equivalence(shoppingList[0])||steak.equivalence(shoppingList[1])||steak.equivalence(shoppingList[2])||steak.equivalence(shoppingList[3])||steak.equivalence(shoppingList[4])||steak.equivalence(shoppingList[5])||steak.equivalence(shoppingList[6])) {
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
	double money = 59.00;
	System.out.println("You have $"+money+" let's see what you can get in your cart");
	for(int i=0;i<shoppingList.length;i++){
		if(shoppingList[i].getitemPurchased()==false) {
			if(money>(shoppingList[i].getitemPrice()*shoppingList[i].getitemQuantity())){
				money=money-(shoppingList[i].getitemPrice()*shoppingList[i].getitemQuantity());
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
