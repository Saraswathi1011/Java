package whilecondition;

public class DivisibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
       while(sum!=5) {
    	   for(int i=1;sum<5;i++) {
    		   if(i%2==0&&i%3==0&&i%5==0) {
    			   System.out.println(i);
    			   sum++;
    		   }
    	   }
       }
	}

}
