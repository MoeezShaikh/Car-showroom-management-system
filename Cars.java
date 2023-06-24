import java.util.*;

public class Cars extends Showroom implements utility{
	String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details(){
    	System.out.println("Name"+car_name);
    	System.out.println("Color"+car_color);
    	System.out.println("Fuel Type"+car_fuel_type);
    	System.out.println("Car Price"+car_price);
    	System.out.println("car type"+car_type);
    	System.out.println("Transmission"+car_transmission);

    }
    @Override
    public void set_details(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.println("Car Name");
        car_name=sc.nextLine();
        System.out.println("car_color");
        car_color=sc.nextLine();
        System.out.println("car_fuel_type(Petrol/Diesel");
        car_type=sc.nextLine();
        System.out.println("car price: ");
        car_price=sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;


    }
}