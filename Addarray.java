package arraypratice;
import java.util.Scanner;
public class Addarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int sum=0;
        for(int i=0;i<a;i++) {
        	b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++) {
        	if(b[i]==6) {
        	
        		while(b[i]!=7&&i<a) {
        			i++;
        		}
        		
        	}
        	else {
        		sum=sum+b[i];
        	
        	}
        }
        System.out.println(sum);
	}

}
