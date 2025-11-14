import java.util.*;

class class_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2; 
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The sub of the numbers is " + sub);
        System.out.println("The mul of the numbers is " + mul);
        if(number2 != 0){
            System.out.println("The div of the numbers is " + div);
        }
        else{
            System.out.println("Zero Division Error!!");
        }
        sc.close();
    }
}
