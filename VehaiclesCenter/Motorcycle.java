    import java.util.Date;
    public class Motorcycle extends Automobile{
    public  double tierDiameter;
    public  double length;
    
    public Motorcycle(){
       manufactureCompany = "notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided" ;
       plateNum = "notdecided";
       tierDiameter = 0.0;
       length = 0.0;
     }
     
    public Motorcycle(String manufactureCompany ,Date manufactureDate,String model,String plateNum,String bodySerailNum,GearType gearType ,double tierDiameter,double length){
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum = bodySerailNum;
      this.tierDiameter = tierDiameter;
      this.length = length;
    }
    
    public double getTierDiameter() {
         return tierDiameter;
     }
     
    public void setTierDiameter(double tierDiameter) {
         this.tierDiameter = tierDiameter;
     }
     
    public double getLength() {
         return length;
     }
     
    public void setLength(double length) {
         this.length = length;
     }
     
       public void print() {
        System.out.println("Manufacture company: " + this.getManufactureCompany());
        System.out.println("Manufacture date: " + this.getManufactureDate());
        System.out.println("Model: " + this.getModel());
        System.out.println("Plate number: " + this.getPlateNum());
        System.out.println("Gear type: " + this.getGearType());
        System.out.println("Body serial number: " + this.getBodySerialNum());
        System.out.println("Tier diameter: " + this.getTierDiameter());
        System.out.println("Length: " + this.getLength());
    }
    }
