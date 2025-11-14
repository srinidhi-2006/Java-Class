import java.util.Scanner;
public class class_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();
        if(number%2 == 0)
        {
            System.out.println("The Number is Even!!");
        }
        else 
        {
            System.out.println("The Number is Odd!!");
        }
    }
}
