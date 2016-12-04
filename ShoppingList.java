import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ShoppingList implements Output {
	public static void main(String[] args) { 
		
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
		System.out.println("Welcome to Tosin-E-Mart!");
		
//Name Acquisition
		boolean good = false;
		do{
			System.out.print("Before we begin what is your name?");
			String name = input.next();
			try {
				checkForNum(name);
				good=true;}
			catch(MustBeAllLettersException e){
				System.out.println(e+ "\n");
			}
		}
		while(good==false);
		
//Catalog View Proposal
		System.out.println("Okay, what would you like to see our Catalog of items?" );
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

//Alter List and Quantities
	System.out.println("Would you like to change the quantity for any of your items?");
	answer=input.next();
	if (answer.equalsIgnoreCase("no")) {
		System.out.println("\n");
	}
	
	else if (answer.equalsIgnoreCase("yes")) {
		System.out.print("Which Item? Type 'done' when finished: ");
		for (int i = 0;i<shoppingList.length;i++) {
			answer=input.next();
			if (answer.equalsIgnoreCase("chicken")) {
				if (shopList.contains(chicken)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					chicken.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+chicken.getitemQuantity()+" "+chicken.getitemName()+"(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+chicken.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(chicken);
					int quantity=input.nextInt();
					chicken.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+chicken.getitemQuantity()+" "+chicken.getitemName()+"(s)");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("eggs")) {
				if (shopList.contains(eggs)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					eggs.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+eggs.getitemQuantity()+" "+eggs.getitemName()+"catridge(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+eggs.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(eggs);
					int quantity=input.nextInt();
					eggs.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+eggs.getitemQuantity()+" "+eggs.getitemName()+"cartridge(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("vodka")) {
				if (shopList.contains(vodka)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					vodka.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+vodka.getitemQuantity()+" "+vodka.getitemName()+"handle(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+vodka.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(vodka);
					int quantity=input.nextInt();
					vodka.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+vodka.getitemQuantity()+" "+vodka.getitemName()+"handle(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("water")) {
				if (shopList.contains(water)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					water.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+water.getitemQuantity()+" "+water.getitemName()+"bottles(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+water.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(water);
					int quantity=input.nextInt();
					water.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+water.getitemQuantity()+" "+water.getitemName()+"bottle(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("juice")) {
				if (shopList.contains(juice)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					juice.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+juice.getitemQuantity()+" "+juice.getitemName()+"bottle(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+juice.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(juice);
					int quantity=input.nextInt();
					juice.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+juice.getitemQuantity()+" "+juice.getitemName()+"bottle(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("fish")) {
				if (shopList.contains(fish)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					fish.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+fish.getitemQuantity()+" "+fish.getitemName()+"(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+fish.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(fish);
					int quantity=input.nextInt();
					fish.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+fish.getitemQuantity()+" "+fish.getitemName()+"(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			else if (answer.equalsIgnoreCase("steak")) {
				if (shopList.contains(steak)){
					System.out.println("What quantity woulld you like to set");
					int quantity=input.nextInt();
					steak.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+steak.getitemQuantity()+" "+steak.getitemName()+"(s)\n");
				    System.out.println("What other item? When you are done type 'done'");}
				else {
					System.out.println("You dont have "+steak.getitemName()+ " on your list. But we can just add it. What quantity would you like?");
					shopList.add(steak);
					int quantity=input.nextInt();
					steak.setitemQuantitiy(quantity);
					System.out.println("Ok you now have "+steak.getitemQuantity()+" "+steak.getitemName()+"(s)\n");
					System.out.println("What other item? When you are done type 'done'");}
			}
			
			else if (answer.equalsIgnoreCase("done")) {
				break;
			}
			else 
				System.out.println("Your answer is invalid, So I'll just assume that you'd like to continue\n");
		}
		
	}
	else {
		System.out.println("Your answer is invalid, So I'll just assume that you'd like to continue\n");
	}
	
	
	
			
//Priority Setting and Equivalence
		try {
			for (Objects object : shopList ) {
				System.out.println("What priority would you like to set for "+object.getitemName());
				priority = input.nextInt();
				object.setItemPrioriy(priority);
			}
		}
	catch(Exception e) {
		System.out.println("You picked an invalid entry. Please try again");
		}

	
//Selection Sort of Priority
	//Outer Loop Variable
		int j; //Inner Loop Variable
		int minValue; // Minimum Value
		int minIndex; //Minimum Index Value
		Objects temp; //Temporary for Swapping
		
			
		for (int i=0;i<shopList.size();i++) {
			minValue=shopList.get(i).getItemPriority();
			minIndex=i;
				for (j=i;j<shopList.size();j++) {
					if(shopList.get(j).getItemPriority()<minValue){
						minValue=shopList.get(j).getItemPriority();
						minIndex = j;	
					}
				
				}
				if(minValue<shopList.get(i).getItemPriority()) {
					temp=shopList.get(i);
					shopList.set(i, shopList.get(minIndex));
					shopList.set(minIndex, temp);
				}
		}
		
		
	//Shopping List Display
		System.out.println("Your current Shopping List:\n");
		System.out.println("Item \t   Quantity \t  Priority");
		System.out.println("--------------------------------");
		for (Objects object : shopList ) {
			System.out.println(object.getitemName()+"\t\t"+object.getitemQuantity()+"\t\t"+object.getItemPriority());
		}
		System.out.println("\n");
		
	//Print to Text File
		String fileName = "Shopping List.txt"; 
		PrintWriter output = null;
		
		try{
            	output = new PrintWriter (fileName);
			}
		
        catch (FileNotFoundException e) {
            System.out.println ("Error opening the file " +
                    fileName);
            System.exit (0);
        }
		
		output.println("Your Shopping List is as follows:\n");
		output.println("Item \t   Quantity \t  Priority");
		output.println("--------------------------------");
		for (Objects object : shopList ) {
			output.println(object.getitemName()+"\t\t"+object.getitemQuantity()+"\t\t"+object.getItemPriority());
		}
		output.println("\n");
		output.close ();
		
	//Shopping
	System.out.println("Perfect now how about you go shopping");
	System.out.println("What is your budget?");
	double bankAccount = input.nextDouble();
	System.out.println("You have $"+bankAccount+" let's see what you can get in your cart");
	
	for(int i=0;i<shopList.size();i++){
		if(shopList.get(i).getitemPurchased()==false) {
			if(bankAccount>(shopList.get(i).getitemPrice()*shopList.get(i).getitemQuantity())){
				bankAccount=bankAccount-(shopList.get(i).getitemPrice()*shopList.get(i).getitemQuantity());
				purchase=true;
				shopList.get(i).setitemPurchased(purchase);
			}
			else {
				continue;}
		}
	}
	
	for (int i=0;i<shopList.size();i++) {
		if (shopList.get(i).getitemPurchased()==true) {
			System.out.println("You have purchased "+shopList.get(i).getitemQuantity()+" "+shopList.get(i).getitemName()+"(s)"+ " for "+(shopList.get(i).getitemPrice()*shopList.get(i).getitemQuantity()));
		}
	}
	for (int i=0;i<shopList.size();i++) {
		if (shopList.get(i).getitemPurchased()==false) {
			System.out.println("You were unable to purchase "+shopList.get(i).getitemName()+ " for "+shopList.get(i).getitemPrice());
		}
	}	
	new DecimalFormat("##.##").format(bankAccount);
	System.out.println("You have $"+new DecimalFormat("##.##").format(bankAccount)+" left. Have a good day and come back soon!");
	
		



		}

	private static void checkForNum(String name) throws MustBeAllLettersException {
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
