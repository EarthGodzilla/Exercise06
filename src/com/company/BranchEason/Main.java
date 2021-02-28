package com.company.BranchEason;
import java.util.*;

class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid intiger. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userInt;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid intiger. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userDouble;
    }

    public String promptstring(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = userInput;
        boolean isString = false;
        while (!isString) {
            try {
                userString = (String)userInput;
                isString = true;
            } catch (Exception e) {
                System.out.println(userInput + " is not a valid String. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userString;
    }

}
public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer");
        double aNumber2 = input.promptDouble("Enter an double");
        String aString= input.promptstring("Enter an String");

    }
}


