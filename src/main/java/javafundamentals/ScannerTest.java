package javafundamentals;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            int b = 0;
            for (int j = i; j >= 1; j--) {
                b = i+n;
            }
            System.out.println(b);
        }
    }
}
