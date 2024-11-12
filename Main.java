package pkg1;

class Factorial {
    
    public int f(int n) {
        
        if (n == 1) {
            return 1;
        }
        
        return n * f(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int i =5;
        
        int result = factorial.f(i);
        System.out.println(result);
    }
}

