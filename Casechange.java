package ifconditions;
import java.util.Scanner;
public class Casechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char a=sc.next().charAt(0);
       if(a>=65&&a<=90) {
    	   char c=(char)(a+32);
    	  System.out.println(c); 
       }
       else if(a>=97&&a<=122) {
    	   char c=(char)(a-32);
    	   System.out.println(c);
       }
       else {
    	   System.out.println("Invalid operator");
       }
	}

}
