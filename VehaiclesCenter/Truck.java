
public class Truck extends Vehicle
{

public double freeWight;
public double fullWight;
  public Truck()
    {
    freeWight=0.0;
    fullWight=0.0;
    length=0;
       width=0;
       color=null;
        manufactureCompany = null;
      manufactureDate = null;
        model = null;
        plateNum = 0;
       bodySerailNum = 0;
}

public Truck(double freeWight,double fullWight)
    { 
    freeWight= freeWight;
    fullWight=fullWight;
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