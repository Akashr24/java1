package pkg1;

class Counter{
   
    static int count = 0;
    public Counter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    static {
        System.out.println("Static block executed. Initial count is: " + count);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.getCount());
    }
}