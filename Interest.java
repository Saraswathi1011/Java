package ifconditions;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String gender=sc.next();
    int age=sc.nextInt();
    if((gender.equals("Female"))&&(age>=1&&age<=58)) {
    	System.out.println("8.2%");
    }
    else if(gender.equals("Female")&&(age>=59&&age<=100)) {
    	System.out.println("8.4%");
    }
    else if(gender.equals("Male")&&(age>=1&&age<=58)) {
    	System.out.println("9.2%");
    }
    else if(gender.equals("Male")&&(age>=59&&age<=100)) {
    	System.out.println("10.4%");
    }
    else {
    	System.out.println("Invalid operator");
    }
	}

}
