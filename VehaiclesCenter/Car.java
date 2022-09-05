    import java.util.Date;
    public class Car extends Vehicle{
    public  int      chairNum;
    public  boolean  isFurnitreLeather;
      public Car(){
       chairNum = 5;
       isFurnitreLeather = false;
       length = 0.0;
       width = 0.0;
       color = "White";
       manufactureCompany ="notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided" ;
       plateNum = "notdecided";
    }
    public Car(int chairNum,boolean isFurnitreLeather){
      this.chairNum = chairNum ;
      this.isFurnitreLeather = isFurnitreLeather;
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
