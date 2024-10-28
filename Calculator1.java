package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Calculator1{

	public static void main(String[] args) throws IOException {
		//Scanner sc1=new Scanner(System.in);
	     int info1=0;
	     String info2="";
	
		File f1=new File("input2.txt");
		FileWriter f2=new FileWriter("out1.txt");
		try (Scanner sc2 = new Scanner(f1)) {
			String s1=sc2.nextLine();
			String[] arr1=s1.split(",");
			int operand1=Integer.parseInt(arr1[0]);
			System.out.println(operand1);
			String operator=arr1[1];
			System.out.println(operator);
			
			int operand2=Integer.parseInt(arr1[2]);
			System.out.println(operand2);
			switch(operator) {
			case "+":info1=(operand1+operand2);break;
			case "-":info1=(operand1-operand2);break;
			case "*":info1=operand1*operand2;break;
			case "/":info1=operand1/operand2;break;
			case "%":info1=operand1%operand2;break;
			}
			System.out.println(info1);
			info2=String.valueOf(info1);
			f2.write(info2);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.close();
		
		
	}

}
