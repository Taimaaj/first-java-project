    import java.util.Date;
    public class Engine{
    public  String     manufactur;  
    public  String     manufactureDate;
    public  String     model;
    public  int        capacity;
    public  int        cylinders;
    public FuelType   fuelType;
    public Engine() {
         manufactur = "notdecided";
         manufactureDate ="";
         model = "notdecided";
         capacity = 0;
         cylinders = 0;
         fuelType = fuelType.UNDEFINED;
        }
    public Engine(String  manufactur, String  manufactureDate,String model,int capacity,int cylinders,FuelType fuelType){
       this.manufactur = manufactur;
       this.manufactureDate = manufactureDate;
       this.model = model;
       this.capacity = capacity;
       this.cylinders = cylinders;
       this.fuelType = fuelType;
    }   
    public String getmanufactur() {
        return manufactur;
    }
    public void setManufacture(String manufacture) {
        this.manufactur = manufacture;
    }
    public String getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public void print() {
    System.out.println("--- Engine ---");
    System.out.println("Manufacture: " + this.getmanufactur());
    System.out.println("Manufacture date: " + this.getManufactureDate());
    System.out.println("Model: " + this.getModel());
    System.out.println("Capacity: " + this.getCapacity());
    System.out.println("Cylinders: " + this.getCylinders());
    System.out.println("Fuel type: " + this.getFuelType());
    }
    }  
    