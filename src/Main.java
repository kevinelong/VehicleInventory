import java.util.Scanner;

class Vehicle {
    //instance variable AKA properties
    private long vehicleId;//    vehicleId - a long (ex: 101121)
    private String makeModel;    //    makeModel - a string (ex: Ford Explorer)
    private String color;    //    color - a string (ex: Red)
    private long odometerReading;    //    odometerReading - an int (ex: 32775)
    private double price;    //    price - a float (ex: 12250.00) (no Lamborghinis here!)

    //Constructor
    Vehicle(
            long vehicleId,//    vehicleId - a long (ex: 101121)
            String makeModel,    //    makeModel - a string (ex: Ford Explorer)
            String color,    //    color - a string (ex: Red)
            long odometerReading,    //    odometerReading - an int (ex: 32775)
            double price    //    price - a float (ex: 12250.00) (no Lamborghinis here!)
    ) {
        this.vehicleId = vehicleId; //    vehicleId - a long (ex: 101121)
        this.makeModel = makeModel;    //    makeModel - a string (ex: Ford Explorer)
        this.color = color;    //    color - a string (ex: Red)
        this.odometerReading = odometerReading;    //    odometerReading - an int (ex: 32775)
        this.price = price;    //    price - a float (ex: 12250.00) (no Lamborghinis here!)
    }

    //GETTERS
    public long getVehicleId(){
        return this.vehicleId;
    }//    vehicleId - a long (ex: 101121)
    public String getMakeModel(){
        return this.makeModel;
    }    //    makeModel - a string (ex: Ford Explorer)
    public String getColor(){
        return this.color;
    }    //    color - a string (ex: Red)
    public long getOdometerReading(){
        return this.odometerReading;
    }    //    odometerReading - an int (ex: 32775)
    public double getPrice(){
        return this.price;
    }    //    price - a float (ex: 12250.00) (no Lamborghinis here!)
    //SETTERS
    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }//    vehicleId - a long (ex: 101121)
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }    //    makeModel - a string (ex: Ford Explorer)
    public void setColor(String color) {
        this.color = color;
    }    //    color - a string (ex: Red)
    public void setOdometerReading(long odometerReading){
        this.odometerReading = odometerReading;
    }    //    odometerReading - an int (ex: 32775)
    public void setPrice(double price){
        this.price = price;
    };    //    price - a float (ex: 12250.00) (no Lamborghinis here!)
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
            new Vehicle(101121,"Ford Explorer","Red",45000,13500),
                new Vehicle(101122,"Toyota Camry","Blue",60000,11000),
                new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700),
                new Vehicle(101124,"Honda Civic","White",70000,7500),
                new Vehicle(101125,"Subaru Outback","Green",55000,14500),
                new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000)
        };
        int counter = vehicles.length;

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
        while(command != 6){
            System.out.println(prompt);
            command = in.nextInt();
        }

        System.out.println("Bye Bye!!!");
    }
}