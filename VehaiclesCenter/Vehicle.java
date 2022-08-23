public class Vehicle extends Automobile
{  public int length;
    public int  width;
    public String color;
    
    public Vehicle()
   {
      length=0;
      width=0;
      color=null;
      manufactureCompany = null;
      manufactureDate = null;
      model = null;
      plateNum = 0;
      bodySerailNum = 0;
   }
   
   
    public Vehicle(int length ,int width )
   {
       length = length;
       width = width;
       color = color;
       manufactureCompany = manufactureCompany;
       manufactureDate = manufactureDate;
       model = model;
       plateNum =  plateNum;
       bodySerailNum = bodySerailNum;
   }
}