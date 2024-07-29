package inputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanObj = new Scanner(System.in);
		String s = scanObj.nextLine();
		//List<Character> c = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
 
	}

}
