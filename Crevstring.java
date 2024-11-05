package pkg1;

import java.util.Scanner;

class Tools{
	String s1="";
	String s2="";
	int len1=0;
	public String reverse(String s1) {
		len1=s1.length();
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
		return s2;
	}
}

public class Crevstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tools t1=new Tools();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=scanner.nextLine();;
		System.out.println(t1.reverse(s1));
		

	}

}
