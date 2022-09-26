import java.util.Scanner;
public class CountVowelDigit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;   // input String
	    int inStrLength;
	    int isDigit = 0;
	    int isVowel = 0;
	    int totalchar = 0;// length of the input String
	    char inChar;    // each individual char in the string
	    
	    System.out.print("Enter a String: ");
	      inStr = in.next().toLowerCase();  
	      inStrLength = inStr.length();
	      
	    for (int inCharIdx = 0; inCharIdx < inStrLength; ++inCharIdx) {
	    	inChar = inStr.charAt(inCharIdx);
		        if (inChar >= '0' && inChar <= '9') {
		        	isDigit++;
		        	totalchar++;
		        } else if (inChar == 'a' || inChar == 'e' || inChar == 'i' || inChar == 'o' || inChar == 'u') {
		        	isVowel++;
		        	totalchar++;
		        } else {
		        	totalchar++;
		        }
	    }
	    
	    System.out.printf("Number of vowels is: %d (%.2f %)", isVowel, ((double)isVowel/totalchar));
	}
}