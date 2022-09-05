    import java.util.Date;
    public class Truck extends Vehicle{
    public double freeWight;
    public double fullWight;
    public Truck(){
       freeWight = 0.0;
       fullWight = 0.0;
       length = 0;
       width = 0.0;
       color = "White";
       manufactureCompany = "notdecided";
       manufactureDate = new  Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided";
       plateNum = "notdecided";
     }
    public Truck(double freeWight,double fullWight){ 
      this.freeWight = freeWight;
      this.fullWight = fullWight;
      this.length = length;
      this.width = width;
      this.color = color;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum = bodySerailNum;
    }
}