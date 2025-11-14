public class hw_2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for(int i = 0 ; i < 10; i++)
        {
            arr[i] = (i + 1) * (i + 1);
        }

        System.out.println("Squares of numbers from 1 to 10:");
        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}