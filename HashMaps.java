import java.util.HashMap;
import java.util.Scanner;

public class HashMaps{
    public static void main(String[] args) {
        String letter;
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        while (true) {
            System.out.println("");
            System.out.println("-------------------");
            System.out.println("A. Add number");
            System.out.println("B. Remove number");
            System.out.println("C. Display numbers");
            System.out.println("D. Clear numbers");
            System.out.println("E. Exit");
            System.out.print("Select a menu: ");
            letter = scan.next();
            if (letter.equalsIgnoreCase("A")) {
                System.out.print("A. Add a number: ");
                int add = scan.nextInt();
                int flag = 0;
                for (int i = 2; i < add / 2; i++) {
                    if (add % i == 0) {
                        flag++;
                        break;
                    }
                }
                if (flag==0) {
                    System.out.println("Sorry, the inputted number is a prime number");
                } else {
                    numbers.put("num",add);
                    System.out.println("Succesfully added!");
                }
            } else if (letter.equalsIgnoreCase("B")) {
                System.out.print("B. Remove a number: ");
                int input = scan.nextInt();
                numbers.entrySet().removeIf(entry -> entry.getKey().equals(input));
                System.out.println("Succesfully deleted!");
            } else if (letter.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("Display Numbers");
                for (String i : numbers.keySet()) {
                    System.out.println(numbers.get(i)); 
                  }
            } else if (letter.equalsIgnoreCase("D")) {
                System.out.println("");
                System.out.println("Cleared");
                numbers.clear();
            } else if (letter.equalsIgnoreCase("E")) {
                System.out.print("Terminated!");
                System.exit(0);
            }
        }
    }

}