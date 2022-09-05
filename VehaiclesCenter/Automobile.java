    import java.util.Date;
    public  class Automobile {
    public   Engine    engine; 
    public   String    manufactureCompany;
    public   String    model ;
    public   String    plateNum ;
    public   String    bodySerailNum;
    public   Date      manufactureDate;
    private  GearType  gearType;
    public Automobile(){
       manufactureCompany = "notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided";
       plateNum = "notdecided";
       gearType = gearType.UNDECIDED;   
      }
    public Automobile(String manufactureCompany ,Date manufactureDate,String model,String plateNum,String bodySerailNum,GearType gearType){
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum = bodySerailNum;
      this.gearType = gearType;
    } 
    }