import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        String letter;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
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
            try {
                if (letter.equalsIgnoreCase("A")) {
                    System.out.print("A. Add a number: ");
                    int add = scan.nextInt();
                    if (add >= 0) {
                        numbers.add(add);
                        System.out.println("");
                        System.out.println("Succesfully added!");
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.print("Input positive numbers only!");
                    }
                } else if (letter.equalsIgnoreCase("B")) {
                    System.out.print("B. Remove a number: ");
                    int input = scan.nextInt();
                    if (numbers.contains(input)){
                    numbers.removeIf(number -> number.equals(input));
                    System.out.println("");
                    System.out.println("Succesfully deleted!"); 
                    }else {
                        System.out.println("Inputted number is not on the list!");
                    }
                    
                    
                } else if (letter.equalsIgnoreCase("C")) {
                    System.out.println("");
                    System.out.println("Display Numbers");
                    if (numbers.isEmpty()){
                        System.out.println("No number added");
                    }else {
                    for (int i = 0; i < numbers.size(); i++) {
                        System.out.print(" " + numbers.get(i));
                    }
                }
                } else if (letter.equalsIgnoreCase("D")) {
                    System.out.println("");
                    System.out.println("Cleared");
                    numbers.clear();
                    System.out.println("");
                } else if (letter.equalsIgnoreCase("E")) {
                    System.out.print("Terminated!");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Please enter a number!");
                System.out.println("");
            }
    }
}
}