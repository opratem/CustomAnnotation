import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try{
            checkAge(age);
        }catch(Exception e){
            System.out.println("A problem occurred" +e);
        }
        finally {
            scanner.close();
            System.out.println("Goodbye!");
        }
    }
    //Method to check if the age entered is valid i.e. 18 and above
    public static void checkAge(int age) throws AgeException{

        if(age < 18){
            throw new AgeException("\n" +"You must be 18+ to sign up");
        }
        else{
            System.out.println("You are now signed up!");
        }
    }
}
