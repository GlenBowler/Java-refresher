
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =10;
		int min = 1;
		int range = max-min+1;
		int rand= (int)(Math.random()*range)+min;
		System.out.println(rand);
	}

}
