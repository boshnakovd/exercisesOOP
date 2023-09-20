import java.util.*;

public class softuni_party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();
        String guestId = scanner.nextLine();
        while(!guestId.equals("PARTY")){
            if (Character.isDigit(guestId.charAt(0)))
                vipGuests.add(guestId);
            else{
                regularGuests.add(guestId);
            }
            guestId=scanner.nextLine();
        }
        guestId = scanner.nextLine();

        while (!guestId.equals("END")) {
            if (Character.isDigit(guestId.charAt(0))) {
                vipGuests.remove(guestId);
            } else {
                regularGuests.remove(guestId);
            }

            guestId = scanner.nextLine();
        }
        System.out.println(vipGuests.size() + regularGuests.size());
        vipGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);
        }
    }

