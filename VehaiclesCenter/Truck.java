
    public class Truck extends Vehicle{
    public double freeWight;
    public double fullWight;
    public Truck(){
       freeWight = 0.0;
       fullWight = 0.0;
       length = 0;
       width = 0;
       color="";
       manufactureCompany = "" ;
       manufactureDate = null;
       bodySerailNum = "";
       model =  ""  ;
       plateNum  =   "" ;
    }

    public Truck(double freeWight,double fullWight)
    { 
      this.freeWight = freeWight;
      this.fullWight = fullWight;
      this.length = length;
      this.width = width;
      this.color = color;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum =  bodySerailNum;
    }
}