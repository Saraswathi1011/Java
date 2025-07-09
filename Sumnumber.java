package java;

public class Police {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        if (args.length != 2) {
		            System.out.println("Please provide exactly two integer arguments.");
		            return;
		        }

		        // Convert command-line arguments to integers (assuming valid input)
		        int num1 = Integer.parseInt(args[0]);
		        int num2 = Integer.parseInt(args[1]);

		        // Calculate and print the sum
		        int sum = num1 + num2;
		        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		    }
		}

	}

}
