package gliderAIAssessment;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MagneticLetters {
	
	public static String solve(String S1,String S2,String R) {
			//write you code here
			
			char[] combined = (S1+S2).toCharArray();
			Arrays.sort(combined);
			char[] Rec = R.toCharArray();	
			Arrays.sort(Rec);
			 
			return Arrays.equals(combined, Rec)? "Yes":"No";		
			
			/*
			 * int [] f =new int [26]; for(char c:R.toCharArray()) { f[c -'A']++; } for(char
			 * c : S1.toCharArray()) { if(f[c-'A']>0) { f[c-'A']--; } else { return "No"; }
			 * } for(char c: S2.toCharArray()) { if(f[c-'A']>0) { f[c-'A']--; } else {
			 * return "No"; } } for(int count : f) { if(count>0) { return "No"; } } return
			 * "Yes";
			 */	}

	public static void main(String[] args) throws IOException {
		
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("S1");
	    String s1 = myObj.nextLine(); //Enter S1
	    
	    System.out.println("S2");
	    String s2 = myObj.nextLine(); //Enter s2
	    
	    System.out.println("R");
	    String R = myObj.nextLine();  // Enter R
	    
	    String outcome= MagneticLetters.solve(s1,s2,R);
	    
	    System.out.println(outcome);
	}

}
