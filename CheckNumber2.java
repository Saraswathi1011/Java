package ifconditions;
import java.util.Scanner;
public class CheckNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int input=sc.nextInt();
       if((input%2)!=0) {
    	   System.out.println("Odd number");
       }
       else {
    	   System.out.println("Even number");
       }
	}

}
