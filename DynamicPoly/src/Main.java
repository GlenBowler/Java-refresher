import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Declaring anaimal but dont know what type of animal will be used 
		Animal animal;
		
		System.out.println("What type of animela speak do you want to hear");
		System.out.println("(1=dog) or (2=cat)");
		int choice =sc.nextInt();
		if(choice==1) {
			animal=new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal=new Cat();
			animal.speak();
		}
		else {
			System.out.println("Not animal");
		}
	}

}
