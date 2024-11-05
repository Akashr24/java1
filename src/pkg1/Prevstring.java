package pkg1;
import java.util.Scanner;

import pkg2.Tools2;

public class Prevstring {
	
	
	
		public static void main(String[] args) {
			Tools2 t1=new Tools2();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string:");
			String s1=scanner.nextLine();
			System.out.println(t1.reverse(s1));
			

		}

	}

