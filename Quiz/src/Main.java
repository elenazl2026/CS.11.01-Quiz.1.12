import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        String age2 = "" + age;
        System.out.println("Please enter your first name: ");
        firstName = scanner.next();
        String firstName2 = "" + firstName;
        System.out.println("Please enter your favorite food: ");
        favoriteFood = scanner.next();
        favoriteFood = scanner.nextLine();
        System.out.println("First Name: " + firstName + "\nAge: " + age + "\nfavoriteFood: " + favoriteFood);


    }
}
