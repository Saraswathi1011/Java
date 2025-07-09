package arraypratice;
import java.util.Scanner;
public class Duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int a[]=new int[b];
    for(int i=0;i<b;i++) {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++) {
    	int flag=0;
    	for(int j=0;j<i;j++) {
    		if(a[i]==a[j]) {
    			flag=1;
    			break;
    		}
    	}
        if(flag==0) {
    	System.out.println(a[i]);
    }
	}
	}

}
