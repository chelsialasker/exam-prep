# exam-prep
LOOP: 
public class Loops {

public static void main(String[] args) {
forLoopExample();
whileLoopExample();
doWhileLoopExample();
nestedLoopExample();
}

public static void forLoopExample() {
System.out.println("--- For Loop (1 to 5) ---");
for (int i = 1; i <= 5; i++) {
System.out.println("Count: " + i);
}
}

public static void whileLoopExample() {
System.out.println("\n--- While Loop (countdown from 5) ---");
int i = 5;
while (i > 0) {
System.out.println("Countdown: " + i);
i--;
}
}

public static void doWhileLoopExample() {
System.out.println("\n--- Do-While Loop (runs at least once) ---");
int i = 0;
do {
System.out.println("Runs even if condition is false: " + i);
i++;
} while (i < 3);
}

public static void nestedLoopExample() {
System.out.println("\n--- Nested Loop (multiplication table 1-3) ---");
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 3; j++) {
System.out.print((i * j) + "\t");
}
System.out.println();
}
}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
