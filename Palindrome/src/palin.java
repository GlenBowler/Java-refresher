
public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ete";
		String reverse="";
		
		for (int x=name.length()-1;x>=0;x--) {
			
			reverse+=name.charAt(x);
		}
		if(reverse.toLowerCase().equals(name.toLowerCase())) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
