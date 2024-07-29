package inputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a code to get the input in the given format and print the output in the given format
//
//Input Description:
//A single line contains integers separated by space
//
//Output Description:
//Print the integer list of integers separated by space
//
//Sample Input :
//2 3 4 5 6 7 8
//Sample Output :
//2 3 4 5 6 7 8

public class Q2 {
	
	
	public void method1() {
		Scanner scanObj = new Scanner(System.in);
		String s = scanObj.nextLine();
		String[] sa = s.split(" ");
		//System.out.println(sa.length);
		/*for(String i : sa) {
			System.out.println(i);
		}
		*/
		for(int i=0;i<sa.length;i++) {
			if(i < sa.length-1) {
				System.out.print(sa[i]+" ");
				
			}else {
				System.out.print(sa[i]);
			}
		}
	};
	
	public void method2() {
		Scanner scanObj = new Scanner(System.in);
		String s = scanObj.nextLine();
		String[] sa = s.split(" ");
		int[] ii = new int [sa.length];
		
		try {
			for(int i = 0; i<sa.length;i++) {
				ii[i]  = Integer.parseInt(sa[i]);
			}
			
			for(int i=0;i<ii.length;i++) {
				if(i < ii.length-1) {
					System.out.print(ii[i]+" ");
					
				}else {
					System.out.print(ii[i]);
				}
			}
		}catch (Exception e) {
			System.out.println("Enter only integers");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Q2 q2 = new Q2();
			q2.method2();
		
		

	}

}
