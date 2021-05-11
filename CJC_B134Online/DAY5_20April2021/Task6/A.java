public class A
{
  public int add(int a, int b)
  {
    int sum = a+b;
    return sum;
	
  }
  public static void main(String args[]) 
  {
    A a = new A();
  int x= a.add(20,20);
	int result =x+10;
	System.out.println(result);
   }
}
