import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class voina_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds-- > 0){

            int firstCard = firstPlayer.iterator().next();
            firstPlayer.remove(firstCard);

            int secondCard = secondPlayer.iterator().next();
            secondPlayer.remove(secondCard);

            if (firstCard > secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else if (secondCard > firstCard){
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
            if(firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }
        }

        if(firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
