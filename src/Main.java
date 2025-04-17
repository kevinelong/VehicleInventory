import java.util.Scanner;

public class Main {
    public static void listAllVehicles(Vehicle[] vehicles) {
        System.out.println("1. List All Vehicles:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%d: %s\n", i, vehicles[i]);
        }
    }

    public static void searchByMakeOrModel(Vehicle[] vehicles) {
        System.out.println("2. Search by Make/Model:");
    }

    public static void searchByPriceRange(Vehicle[] vehicles) {
        System.out.println("3. Search by Price Range:");
    }

    public static void searchByColor(Vehicle[] vehicles) {
        System.out.println("4. Search by Color:");
    }

    public static void addVehicle(Vehicle[] vehicles, int counter) {
        System.out.println("5. Add a Vehicle:");
        Vehicle v = new Vehicle(0,"Neo", "Black",0, -1);
        vehicles[counter] = v;
    }

    public static void main(String[] args) {

        int counter = 0;
        Vehicle[] vehicles = new Vehicle[20];

        vehicles[counter++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[counter++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[counter++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[counter++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[counter++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[counter++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        //heredoc style quotes in newer java
        String prompt = """
                        What do you want to do?
                        1 - List all vehicles
                        2 - Search by make/model
                        3 - Search by price range
                        4 - Search by color
                        5 - Add a vehicle
                        6 - Quit
                        Enter your command:
                """;

        Scanner in = new Scanner(System.in);
        int command = 0;

        //Near infinite loop?
        while (command != 6) {
            System.out.println(prompt);
            command = in.nextInt();
            switch (command) {
                case 1:
                    Main.listAllVehicles(vehicles);
                    break;
                case 2:
                    Main.searchByMakeOrModel(vehicles);
                    break;
                case 5:
                    Main.addVehicle(vehicles, counter++); //inc counter
                    break;
                default:
                    System.out.println("NO SUCH COMMAND AS: " + command);
            }
        }

        System.out.println("Bye Bye!!!");
    }
}