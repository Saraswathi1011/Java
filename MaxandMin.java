package arraypratice;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {9,4,3,3,6};
    int max=0;
    int min=a[0];
    for(int i=0;i<a.length;i++) {
    	if(a[i]>max) {
    		max=a[i];
    	}
    	if(a[i]<min) {
    		min=a[i];
    	}
    }
    System.out.println(max+" "+min);
	}

}
