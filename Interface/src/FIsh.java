
public class FIsh implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("Hunting smaller fish");
		
	}

	@Override
	public void flee() {
		System.out.println("Fleeing from bigger fish");
		
	}

}
