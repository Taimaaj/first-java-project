import java.util.Date;
public class Engine
{
    public String  Manufactur;  
    public  Date  ManufactureDate;
    public String  Model;
    public int Capacity;
    public  int  Cylinders;
    
    public Engine()
    {
         Manufactur= null;
         ManufactureDate=null;
         Model=null;
         Capacity=0;
         Cylinders=0;
    }
    
    
     public Engine(String  Manufactur, Date  ManufactureDate,Date Model,int Capacity,int  Cylinders)
     {
        Manufactur= Manufactur;
        ManufactureDate= ManufactureDate;
        Model=Model;
        Capacity= Capacity;
        Cylinders= Cylinders;

    } 
    
    
    
    
    
}

