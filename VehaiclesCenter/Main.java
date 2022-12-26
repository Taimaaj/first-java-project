import java.text.ParseException;

    import java.util.Scanner;
    import java.lang.String;
    import java.util.*; 
    import java.time.LocalDate;
    public class Main{
    public static void main(String args[])  {
       List<Car> carList = new ArrayList<Car>();
       List<Truck> truckList = new ArrayList<Truck>();
       List<Motorcycle> MotorcycleList = new ArrayList<Motorcycle>();
       System.out.println("                           🏍 🚚 🚗 Welcom in vechicles world 🚗 🚚 🏍️    ");
       System.out.println("please Enter your name");
       Scanner username = new Scanner (System.in);
       String name = username.nextLine();
       System.out.println("Welcome dear "+name);
       System.out.println("___________________________________________________________________________________________________________________________________________");
       System.out.println("Enter Vechicle type");
       System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
       Scanner in = new Scanner ( System.in );
       System.out.println ( "Selection: " );
    switch (in.nextInt() ) {
       case 1:
        System.out.println ( "You picked Car" );
        Car carObj = new Car();
        Engine engineObj = new Engine();
        Date date = new Date();
        System.out.println("Enter the Action you want to make :");
        System.out.println ( "1) Add (1)\n2) Delet (2)\n3) Insert (3)\n4) modify (4)\n5) Search (5)\n6) printall (6)" );
        Scanner action = new Scanner ( System.in );
        System.out.print ( "Selection: " );
    switch (action.nextInt() ) {
         case 1:
        Scanner car = new Scanner(System.in);
        System.out.println("Let's add a new car to the vehicle center:");
        System.out.println(">Please enter the manufactur of the engine: ");
        engineObj.manufactur = car.next();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the manufactureDate of the engine: ");
        try {
          engineObj.setManufactureDate();
        } catch (ParseException e){
           System.out.println("Invalid date format. Please enter the date in");
        }
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the model of the engine: ");       
        engineObj. model = car.next();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the capacity of the engine: ");
        engineObj.capacity = car.nextInt();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the cylinders of the engine: ");
        engineObj.cylinders = car.nextInt();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the FuelType of the engine: ");
        System.out.println ( "1) Diesel(1)\n2)Gasoline(2)\n " );
        Scanner fuelType = new Scanner ( System.in );
        System.out.print ( "Selection: " );
        switch (fuelType.nextInt() ) {
              case 1:
                  System.out.println ( "You picked Diesel" );    
                  carObj.setFuelType(FuelType.DIESEL);
                break;
              case 2:
               System.out.println ( "You picked Gasoline" );
               carObj.setFuelType(FuelType.GASOLINE);
                break;
              default:
                System.out.println ( "Unrecognized option" );
              }
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the manufactureCompany of car: ");
        carObj. manufactureCompany = car.next();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the plateNum of car: ");
        carObj. plateNum = car.next();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the bodySerailNum of car: ");
        carObj .bodySerailNum = car.next();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the manufactureDate of car: ");
        String manufacturedate = car.nextLine();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the length of car : ");
        carObj .length = car.nextInt();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the width of car: ");
        carObj. width = car.nextInt();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the color of car: ");
        String color = car.next(); 
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the GearType of car: ");
        Scanner gearType = new Scanner ( System.in );
        System.out.println ( "1) Normal(1)\n2)Automatic(2)\n " );
        System.out.print ( "Selection: " );
        switch (gearType.nextInt() ) {
              case 1:
                  System.out.println ( "You picked Normal" );    
                  carObj.setGearType(GearType.NORMAL);
                break;
              case 2:
                 System.out.println ( "You picked Automatic" );
                 carObj.setGearType(GearType.AUTOMATIC);
                break;
              default:
                System.out.println ( "Unrecognized option" );
              }
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.print(">Please enter chairNum of the car: ");
        carObj.chairNum= car.nextInt();
        System.out.println("___________________________________________________________________________________________________________________________________________"); 
        System.out.println(">Please enter if isFurnitreLeather of car (t/f): ");
        carObj.setIsFurnitureLeather();
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println(">Please enter the manufactureDate of car: ");
        try {
              carObj.setManufactureDate();
        } catch (ParseException e) {
          System.out.println("Invalid date format. Please enter the date in");
        }
        System.out.println("___________________________________________________________________________________________________________________________________________");
        carObj.engine = engineObj;     
        System.out.println("You have successfully added a new Car to the vehicle center!");
        carObj.print();
       }
       case 2: 
           break;
       case 3: 
           break;
       case 4: 
           break;
       case 5: 
           break;
       case 6: 
          break;
           
  }
  
 }
}
        
            
        
    
     


   
    
