import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //contains all the tasks LIFO
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).forEach(tasks::push);
    }
}
