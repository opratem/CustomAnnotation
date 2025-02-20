# Custom Exceptions in Java

This program demonstrates the use of **custom exceptions** in Java by implementing an `AgeException` to handle cases where a user enters an invalid age. 

## Files

- **`AgeException.java`**: Defines a custom exception class.
- **`Main.java`**: Implements the main logic to demonstrate exception handling.

## Objective

The goal of this program is to show how to create and use custom exceptions in Java. Instead of using built-in exceptions, we define our own exception class (`AgeException`) and use it to handle specific cases in our program.

## How It Works

1. The program prompts the user to enter their age.
2. It calls the `checkAge` method to validate the input.
3. If the age is below 18, an `AgeException` is thrown with a meaningful error message.
4. The exception is caught and handled in the `catch` block.
5. The `finally` block ensures resources (such as the `Scanner`) are properly closed.

## Code Explanation

### `AgeException.java`
Defines a custom exception by extending the `Exception` class.

```java
public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
