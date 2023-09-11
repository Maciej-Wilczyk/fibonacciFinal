public class Fibonacci {
    public static void main(String[] args) {
        int n = 57;
        fib(n);
        System.out.println("algorytm się zakończył");
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
