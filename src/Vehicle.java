public class Vehicle {
    //instance variable AKA properties AKA member variable
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

    public String toString(){
        return String.format(
                "%d %s %s %d %.2f",
                this.vehicleId,
                this.makeModel,
                this.color,
                this.odometerReading,
                this.price
        );
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
