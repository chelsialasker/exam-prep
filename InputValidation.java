import java.util.Scanner;

public class InputValidation {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int number = getValidInt(scanner, "Enter a whole number: ");
double price = getValidDouble(scanner, "Enter a price: ");
String name = getValidString(scanner, "Enter your name: ");

System.out.println("\nYou entered:");
System.out.println("Number: " + number);
System.out.println("Price: " + price);
System.out.println("Name: " + name);

scanner.close();
}

// Keeps asking until the user types a valid whole number
public static int getValidInt(Scanner scanner, String prompt) {
int value = 0;
boolean valid = false;

while (!valid) {
System.out.print(prompt);
if (scanner.hasNextInt()) {
value = scanner.nextInt();
valid = true;
} else {
System.out.println("Invalid input. Please enter a whole number.");
scanner.next(); // clear the bad input
}
}
return value;
}

// Keeps asking until the user types a valid decimal number
public static double getValidDouble(Scanner scanner, String prompt) {
double value = 0;
boolean valid = false;

while (!valid) {
System.out.print(prompt);
if (scanner.hasNextDouble()) {
value = scanner.nextDouble();
valid = true;
} else {
System.out.println("Invalid input. Please enter a number (e.g. 12.50).");
scanner.next();
}
}
return value;
}

// Keeps asking until the user types something (not blank)
public static String getValidString(Scanner scanner, String prompt) {
String value = "";
boolean valid = false;

scanner.nextLine(); // clear leftover newline from previous nextInt/nextDouble
while (!valid) {
System.out.print(prompt);
value = scanner.nextLine().trim();
if (!value.isEmpty()) {
valid = true;
} else {
System.out.println("Input cannot be blank. Try again.");
}
}
return value;
}
}
