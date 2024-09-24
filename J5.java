class Box{
     double width;
     double height;
     double depth;}

public class J5{
    public static void main(String[] args){
    Box box1 = new Box();
    double vol;
    box1.width=10;
    box1.height=20;
    box1.depth=15;
    vol=box1.width*box1.height*box1.depth;
    System.out.println(vol);}}