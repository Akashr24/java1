package pkg1;
	class Outer1{
		void display() {
			System.out.println("Outer class display method");}
		class Inner{
			void display() {
				System.out.println("Inner class display method");}}}

	public class Ioclasses {
		public static void main(String[] args) {
			Outer1 o1=new Outer1();
			o1.display();
			Outer1.Inner i1=o1.new Inner();    
			i1.display();}}

