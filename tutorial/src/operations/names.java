package operations;

import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname = scanner.nextLine();

        System.out.println("Enter second name");
        String secondname = scanner.nextLine();

        System.out.println("Enter third name");
        String thirdname = scanner.nextLine();


        String fullname = firstname + " " + secondname + " " + thirdname;


        System.out.println("My full name is "+ fullname);

    }
}
