import java.util.*;



public class Project4 {
	
	static long start;
	static long end;
	static long total;
	static int count;
	String alphaString = "zyxwvutsrqponmlkjihgfedcba";
	
	public static void main(String[] args) {
		
		start = System.nanoTime();
		System.out.println("Enter the string for encryption (minimun of 140 characters): ");
		String message = "";
		Scanner input = new Scanner(System.in);
		message = input.next();
		int checkLength = message.length();
		
		
		
		
		int shiftKey = 0;
		end = System.nanoTime();
		total = end - start;
		System.out.println(Math.round(total * .000000001) + Math.round(total * .000000001));		
		
		
	}
	
	
	//public static String encrypt(String encrypt, int shiftKey) {
		
		
	//}

}
