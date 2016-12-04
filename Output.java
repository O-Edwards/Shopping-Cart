import java.io.FileNotFoundException;
import java.io.PrintWriter;

public interface Output {
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
	
}
}
