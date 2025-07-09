package loopingstatement;
import java.util.Scanner;
public class Pyramidtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++) {
        	for(int j=0;j<a-i-1;j++) {
        		System.out.print(" ");
        	}
        	for(int k=0;k<=i;k++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
