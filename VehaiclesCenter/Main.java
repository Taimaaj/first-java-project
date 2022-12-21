    import java.util.Scanner;
    import java.lang.String;
    import java.util.*; 
    public class Main{
    public static void main(String args[])  {
       Car carObj = new Car();
       Truck truckObj = new Truck();
       Motorcycle motorcycleObj = new Motorcycle();
       System.out.println("                           🏍 🚚 🚗 Welcom in vechicles world 🚗 🚚 🏍️    ");
       System.out.println("please Enter your name");
       Scanner namee = new Scanner (System.in);
       String name=namee.nextLine();
       System.out.println("Welcome dear "+name);
       System.out.println("____________________________________________________________________________________________");
       System.out.println("Enter Vechicle type");
       Scanner in = new Scanner ( System.in );
       System.out.println ( "1) Car (1)\n2) Truck (2)\n3) Motorcycle (3)" );
       System.out.print ( "Selection: " );
       switch (in.nextInt() ) {
       case 1:
        System.out.println ( "You picked Car" );
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 1; i++) {
            Scanner car = new Scanner(System.in);
            System.out.println("Let's add a new car to the vehicle center:");
            System.out.println("\n>Please enter chairNum of the car: ");
            int chairNum = car.nextInt();
            System.out.println(">Please enter the length of car : ");
            int length = car.nextInt();
            System.out.println(">Please enter the width of car: ");
            int width = car.nextInt();
            System.out.println(">Please enter the color of car: ");
            String color = car.next();
            System.out.println(">Please enter the manufactureCompany of car: ");
            String manufactureCompany = car.next();
            System.out.println(">Please enter if isFurnitreLeather of car: ");
           // boolean isFurnitreLeather = car.nextBoolean();
            System.out.println(">Please enter the manufactureDate of car: ");
            int manufactureDate = car.nextInt();
            System.out.println(">Please enter the bodySerailNum of car: ");
            int bodySerailNum = car.nextInt();
            System.out.println(">Please enter the model of car: ");       
            String model = car.next();
            carObj.chairNum=chairNum;
            carObj.length=length;
            carObj.width=width;
            carObj.color=color;
            carObj.manufactureCompany=manufactureCompany;
            //carObj.manufactureDate=manufactureDate;
            // carObj.bodySerailNum=bodySerailNum;
            carObj.model=model;
            System.out.println("You have successfully added a new Car to the vehicle center!");
            }
         break;
       case 2:
        System.out.println ( "You picked  Truck" );
        List<Truck> truckList = new ArrayList<Truck>();
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
         List<Motorcycle> MotorcycleList = new ArrayList<Motorcycle>();
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
        break;

}
}
}
   
    
