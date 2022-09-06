     import java.util.Date;
     public class Motorcycle extends Automobile{
     public  double tierDiameter;
     public  double length;
     public Motorcycle(){
       tierDiameter = 0.0;
       length = 0.0;
       manufactureCompany = "notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided" ;
       plateNum = "notdecided";
     }
     public Motorcycle(double tierDiameter,double length){
      this.tierDiameter = tierDiameter;
      this.length = length;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum = bodySerailNum;
     }
     }
