import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int result = firstNum * secondNum;
        System.out.print(firstNum + " * " + secondNum + " = " + result);
    }
}
