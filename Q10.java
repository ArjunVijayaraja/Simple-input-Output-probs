package inputOutput;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		//Input :AABB
		//Output :A,A,B,B
		
		// TODO Auto-generated method stub
		Scanner scanObj = new Scanner(System.in);
		String s = scanObj.nextLine();
		//System.out.println(s.length());
		for(int i = 0; i<s.length();i++) {
			if(i < s.length()-1) {
				System.out.print( s.charAt(i)+",");
			}
			else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
