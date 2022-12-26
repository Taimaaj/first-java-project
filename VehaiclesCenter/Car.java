    import java.util.Scanner;
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
    }
    public Car( int chairNum,boolean isFurnitreLeather) {
      this.chairNum = chairNum ;
      this.isFurnitreLeather =  isFurnitreLeather;
      this.length = length;
      this.width = width;
      this.color = color;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum =  bodySerailNum;
    }
    Car(Car c){
       chairNum = c.chairNum;
       isFurnitreLeather =c.isFurnitreLeather;
       length = c.length;
       width = c.width;
       color = c.color;
       manufactureCompany =c.manufactureCompany;
       manufactureDate = c. manufactureDate;
       bodySerailNum = c.bodySerailNum;
       model = c.model ;
    }
    public int getChairNum() {
    return chairNum;
    }
    public void setChairNum(int chairNum) {
    this.chairNum = chairNum;
    }
    public boolean setIsFurnitureLeather() {
    Scanner scanner = new Scanner(System.in);
    String furnitureType = scanner.nextLine();
    if (furnitureType.equals("t")) {
      this.isFurnitreLeather = true;
    } else {
      this.isFurnitreLeather = false;
    }
    return isFurnitreLeather;
    }
    public void print() {
    System.out.println("--- Car ---");
    super.print(); 
    System.out.println("Chair number: " + this.getChairNum());
    System.out.println("Is furniture leather: " + this.setIsFurnitureLeather());
    }
    }
