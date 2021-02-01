import java.util.Scanner;

public class Task3 {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = in.nextLine();
        System.out.print("How old are you: ");
        int age = in.nextInt();

        System.out.printf("Hello ! %s at the age of %d   \n", name, age);

    }
}