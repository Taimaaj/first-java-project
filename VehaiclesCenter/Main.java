import java.util.Scanner;
import java.lang.String;
import java.util.*; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{
    public   String      engineCompany;
    public   String      engineModel;
    public   Date        engineDate;
    public   int         engineCylenders;
    public   int         enginecapacity;
    public   double      vehicleLength;
    public   double      vehicleWidth;
    public   String      vehicleColor;
    public   FuelType    vehicleFuelType;
    public   GearType    vehicleGearType;
    public   String      automobileCompany;
    public   Date        automobileDate;
    public   String      automobileModel ;
    public   String      automobilePlateNum ;
    public   String      automobileBodySerailNum;
    public   Object      specialVar1;
    public   Object      specialVar2;
    public   Object      specialVar3; 
    public   String      date;
    List<Car> carList = new ArrayList<>();
    List<Truck> truckList = new ArrayList<>();
    List<Motorcycle> motorcycleList = new ArrayList<>();
    Scanner projectScanner = new Scanner (System.in);
    private int menuOption;
    
public void  flushVars() { 
        engineCompany =  "";
        engineModel = "";
        engineDate = new Date(01-01-1970);
        engineCylenders = 0;
        enginecapacity = 0;
        vehicleLength = 0.0; 
        vehicleWidth = 0.0;
        vehicleColor = "";
        vehicleFuelType =  vehicleFuelType.UNDEFINED;
        vehicleGearType = vehicleGearType.UNDECIDED;
        automobileDate = new Date(01-01-1970);
        automobileModel = "";
        automobilePlateNum = "";
        automobileBodySerailNum = "";
        specialVar1="";
        specialVar2="";
        specialVar3="";
}

public void fuelType(){
    String value = projectScanner.next();
    if  (value == "D" ){
     vehicleFuelType = FuelType.DIESEL;
    }else{
     vehicleFuelType = FuelType.GASOLINE;
    }          
}

public void gearType(){
    String value = projectScanner.next();
    if  (value == "N" ){
     vehicleGearType = GearType .NORMAL;
    }else{
     vehicleGearType = GearType .AUTOMATIC;
    }      
}

public void fillEngineInfo(){
    System.out.println(">Please enter the manufactur of the engine: ");    
    engineCompany = projectScanner.nextLine();
    System.out.println ( "Enter engine model: " );
    engineModel= projectScanner.nextLine();
    System.out.println ( "Enter engine date (yyyy-mm-dd): " );
    LocalDate engineDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
    engineDate = LocalDate.parse(projectScanner.nextLine());
    System.out.println(">Please enter the capacity of the engine: ");
    enginecapacity= projectScanner.nextInt();
    System.out.println(">Please enter the cylinders of the engine: ");
    engineCylenders= projectScanner.nextInt();
    System.out.println(">Please enter the FuelType of the engine( DIESEL[D] GASOLINE[G]): ");
    fuelType();    
}

public void addCar() {
            System.out.println ( "You picked Car!" );
            System.out.println("Let's add a new car to the vehicle center:");
            fillEngineInfo();
            System.out.println(">Please enter the manufactureCompany of car: ");
            automobileCompany= projectScanner.nextLine();
            System.out.println(">Please enter the plateNum of car: ");  
            automobilePlateNum = projectScanner.nextLine();
            System.out.println(">Please enter the bodySerailNum of car: ");
            automobilePlateNum= projectScanner.nextLine();            
            System.out.println(">Please enter the length of car : ");
            vehicleLength = projectScanner.nextInt();
            System.out.println(">Please enter the width of car: ");
            vehicleWidth = projectScanner.nextInt();
            System.out.println(">Please enter the color of car: ");
            vehicleColor= projectScanner.nextLine();
            System.out.println(">Please enter the GearType of car(NORMAL[N] AUTOMATIC [A] ): ");
            gearType();
            System.out.print(">Please enter chairNum of the car: ");
            specialVar1= projectScanner.nextInt();
            System.out.println(">Please enter if isFurnitreLeather of car (t/f): ");
            specialVar2=projectScanner.nextBoolean();
}    
    
public void addTruck() {
            System.out.println ( "You pickedTruck!" );
            System.out.println("Let's add a new Truck to the vehicle center:");
            fillEngineInfo();
            System.out.println(">Please enter the manufactureCompany of Truck: ");
            automobileCompany= projectScanner.nextLine();
            System.out.println(">Please enter the plateNum of Truck: ");  
            automobilePlateNum = projectScanner.nextLine();
            System.out.println(">Please enter the bodySerailNum of Truck: ");
            automobilePlateNum= projectScanner.nextLine();            
            System.out.println(">Please enter the length of Truck : ");
            vehicleLength = projectScanner.nextInt();
            System.out.println(">Please enter the width of Truck: ");
            vehicleWidth = projectScanner.nextInt();
            System.out.println(">Please enter the color of Truck: ");
            vehicleColor= projectScanner.nextLine();
            System.out.println(">Please enter the GearType of Truck(NORMAL[N] AUTOMATIC [A] ): ");
            gearType();
            System.out.println(">Please enter the freeWight of Truck: ");
            specialVar1= projectScanner.nextBoolean();
            System.out.println(">Please enter fullWight of Truck:");
            specialVar2=projectScanner.nextBoolean();
}    
            
public void addMotorcycle() {
            System.out.println ( "You picked Motorcycle!" );
            System.out.println("Let's add a new Motorcycle to the vehicle center:");
            fillEngineInfo();
            System.out.println(">Please enter the manufactureCompany of Motorcycle: ");
            automobileCompany= projectScanner.nextLine();
            System.out.println(">Please enter the plateNum of Motorcycle: ");  
            automobilePlateNum = projectScanner.nextLine();
            System.out.println(">Please enter the bodySerailNum of Motorcycle: ");
            automobilePlateNum= projectScanner.nextLine();     
            System.out.println(">Please enter the GearType of Motorcycle(NORMAL[N] AUTOMATIC [A] ): ");
            gearType();
            System.out.print(">Please enter tierDiameter of Motorcycle: ");
            specialVar1= projectScanner.nextBoolean();
            System.out.println(">Please enter length of Motorcycle: ");
            specialVar2=projectScanner.nextBoolean();
    }
    
public String modify(){
 
}

public String Search(){
    
}

public String printAll(){
    System.out.println("Please enter your Vehicle you want to show information ");
    System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
    menuOption= projectScanner.nextInt();
    switch (menuOption) {
    case 1:
     for(int i=0; i < carList.size(); i++){
         carList.get(i).print();
     }
    case 2:
         for(int i=0; i < truckList.size(); i++){
         truckList.get(i).print();
     }
    case 3:
      for(int i=0; i < motorcycleList.size(); i++){
         motorcycleList.get(i).print();
     }
 }
}
      
public void main(String args[])  throws java.text.ParseException {
       System.out.println("                           🏍 🚚 🚗 Welcom in vechicles world 🚗 🚚 🏍️    ");
       System.out.println("please Enter your name");
       String name = projectScanner.nextLine();
       System.out.println("Welcome dear "+name);
       System.out.println("");
       System.out.println("_______please enter your action:_______");
       System.out.println();
       System.out.println(">>>>1 Add Vehicle");
       System.out.println(">>>>2 Remove Vehicle");
       System.out.println(">>>>3 Show List of Vehicles with Details");
       System.out.println(">>>>4 Search");
       System.out.println(">>>>5 Insert");
       System.out.println(">>>>5 Modify");
       System.out.print("Choose Option ( 1 / 2 / 3/ 4/ 5 ): ");
       System.out.println();
       switch (menuOption) {
       case 1:
            System.out.println("please enter your Vehicle you want to add:");
            System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
            System.out.println();
       switch (menuOption ) {
        case 1:
             addCar();
             Engine engine = new Engine(engineCompany,engineModel,engineDate,engineCylenders,enginecapacity,vehicleFuelType);
             Car car = new Car(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum ,vehicleLength,vehicleColor,vehicleFuelType,vehicleGearType,vehicleColor,specialVar1,specialVar2);
             System.out.println("Car Creation and Addition Succeeded!");
             flushVars();
             break;
        case 2:
             addTruck();
             Truck truck = new Truck(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum ,vehicleLength,vehicleWidth,vehicleColor,vehicleFuelType,vehicleGearType,specialVar1,specialVar2);
             System.out.println("Truck Creation and Addition Succeeded!");
             flushVars();
              break;
        case 3:
             addMotorcycle();
             Motorcycle motorcycle = new Motorcycle(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum ,vehicleLength,vehicleWidth,vehicleColor,vehicleFuelType,vehicleGearType,specialVar1,specialVar2);
             System.out.println("Motorcycle Creation and Addition Succeeded!");
             flushVars();
          break;
        }
       case 2:
           Search();
       case 3:
            printAll();
       case 4:
           
       case 5:
 
               }
            }  
        }    



    
    
    
    
    
    
    
        
            
        
    
     


   
    
