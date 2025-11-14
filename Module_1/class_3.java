import java.util.Scanner;

public class class_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number = sc.nextInt();
        if(number > 0)
        {
            System.out.println("Positive number");
        }else if(number < 0)
        {
            System.out.println("Negative number");
        }else
        {
            System.out.println("Zero");
        }
    }
}