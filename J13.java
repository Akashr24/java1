package pkg1;
class Human{
    public void job(){
        System.out.println("Working Professional");}}
class Teacher extends Human{
    public void job(){                 
        System.out.println("Teacher");}}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");}}

public class J13 {

	public static void main(String[] args) {
		    Human amar=new Human();
	        Teacher babu =new Teacher();
	        Doctor chandra=new Doctor();
	        Human dinesh = new Doctor();  //which method will be called ?
	        amar.job();
	        babu.job();
	        chandra.job();
	        dinesh.job();}}
	


