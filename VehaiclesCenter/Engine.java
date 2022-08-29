import java.util.Date;
    public class Engine{
    public String     manufactur;  
    public Date       manufactureDate;
    public String     model;
    public int        capacity;
    public int        cylinders;
    public FuelType   FuelType;

    public Engine() {
         manufactur= null;
         manufactureDate=null;
         FuelType model=null;
         capacity=0;
         cylinders=0;
    }
    
     public Engine(String  manufactur, Date  manufactureDate,Date model,int capacity,int cylinders){
       this.manufactur= manufactur;
       this.manufactureDate= manufactureDate;
       model=model;
       this. capacity= capacity;
       this. cylinders= cylinders;

    }   
    }

