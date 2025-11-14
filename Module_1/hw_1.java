import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if(n1 > n2) {
            System.out.println("First number is greater");
        } else if(n1 < n2) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
