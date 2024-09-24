package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J7 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc1=new Scanner(System.in);
	
		File f1=new File("in1.txt");
		Scanner sc2=new Scanner(f1);
		int start=sc2.nextInt();
		int end=sc2.nextInt();
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+j*i);	
			}
			System.out.println();
			
		}
		
		
	}

}
