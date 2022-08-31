import java.util.Date;

    public class Vehicle extends Automobile{  
    public int      length;
    public int      width;
    public String   color;
    public Vehicle(){
       length = 0;
       width = 0;
       color = "White";
       manufactureCompany ="notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided" ;
    }
    public Vehicle(int length ,int width,String   color ){
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