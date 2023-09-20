import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int numThree = scanner.nextInt();
        int numFour = scanner.nextInt();
        int numFive = scanner.nextInt();
        int result = numOne + numTwo + numThree + numFour + numFive;
        int avg = result / 5;
        System.out.println("The average number of the numbers is: " + avg);
    }
}
