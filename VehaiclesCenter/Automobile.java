import java.util.Date;
    public  class Automobile {
    public  Engine    engine; 
    public  String    manufactureCompany;
    public  String    model ;
    public  String    plateNum ;
    public  String    bodySerailNum;
    public  Date      manufactureDate;
    public  GearType  gearType;
    public Automobile(){
       manufactureCompany ="notdecided";
       manufactureDate = null;
       bodySerailNum = "notdecided";
       model = "notdecided" ;
    }
    public Automobile(String manufactureCompany ,Date manufactureDate,String model ,String plateNum ,String bodySerailNum ){
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum =  bodySerailNum;
    } 
    }