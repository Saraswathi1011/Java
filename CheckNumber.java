package ifconditions;

import java.util.Scanner;

public class CheckNumber {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		    int input=sc.nextInt();
		    if(input==0) {
		    	System.out.println("Zero");
		    }
		    else if(input>0) {
		    	System.out.println("Positive");
			}
		    else {
		    	System.out.println("Negative");

		}

	}

}
