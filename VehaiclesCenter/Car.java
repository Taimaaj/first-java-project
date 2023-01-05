    import java.util.Scanner;
    import java.util.Date;
    public class Car extends Vehicle{
    public  int      chairNum;
    public  boolean  isFurnitreLeather;
    
    public Car(){
       manufactureCompany ="notdecided";
       manufactureDate = new Date(01-01-1970);
       bodySerailNum = "notdecided";
       model = "notdecided" ;
       length = 0.0;
       width = 0.0;
       color = "White";
       chairNum = 5;
       isFurnitreLeather = false;
    }
    
    public Car(String manufactureCompany ,Date manufactureDate,String model,String plateNum,String bodySerailNum,GearType gearType,int length ,int width,String color, int chairNum,boolean isFurnitreLeather) {
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum =  bodySerailNum;
      this.gearType = gearType;
      this.length = length;
      this.width = width;
      this.color = color;
      this.chairNum = chairNum ;
      this.isFurnitreLeather =  isFurnitreLeather;
    }
    
    public int getChairNum() {
     return chairNum;
    }
    
    public void setChairNum(int chairNum) {
      this.chairNum = chairNum;
    }
    
    public void setIsFurnitureLeather(boolean  isFurnitreLeather) {
      this.isFurnitreLeather =  isFurnitreLeather;
    }
    
    public boolean getIsFurnitureLeather() {
      return isFurnitreLeather;
     }
    
    public void print() throws java.text.ParseException {
        System.out.println("Manufacture company: " + this.getManufactureCompany());
        System.out.println("Model: " + this.getModel());
        System.out.println("Plate number: " + this.getPlateNum());
        System.out.println("Gear type: " + this.getGearType());    
        System.out.println("Manufacture company: " + this.getManufactureCompany());
        System.out.println("Manufacture date: " + this.getManufactureDate());
        System.out.println("Model: " + this.getModel());
        System.out.println("Plate number: " + this.getPlateNum());
        System.out.println("Body serial number: " + this.getBodySerialNum());
        System.out.println("Length: " + this.getLength());
        System.out.println("Width: " + this.getWidth());
        System.out.println("Color: " + this.getColor());
        System.out.println("Chair number: " + this.getChairNum());
        System.out.println("Is furniture leather: " + this.getIsFurnitureLeather());
     }
    }

