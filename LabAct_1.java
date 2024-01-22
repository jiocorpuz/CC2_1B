import java.util.Scanner;

public class LabAct_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chore Program!");

        String[] chores = {"Clean the kitchen", "Vacuum the living room", "Do the laundry", "Exit"};

        for (int i = 0; i < chores.length; i++) {
            System.out.println((i + 1) + ". " + chores[i]);
        }

        System.out.println("Please select a chore:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                cleanKitchen();
                break;
            case 2:
                vacuumLivingRoom();
                break;
            case 3:
                doLaundry();
                break;
            case 4:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
    public static void cleanKitchen() {
        System.out.println("\nCleaning the kitchen:");
        delay(1000);
        System.out.println("Step 1: Clear the countertops");
        delay(1000);
        System.out.println("Step 2: Wash the dishes");
        delay(1000);
        System.out.println("Step 3: Wipe down the surfaces");
        delay(1000);
        System.out.println("Step 4: Clean the stove and oven");
        delay(1000);
        System.out.println("Step 5: Scrub the sink");
        delay(1000);
        System.out.println("Step 6: Clean the refrigerator");
        delay(1000);
        System.out.println("Step 7: Sweep the floor");
        delay(1000);
        System.out.println("Step 8: Mop the floor");
        delay(1000);
        System.out.println("Step 9: Clean the windows");
        delay(1000);
        System.out.println("Step 10: Put everything back in its place");
        delay(1000);
    }

    public static void vacuumLivingRoom() {
        System.out.println("\nVacuuming the living room:");
        delay(1000);
        System.out.println("Step 1: Remove any obstacles from the floor");
        delay(1000);
        System.out.println("Step 2: Move furniture to access all areas");
        delay(1000);
        System.out.println("Step 3: Vacuum the floor");
        delay(1000);
        System.out.println("Step 4: Vacuum under the furniture");
        delay(1000);
        System.out.println("Step 5: Vacuum the upholstery");
        delay(1000);
        System.out.println("Step 6: Empty the vacuum cleaner");
        delay(1000);
        System.out.println("Step 7: Clean the vacuum filter");
        delay(1000);
        System.out.println("Step 8: Return furniture to its original position");
        delay(1000);
        System.out.println("Step 9: Put away the vacuum cleaner");
        delay(1000);
        System.out.println("Step 10: Enjoy your clean living room");
        delay(1000);
    }

    public static void doLaundry() {
        System.out.println("\nDoing the laundry:");
        delay(1000);
        System.out.println("Step 1: Sort the laundry by color and fabric type");
        delay(1000);
        System.out.println("Step 2: Pre-treat any stains");
        delay(1000);
        System.out.println("Step 3: Load the washing machine");
        delay(1000);
        System.out.println("Step 4: Add detergent and set the appropriate cycle");
        delay(1000);
        System.out.println("Step 5: Start the washing machine");
        delay(1000);
        System.out.println("Step 6: Transfer the clothes to the dryer or hang them to dry");
        delay(1000);
        System.out.println("Step 7: Set the appropriate drying cycle");
        delay(1000);
        System.out.println("Step 8: Start the dryer or hang the clothes to dry");
        delay(1000);
        System.out.println("Step 9: Fold or hang the dry clothes");
        delay(1000);
        System.out.println("Step 10: Put everything away");
        delay(1000);
    }
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
