package arraypratice;
import java.util.Scanner;
public class SecondLarSma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b[]=new int[a];
       for(int i=0;i<a;i++) {
    	   b[i]=sc.nextInt();
       }
       int max=0;
       int min=b[0];
       int secmax=0;
       int secmin=b[0];
       for(int i=0;i<a;i++) {
    	   if(b[i]>max) {
    		   max=b[i];
    	   }
    	   if(b[i]<min) {
    		   min=b[i];
    	   }
       }
       for(int i=0;i<a;i++) {
    	   if(b[i]>secmax&&b[i]<max) {
    		   secmax=b[i];
    	   }
       }
       for(int i=0;i<a;i++) {
    	   if(b[i]<secmin&&b[i]>min) {
    		   secmin=b[i];
    	   }
       }
       System.out.println(max);
       System.out.println(min);
       System.out.println(secmax);
       System.out.println(secmin);
	}

}
