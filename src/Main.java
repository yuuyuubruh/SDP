import factories.CasualOutfitFactory;
import factories.FormalOutfitFactory;
import factories.OutfitFactory;
import products.Bottom;
import products.Top;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Print your name: ");
        String name = scanner.nextLine();

        System.out.print("Print your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Print your gender: ");
        String gender = scanner.nextLine();

        System.out.print("Print your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n==================================");
        System.out.println("User Profile: " + name + " " + surname + " (" + gender + ", " + age + " y.o.)");
        System.out.println("==================================");

        System.out.print("Choose outfit style (1 - Casual, 2 - Formal): ");
        int choice = scanner.nextInt();

        OutfitFactory factory;

        if (choice == 1) {
            factory = new CasualOutfitFactory();
            System.out.println("\n--- CASUAL OUTFIT SELECTED ---");
        } else {
            factory = new FormalOutfitFactory();
            System.out.println("\n--- FORMAL OUTFIT SELECTED ---");
        }

        Top top = factory.createTop();
        Bottom bottom = factory.createBottom();

        top.wearTop();
        bottom.wearBottom();

        scanner.close();
    }
}