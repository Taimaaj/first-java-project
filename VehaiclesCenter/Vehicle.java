    import java.util.Date;
    public class Vehicle extends Automobile{  
    public double   length;
    public double   width;
    public String   color;
    public FuelType fuelType;
    public  GearType  gearType;
    public Vehicle(){
       length = 0.0;
       width = 0.0;
       color = "White";
       manufactureCompany ="notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided";
       plateNum = "notdecided";
    }
    public Vehicle(int length ,int width,String color){
      this.length = length;
      this.width = width;
      this.color = color;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum = bodySerailNum;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
      public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }
     public double getLength() {
    return length;
    }
    public void setLength(double length) {
     this.length = length;
    }
    public double getWidth() {
    return width;
    }
    public void setWidth(double width) {
    this.width = width;
    }
    public String getColor() {
    return color;
    }
    public void setColor(String color) {
    this.color = color;
    }
    public void print() {
    System.out.println("--- Vehicle ---");
    System.out.println("Manufacture company: " + this.getManufactureCompany());
    System.out.println("Manufacture date: " + this.getManufactureDate());
    System.out.println("Model: " + this.getModel());
    System.out.println("Plate number: " + this.getPlateNum());
    System.out.println("Gear type: " + this.getGearType());
    System.out.println("Body serial number: " + this.getBodySerialNum());
    System.out.println("Length: " + this.getLength());
    System.out.println("Width: " + this.getWidth());
    System.out.println("Color: " + this.getColor());
    }
    }