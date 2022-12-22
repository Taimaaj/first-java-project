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
       System.out.println("Welcome dear "+username);
       System.out.println("____________________________________________________________________________________________");
       System.out.println("Enter Vechicle type");
       Scanner in = new Scanner ( System.in );
       System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
       System.out.print ( "Selection: " );
       switch (in.nextInt() ) {
       case 1:
        System.out.println ( "You picked Car" );
        Car carObj = new Car();
        Engine engineObj = new Engine();
        for (int i = 0; i < 1; i++) {
            //scanner for car class
            Scanner car = new Scanner(System.in);
            System.out.println("Let's add a new car to the vehicle center:");
            System.out.println(">Please enter the manufactur of the engine: ");
            engineObj.manufactur = car.next();
            System.out.println(">Please enter the manufactureDate ofthe engine: ");
            String manufactureDate = car.nextLine();
            LocalDate _manufactureDate  = LocalDate.parse(manufactureDate);
            System.out.println(">Please enter the model of the engine: ");       
            engineObj. model = car.next();
            System.out.println(">Please enter the capacity of the engine: ");
            engineObj.capacity = car.nextInt();
            System.out.println(">Please enter the cylinders of the engine: ");
            engineObj.cylinders = car.nextInt();
            System.out.println(">Please enter the FuelType of the engine: ");
            engineObj.fuelType = car.nextInt();
            System.out.println ( "1) Diesel(1)\n2)Gasoline(2)\n " );
            System.out.print ( "Selection: " );
            switch (in.nextInt() ) {
              case 1:
                  System.out.println ( "You picked Diesel" );    
                break;
              case 2:
               System.out.println ( "You picked Gasoline" );
                break;
               default:
               System.out.println ( "Unrecognized option" );
              }
             System.out.println(">Please enter the manufactureCompany of car: ");
             carObj. manufactureCompany = car.next();
             System.out.println(">Please enter the plateNum of car: ");
             carObj. plateNum = car.next();
             System.out.println(">Please enter the bodySerailNum of car: ");
             carObj .bodySerailNum = car.next();
             System.out.println(">Please enter the manufactureDate of car: ");
             String manufacturedate = car.nextLine();
             LocalDate _manufacturedate  = LocalDate.parse(manufactureDate);         
             System.out.println(">Please enter the length of car : ");
             carObj .length = car.nextInt();
             System.out.println(">Please enter the width of car: ");
             carObj. width = car.nextInt();
             System.out.println(">Please enter the color of car: ");
             String color = car.next(); 
             System.out.println(">Please enter the GearType of car: ");
             carObj.gearType = car.nextInt();
             System.out.println ( "1) Normal(1)\n2)Automatic(2)\n " );
             System.out.print ( "Selection: " );
             switch (in.nextInt() ) {
              case 1:
                  System.out.println ( "You picked Normal" );    
                break;
              case 2:
               System.out.println ( "You picked Automatic" );
                break;
              default:
               System.out.println ( "Unrecognized option" );
              }
             System.out.println("\n>Please enter chairNum of the car: ");
             carObj.chairNum= car.nextInt();
              while (true) {
             System.out.println(">Please enter if isFurnitreLeather of car: ");
             String _isFurnitreLeather = car.nextLine();
             try {
                boolean isFurnitreLeather = Boolean.parseBoolean(_isFurnitreLeather);
                carObj.setisFurnitreLeather(isFurnitreLeather);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again.");
            }}
            System.out.println(">Please enter the manufactureDate of car: ");

            System.out.println("You have successfully added a new Car to the vehicle center!");
            }
        
    
      /* case 2:
        System.out.println ( "You picked  Truck" );
        for (int i = 0; i < 1; i++) {
            Scanner truck = new Scanner(System.in);
            System.out.println("Let's add a new Truck to the vehicle center:");
            System.out.println("\n>Please enter chairNum of the car: ");
            int chairNum = truck.nextInt();
            System.out.println("\n>Please enter freeWight: ");
            int freeWight = truck.nextInt();
            System.out.println("\n>Please enter fullWight: ");
            int fullWight = truck.nextInt();
            System.out.println(">Please enter the length of truck : ");
            int length = truck.nextInt();
            System.out.println(">Please enter the width of truck: ");
            int width = truck.nextInt();
            System.out.println(">Please enter the color of truck: ");
            String color = truck.next();
            System.out.println(">Please enter the manufactureCompany of truck: ");
            String manufactureCompany = truck.next();
            System.out.println(">Please enter if isFurnitreLeather of truck: ");
            //boolean isFurnitreLeather = truck.nextBoolean();
            System.out.println(">Please enter the manufactureDate of truck: ");
            int manufactureDate = truck.nextInt();
            System.out.println(">Please enter the bodySerailNum of truck: ");
            int bodySerailNum = truck.nextInt();
            System.out.println(">Please enter the model of truck: ");       
            String model = truck.next();
            System.out.println(">Please enter the plateNum of truck: ");       
            String plateNum = truck.next();
            System.out.println("You have successfully added a new truck to the vehicle center!");
            }
         break;
       case 3:
         System.out.println ( "You picked  Motorcycle" );
         for (int i = 0; i < 1; i++) {
            Scanner Motorcycle= new Scanner(System.in);
            System.out.println("Let's add a new MotorcycleList to the vehicle center:");
            System.out.println("\n>Please enter the tierDiameter : ");
            int chairNum = Motorcycle.nextInt();
            System.out.println(">Please enter the length of MotorcycleList : ");
            int length = Motorcycle.nextInt();
            System.out.println(">Please enter the manufactureCompany of car: ");
            String manufactureCompany = Motorcycle.next();
            System.out.println(">Please enter the manufactureDate of car: ");
            int manufactureDate = Motorcycle.nextInt();
            System.out.println(">Please enter the bodySerailNum of car: ");
            int bodySerailNum = Motorcycle.nextInt();
            System.out.println(">Please enter the model of car: ");   
            System.out.println(">Please enter the plateNum of truck: ");       
            String plateNum = Motorcycle.next();
            System.out.println(">Please enter the model of truck: ");
            String model = Motorcycle.next();
            System.out.println(">Please enter the plateNum of  Motorcycle: ");       
            String platNum = Motorcycle.next();
            System.out.println(MotorcycleList);
            System.out.println("You have successfully added a new Car to the vehicle center!");
            }
         break;
       default:
        System.out.println ( "Unrecognized option" );
        break;*/
    }}}


   
    
