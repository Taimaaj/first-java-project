
public class Car extends Vehicle
{
    public int chairNum;
    public boolean  isFurnitreLeather;
 
     public Car()
    {
        chairNum=0;
        isFurnitreLeather =false;
        length=0;
       width=0;
       color=null;
        manufactureCompany = null;
      manufactureDate = null;
        model = null;
        plateNum = 0;
       bodySerailNum = 0;
    }
    
    public Car( int chairNum,boolean  isFurnitreLeather) 
    {
     chairNum = chairNum ;
      isFurnitreLeather =isFurnitreLeather ;
      length=length;
       width=width;
       color=color;
      manufactureCompany = manufactureCompany;
      manufactureDate=manufactureDate;
          model=model;
          plateNum=  plateNum;
        bodySerailNum= bodySerailNum;
    }
    
}
