package arraypratice;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       int c=sc.nextInt();
       int a[][]=new int[b][c];
       if(c!=2||b!=2) {
    	   System.out.println("please enter 4 elements");
       }
       else {
       for(int i=0;i<b;i++) {
    	   for(int j=0;j<c;j++) {
    		   a[i][j]=sc.nextInt();
    	   }
       }
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}
	}

}
