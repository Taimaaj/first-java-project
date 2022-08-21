public class Vehicle
{  public int length;
    public int  width;
    public String color;
    
    public Vehicle()
   {
       length=0;
       width=0;
       color=null;
        Manufacture_Company=null;
        Manufacture_date=null;
        model=null;
        Plate_num=0;
        Body_serail_num=0;
   }
   
    public Vehicle(int length ,int width )
   {
        length=length;
       width=width;
       color=color;
      Manufacture_Company=Manufacture_Company;
      Manufacture_date=Manufacture_date;
      model=model;
      Plate_num= Plate_num;
      Body_serail_num= Body_serail_num;
   }
}