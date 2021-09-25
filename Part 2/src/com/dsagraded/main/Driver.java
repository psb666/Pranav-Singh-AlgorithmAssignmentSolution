package com.dsagraded.main;
import java.util.Scanner;
import com.dsagraded.model.*;

public class Driver {
	
	
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		int choice;
		
		keyboardInput input = new keyboardInput();
		Ascending asc= new Ascending();
		mainMenu menu = new mainMenu();
		Descending dsc=new Descending();
		stockSearching search=new stockSearching();
		keyboardInput tb1=new keyboardInput();
		
		
		input.keyInput();
		
		
		
		do {
			menu.mainsMenu();
			 choice = scan.nextInt();
		
			 switch (choice) {
       
			 	case 1:
 
			 		asc.asc();
			 		break;
      
			 	case 2:

			 		dsc.desc();
			 		break;

			 	case 3: 
    		   
			 		tb1.trueVal();
			 		break;
    		   
			 	case 4:
    	 
			 		search.stockSearch();
			 		break;
 
			 	case 5:
    		   
			 		System.out.println("See you again!");
			 		System.exit(choice);
			 		break;
       		
    	   default:
       		
    		   System.out.println("Wrong choice!!!");
    		   System.out.println("");
    	   }
		} 
		while (choice!=0);
	}
}

	
