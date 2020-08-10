package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String v = "";
			for(int i = s.length() -1; i >= 0; i--) {
				v += s.charAt(i);
			}
			System.out.println(v);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String v = "";
			String total = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					total += s.substring(i, i+1).toUpperCase() ;
				}
				else if(i % 2 == 1) {
					total += s.substring(i, i+1).toLowerCase();
				}
			}
			System.out.println(total);
		}, "hello");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String v = "";
			for(int i = 0; i < s.length(); i++) {
				v += s.substring(i, i+1);
				v += '.';
			}
			System.out.println(v);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String v = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'e') {
					v += s.charAt(i);
					System.out.println(v);
				}
				else {
					System.out.println("YO");
				}
			}
			System.out.println(v);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
