import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        int number,sum = 0;
        System.out.print("Enter a number to get digits' sum: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }

        System.out.printf("Sum of digits: %d", sum);
    }

}
