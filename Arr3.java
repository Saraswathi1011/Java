package arraypratice;
import java.util.Scanner;
public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[][]=new int[a][b];
        if(a!=3||b!=3) {
        	System.out.println("Please enter 9 element");
        }
        else {
        	for(int i=0;i<a;i++) {
        		for(int j=0;j<b;j++) {
        			c[i][j]=sc.nextInt();
        		}
        	}
        	for(int i=0;i<a;i++) {
        		for(int j=0;j<b;j++) {
        			System.out.print(c[i][j]+" ");
        		}
        		System.out.println();
        	}
        }
	}

}
