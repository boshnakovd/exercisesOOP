import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }
    }
}
