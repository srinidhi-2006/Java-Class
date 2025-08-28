import java.util.Scanner;
class squaren{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        int n= num * num;

        System.out.println("Square = " + n);
        
    }
}
