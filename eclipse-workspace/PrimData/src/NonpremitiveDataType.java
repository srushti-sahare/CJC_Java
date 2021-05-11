public class NonpremitiveDataType{
	
	public static void main(String[] args) {
		
		
		String str = "test";
		System.out.println("string is:"+str);
		
		
		String str1 = new String("test");
		System.out.println("another string is:"+str1);
		
		int arr[];
		arr = new int[2];
		
		arr[0]=3;
		arr[1]=4;
		
		System.out.println(arr);
		System.out.println(arr[1]);
		
	}
}