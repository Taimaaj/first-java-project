    import java.util.Date;
    public  class Automobile {
    public   Engine    engine; 
    public   String    manufactureCompany;
    public   String    model ;
    public   String    plateNum ;
    public   String    bodySerailNum;
    public   Date      manufactureDate;
    public  GearType  gearType;
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
     public Engine getEngine() {
    return engine;
    }
    public void setEngine(Engine engine) {
     this.engine = engine;
    }
    public String getManufactureCompany() {
    return manufactureCompany;
    }
    public void setManufactureCompany(String manufactureCompany) {
     this.manufactureCompany = manufactureCompany;
    }
    public String getModel() {
     return model;
    }
    public void setModel(String model) {
     this.model = model;
    }
    public String getPlateNum() {
     return plateNum;
    }
    public void setPlateNum(String plateNum) {
     this.plateNum = plateNum;
    }
    public String getBodySerialNum() {
     return bodySerailNum;
    }
    public void setBodySerialNum(String bodySerialNum) {
     this.bodySerailNum = bodySerialNum;
    }
    public Date getManufactureDate() {
      return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
     this.manufactureDate = manufactureDate;
    }
    public GearType getGearType() {
     return gearType;
    }
    public void setGearType(GearType gearType) {
      this.gearType = gearType;
    }
      public void print() {
    System.out.println("--- Automobile ---");
    System.out.println("Manufacture company: " + this.getManufactureCompany());
    System.out.println("Model: " + this.getModel());
    System.out.println("Plate number: " + this.getPlateNum());
    System.out.println("Body serial number: " + this.getBodySerialNum());
    System.out.println("Manufacture date: " + this.getManufactureDate());
    System.out.println("Gear type: " + this.getGearType());
    }
    }
     
    