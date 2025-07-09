package loopingstatement;
import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=1;
        for(int i=0;i<a;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(sum+" ");
        		sum++;
        	}
        	System.out.println();
        }
	}

}
