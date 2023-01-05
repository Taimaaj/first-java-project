    import java.util.Date;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;
    public class Engine{
    public  String     manufactur;  
    public  Date       manufactureDate;
    public  String     model;
    public  int        capacity;
    public  int        cylinders;
    public FuelType    fuelType;
    
    public Engine() {
         manufactur = "notdecided";
         manufactureDate =new Date(01-01-1970);
         model = "notdecided";
         capacity = 0;
         cylinders = 0;
         fuelType = fuelType.UNDEFINED;
    }

    public Engine(String  manufactur, String model,Date  manufactureDate,int cylinders,int capacity,FuelType fuelType){
       this.manufactur = manufactur;
       this.manufactureDate = manufactureDate;
       this.model = model;
       this.capacity = capacity;
       this.cylinders = cylinders;
       this.fuelType = fuelType;
    }   
    
    public String getManufactur() {
        return manufactur;
    }
    
    public void setManufacture(String manufacture) {
        this.manufactur = manufacture;
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
    
    public void setManufactureDate( Date manufactureDate)  {
      this.manufactureDate = manufactureDate;
    }
    
    public Date getManufactureDate() {
        return manufactureDate;
    }
    
    public void print() throws ParseException {
        System.out.println("Manufacture: " + this.getManufactur());
        System.out.println("Manufacture date: " + this.getManufactureDate());
        System.out.println("Model: " + this.getModel());
        System.out.println("Capacity: " + this.getCapacity());
        System.out.println("Cylinders: " + this.getCylinders());
        System.out.println("Fuel type: " + this.getFuelType());
    }
    }  
    