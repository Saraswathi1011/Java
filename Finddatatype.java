package ifconditions;

public class Finddatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //char a='s';
		//int a=10;
		char a='$';
   if((a>'A'&&a<'Z')||(a>'a'&&a<'z')) {
	   System.out.println("Alphabet");
   }
   else if(a>0&&a<9) {
	   System.out.println("Digit");
   }
   else {
	   System.out.println("Speacial character");
   }
	}

}
