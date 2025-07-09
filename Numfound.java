package arraypratice;
import java.util.Scanner;
public class Numfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {7,4,5,9,3};
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int flag=0;
    int s=0;
    for(int i=0;i<a.length;i++) {
    	if(a[i]==b){
    		flag=1;
    		s=i;
    }
    }
    if(flag==1) {
    	System.out.println(s);
    }
    else {
		System.out.println("-1");
	}
    }
}
