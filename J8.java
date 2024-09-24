
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class J8 {

	public static void main(String[] args) throws IOException {
		//Scanner sc1=new Scanner(System.in);
		String info1="";
	
		File f1=new File("in2.txt");
		FileWriter f2=new FileWriter("out1.txt");
		Scanner sc2=new Scanner(f1);
		String s1=sc2.nextLine();
		String[] arr1=s1.split(",");
		int start=Integer.parseInt(arr1[0]);
		int end=Integer.parseInt(arr1[1]);
		
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				info1=(j+"*"+i+"="+j*i);
				System.out.println(info1);
				f2.write(info1);
				f2.write("\n");
			}
			System.out.println();
			f2.write("\n");
			
		}
		f2.close();
		
		
	}

}