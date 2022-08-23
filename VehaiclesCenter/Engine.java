import java.util.Date;
public class Engine
{
    public String  manufactur;  
    public  Date  manufactureDate;
    public String  model;
    public int capacity;
    public  int  cylinders;
    
    public Engine()
    {
         manufactur= null;
         manufactureDate=null;
         model=null;
         capacity=0;
         cylinders=0;
    }
    
    
     public Engine(String  manufactur, Date  manufactureDate,Date model,int capacity,int cylinders)
     {
       manufactur= manufactur;
       manufactureDate= manufactureDate;
        model=model;
        capacity= capacity;
        cylinders= cylinders;

    } 
    
    
    
    
    
}

