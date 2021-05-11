import java.util.Random;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int x = r.nextInt(6) + 1;
		
		System.out.println("you rolled a:" +x);
		
		

	}

}
