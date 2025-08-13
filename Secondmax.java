import java.util.Scanner;

public class Secondmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        int num[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        if (n < 2) {
            System.out.println("Second largest number: -1");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                secondmax = max;
                max = num[i];
            } else if (num[i] > secondmax && num[i] != max) {
                secondmax = num[i];
            }
        }

        if (secondmax == Integer.MIN_VALUE) {
            System.out.println("Second largest number: -1");
        } else {
            System.out.println("Second largest number: " + secondmax);
        }
    }
}
