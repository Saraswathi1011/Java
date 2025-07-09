package ifconditions;

public class CharacterVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='s';
		char c2='e';
        if(c1=='s'&&c2=='e') {
        	System.out.println("s"+","+"e");
        }
        else if(c1=='a'&&c2=='e') {
        	System.out.println("a"+","+"e");
        }
        else {
        	System.out.println("Invalid input");
        }
	}

}
