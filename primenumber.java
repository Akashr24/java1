package pkg1;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int i,j;
		int k=0;
		System.out.println("Enter the value1:");
		int I1=sc1.nextInt();
		System.out.println("Enter the value2:");
		int I2=sc1.nextInt();
		for(i=I1;i<I2;i++) {
			for(j=2;j<i;j++) {
				  k = i%j;
			
				while(k!=0) {
					System.out.println(i);
					break;
				}
			
			}
		}
	}
}

	
