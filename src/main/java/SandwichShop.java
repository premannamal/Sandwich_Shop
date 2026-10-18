import java.util.*;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float regular_base_price = 5.45f;
        float large_base_price = 8.95f;
        float sandwich_cost = 0.0f;
        System.out.println("1:Regular:base price $5.45");
        System.out.println("2. Large: base price $8.95");
        System.out.print("Please enter the size of sandwich (1 or 2):");
        int response = scanner.nextInt();
        System.out.println("Loaded regular sandwich $1 extra");
        System.out.println("Large sandwich $1.75 extra");
        scanner.nextLine();
        System.out.print("Would you like the sandwich loaded(yes/no)");
        String loaded_response = scanner.nextLine();
        if ( loaded_response.equals("yes")) {
            regular_base_price = 6.45f;
            large_base_price = 9.95f; }

        //System.out.print("Loaded Response = :" + loaded_response );

        System.out.print("Please enter your age:");
        int age = scanner.nextInt();

        //System.out.println("Age = " + age);
        //System.out.println("Response = " + response);

        if (response == 1) {
            sandwich_cost = regular_base_price;
        } else if (response == 2) {
            sandwich_cost = large_base_price;
        }

        if (age <= 17) {
            sandwich_cost = sandwich_cost * (1.0f - 0.10f);
        } else if (age >= 65) {
            sandwich_cost = sandwich_cost * (1.0f - 0.20f);
        }

        // Calculate sandwich cost
        System.out.println("Cost of the sandwich " + sandwich_cost);
    }
}


