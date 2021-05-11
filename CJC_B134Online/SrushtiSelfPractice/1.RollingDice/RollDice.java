import java.util.Random;
public class RollDice
{
	public static void main(String args[])
	{
		Random r = new Random();
		int x=r.nextInt(6) + 1;
		
		System.out.println("you rolled a:"  +x);
	}
}
