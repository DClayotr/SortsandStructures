package OOPs;

import java.util.Scanner;

class BinarySearch {
	private int x,y;
	private int bottom = 0;
	private int top = 0;
	private int midpoint = 0;
	private int input = 0;
	private boolean found = false;
	private Scanner scan = new Scanner(System.in);
	private int[] Array = {4,7,6,1,2,0,9,5,3,8};
	void find() {
		System.out.print("Enter a number to search for: ");
		input = scan.nextInt();
		top = Array.length - 1;
		
		while(bottom <= top && found == false) {
				midpoint = (top+bottom)/2;
				if (Array[midpoint] == input ) {
					found = true;
				}else {
					if(Array[midpoint] < input) {
						bottom = midpoint + 1;
						continue;
					}else {
						top = midpoint - 1;
						continue;
					}
				}
			
			}
			if(found == true) {
				System.out.println(input + " found at " + midpoint);
			} else {
			System.out.println("Item not found");
			}
		}

	void sort() {
		for(int z = 0; z<Array.length; z++) {	
			for(int i = 1; i< Array.length; i++) {
				
				if(Array[i]<Array[i-1]) {
					x = Array[i-1];
					y = Array[i];
					Array[i-1] = y;
					Array[i] = x;
				}else {
					continue;
				}
			 
					 
			}
		}
	}
}


