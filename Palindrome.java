package whilecondition;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int c=a;
         int rev=0;
         while(a!=0) {
        	 int rem=(a%10);
        	 rev=(rev*10)+rem;
        	 a=a/10;
         }
         if(rev==c) {
        	 System.out.println("Palindrome");
         }
         else {
             System.out.println("Not palindrome");
         }
	}

}
