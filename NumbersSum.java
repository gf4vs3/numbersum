import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            total += i;
        }

        // Display the sum
        System.out.println("The sum is: " + total);

        scanner.close();
    }
}
