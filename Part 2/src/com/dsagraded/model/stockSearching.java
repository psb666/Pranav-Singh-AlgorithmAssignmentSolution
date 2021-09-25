package com.dsagraded.model;

public class stockSearching extends keyboardInput {
	
	public void stockSearch() {
		System.out.println("Enter a stock price to search:");
		
		srch = scanner.nextDouble();
		
		searchValue(srch);
			
	}
	
	public void searchValue(double value) {
		for (int i=0;i<array.length;i++) {
			if (array[i]==value) {
				System.out.println("Stock of value "+srch+" found");
				System.out.println("");
			status=true;
			
			}
		}
	
			if (status==false) {
			
			System.out.println("Stock doesnt exists!");
			System.out.println("");
					}
	}

}
