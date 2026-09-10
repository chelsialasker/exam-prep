
## 📁 01-basics/
- `InputValidation.java` — Scanner input with validation loops (int, double, String)
- `Loops.java` — for, while, do-while, nested loops
- `Arrays.java` — arrays, ArrayList basics, looping through both
- `StringMethods.java` — trim, split, substring, format, equals vs equalsIgnoreCase

## 📁 02-oop/
- `ClassAndObjectBasics.java` — constructors, getters/setters, creating objects
- `Inheritance.java` — extends, super(), method overriding (Patient/Inpatient example)
- `Polymorphism.java` — overriding (runtime) vs overloading (compile-time)
- `Encapsulation.java` — private fields, validated setters (BankAccount example)

## 📁 03-collections/
- `ArrayListExamples.java` — add, remove, sort, search, loop
- `HashMapExamples.java` — put, get, containsKey, entrySet loop

## 📁 04-exceptions/
- `TryCatchExamples.java` — basic try-catch, multi-catch, try-catch-finally, custom exceptions

## 📁 05-testing/
- `JUnitBasics.java` — @Test, @BeforeEach, assertEquals, assertThrows, assertTrue/False

## 📁 06-menu-driven-programs/
- `ConsoleMenuTemplate.java` — switch-based menu loop skeleton for console apps

---

## 🔑 Quick Reminders
- **Validation loop pattern:** `while (!scanner.hasNextInt())` → clear bad input with `scanner.next()`
- **Inheritance:** `class Child extends Parent`, call `super(...)` in constructor, `@Override` to override methods
- **Custom exception:** `class MyException extends Exception { constructor calls super(message) }`
- **JUnit assertion order:** `assertEquals(expected, actual)` — expected comes first!
- **ArrayList vs HashMap:** ArrayList = ordered list, HashMap = key-value pairs
