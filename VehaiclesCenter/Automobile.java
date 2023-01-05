    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;
    public  class Automobile {
    protected      Engine    engine; 
    protected      String    manufactureCompany;
    protected      String    model ;
    protected      String    plateNum ;
    protected      String    bodySerailNum;
    protected      Date      manufactureDate;
    protected      GearType  gearType;
    
    public void setManufactureDate(Date manufactureDate) {
      this.manufactureDate = manufactureDate;
    }
    
    public Date getManufactureDate() {
      return manufactureDate;
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
    
    public GearType getGearType() {
     return gearType;
    }
    
    public void setGearType(GearType gearType) {
      this.gearType = gearType;
    }
    }
     
    