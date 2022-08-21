import java.util.Date;

public class Automobile
{
    Engine e; 
    public String Manufacture_Company;
    public  Date Manufacture_date;
    public String model ;
    public int Plate_num ;
    public int Body_serail_num;
    
    public Automobile()
    {
        Manufacture_Company=null;
        Manufacture_date=null;
        model=null;
        Plate_num=0;
        Body_serail_num=0;
    }
    
    public Automobile(String Manufacture_Company, Date Manufacture_date,String model , int Plate_num,int Body_serail_num )
    {
          Manufacture_Company=Manufacture_Company;
          Manufacture_date=Manufacture_date;
          model=model;
          Plate_num= Plate_num;
        Body_serail_num= Body_serail_num;
    }
    
    
    
    
    
}
