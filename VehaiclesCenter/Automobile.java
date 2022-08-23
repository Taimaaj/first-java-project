import java.util.Date;

public class Automobile
{
    Engine e; 
    public String manufactureCompany;
    public  Date manufactureDate;
    public String model ;
    public int plateNum ;
    public int bodySerailNum;
    
    public Automobile()
    {
       manufactureCompany = null;
      manufactureDate = null;
        model = null;
        plateNum = 0;
       bodySerailNum = 0;
    }
    
    public Automobile(String manufactureCompany ,Date manufactureDate,String model , int  plateNum ,int bodySerailNum )
    {
      manufactureCompany = manufactureCompany;
      manufactureDate=manufactureDate;
          model=model;
          plateNum=  plateNum;
        bodySerailNum= bodySerailNum;
    }
    
    
    
    
    
}
