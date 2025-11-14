public class class_6 {
    public static void main(String[] args) {
        int x = 10;
        
        System.out.println("Original value of x: " + x);
        System.out.println("Value of x after post-increment: " + (x++));
        System.out.println("Value of x after post-increment operation: " + x);
        System.out.println("Value of x after pre-increment: " + (++x));
        System.out.println("Value of x after pre-increment operation: " + x);
        System.out.println("Value of x after post-decrement: " + (x--));
        System.out.println("Value of x after post-decrement operation: " + x);
        System.out.println("Value of x after pre-decrement: " + (--x));
        System.out.println("Value of x after pre-decrement operation: " + x);
    }
}