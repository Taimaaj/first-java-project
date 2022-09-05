    import java.util.Date;
    public class Engine{
    public  String     manufactur;  
    public  Date       manufactureDate;
    public  String     model;
    public  int        capacity;
    public  int        cylinders;
    private FuelType   fuelType;
    public Engine() {
         manufactur = "notdecided";
         manufactureDate = new Date(01-01-1970);
         model = "notdecided";
         capacity = 0;
         cylinders = 0;
         fuelType = fuelType.UNDEFINED;
        }
    public Engine(String  manufactur, Date  manufactureDate,String model,int capacity,int cylinders,FuelType fuelType){
       this.manufactur = manufactur;
       this.manufactureDate = manufactureDate;
       this.model = model;
       this.capacity = capacity;
       this.cylinders = cylinders;
       this.fuelType = fuelType;
    }   
    }

