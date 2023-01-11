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

public FuelType  fuelType(String value){
    if (value.equals("D") || value .equals("d") || value .equals("diesel") || value.equals("Diesel")|| value.equals("DIESEL")){
        System.out.println ( "You picked Diesel" );    
        return FuelType.DIESEL;
    }else if(value .equals( "G") || value.equals("g") || value .equals( "gasloin" )|| value.equals("Gasloin")|| value.equals("GASOLINE")){
       System.out.println ( "You picked Gasoline" );   
       return FuelType.GASOLINE;
    }else{
      System.out.println ( "Unrecognized option" );    
      return FuelType.UNDEFINED;
    }
} 

public GearType gearType(String value){
    if (value.equals("N") || value .equals("n") || value .equals("normal") || value.equals("Normal")|| value.equals("NORMAL")){
      System.out.println ( "You picked Normal" );  
      return GearType .NORMAL;
    }else if (value.equals("A") || value .equals("a") || value .equals("Automatic") || value.equals("automatic")|| value.equals("AUTOMATIC")){
       System.out.println ( "You picked Automatic" );    
       return GearType .AUTOMATIC;
    }else{
        System.out.println ( "Unrecognized option" );    
        return GearType.UNDECIDED;
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
    vehicleFuelType = fuelType(projectScanner.next());    
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
            vehicleGearType = gearType(projectScanner.next());    
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
            vehicleGearType = gearType(projectScanner.next());    
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
            vehicleGearType = gearType(projectScanner.next());    
            System.out.print(">Please enter tierDiameter of Motorcycle: ");
            specialVar1= projectScanner.nextBoolean();
            System.out.println(">Please enter length of Motorcycle: ");
            specialVar2=projectScanner.nextBoolean();
    }
    
public void modify(){
    System.out.println("please enter the bodySerailNum you want to edit: ");
    automobileBodySerailNum= projectScanner.nextLine();   
    System.out.println("please enter new  bodySerailNum you want to replace: ");
    String userValue= projectScanner.next();
    Car newCar = new Car(); 
    for( int i = 0; i < carList.size(); i++){
        if(automobileBodySerailNum.equals(carList.get(i))){
        carList.set(i,newCar );
        }return;
    }
}

public void delete(){
    Object userValue= projectScanner.next();
    for (Car car :carList) {
       if(car.getPlateNum().equals(userValue) ) {
          carList.remove(userValue);
       }
    }
}

public void Search(){
  String searchPlateNum = projectScanner.next();
  System.out.println("please enter the vehicle  you want to search about: ");
  System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
  menuOption = projectScanner.nextInt();
    switch (menuOption) {
    case 1:
    for (Car car : carList) {
            if (car.getPlateNum().equals(searchPlateNum)) {
                System.out.println(car);
            }
    }
    case 2:
    for (Truck truck : truckList) {
            if (truck.getPlateNum().equals(searchPlateNum)) {
                System.out.println(truck);
            }
    }
    case 3:
    for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getPlateNum().equals(searchPlateNum)) {
                System.out.println(motorcycle);
            }
    }
  }
}

public void printAll() throws java.text.ParseException{
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

public void welcom(){
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
       System.out.println(">>>>6 Modify");
       System.out.println(">>>>7 Exit");
       System.out.print("Choose Option ( 1 / 2 / 3/ 4/ 5 /6 /7 ): ");
       System.out.println();
}

public  void  main(String args[])  throws java.text.ParseException {
       welcom();
       switch (menuOption) {
        case 1:
            System.out.println("please enter your Vehicle you want to add:");
            System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
            System.out.println();
        switch (menuOption ) {
         case 1:
             addCar();
             Engine engine = new Engine(engineCompany,engineModel,engineDate,engineCylenders,enginecapacity,vehicleFuelType);
             Car car = new Car(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum,vehicleGearType,vehicleLength,vehicleWidth,vehicleColor,(int)specialVar1,(boolean)specialVar2);
             System.out.println("Car Creation and Addition Succeeded!");
             flushVars();
             break;
         case 2:
             addTruck();
            // Truck truck = new Truck(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum ,vehicleGearType,vehicleLength,vehicleWidth,vehicleColor,specialVar1,specialVar2);
             System.out.println("Truck Creation and Addition Succeeded!");
             flushVars();
              break;
         case 3:
             addMotorcycle();
            // Motorcycle motorcycle = new Motorcycle(engine,automobileCompany,automobileDate,automobileModel,automobilePlateNum,automobileBodySerailNum ,vehicleGearType,specialVar1,specialVar2);
             System.out.println("Motorcycle Creation and Addition Succeeded!");
             flushVars();
          break;
         }
         case 2:
            delete();
         case 3:
              printAll();
         case 4:
             Search();
         case 5:
           
         case 6:
             modify();
         case 7:
             System.out.println("GoodBye");
             welcom();

         }
}  
}    



    
    
    
    
    
    
    
        
            
        
    
     


   
    
