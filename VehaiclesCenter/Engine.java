import java.util.Date;
    public class Engine{
    public String     manufactur;  
    public Date       manufactureDate;
    public String     model;
    public int        capacity;
    public int        cylinders;
    public FuelType   fuelType;

    public Engine() {
         manufactur = "notdecided";
         manufactureDate = null;
         model="notdecided";
         capacity=0;
         cylinders=0;
    }
    
     public Engine(String  manufactur, Date  manufactureDate,String model,int capacity,int cylinders){
       this.manufactur= manufactur;
       this.manufactureDate= manufactureDate;
       this.model = model;
       this. capacity= capacity;
       this. cylinders= cylinders;

    }   
    }

