package tramscape;

/**
 * This class is my test harness which runs all tests 
 * involved with my program and outputs the results 
 * in a way that is easy for the user to view and 
 * understand.
 * 
 * @author Oliver Slade
 * 
 */
public class TestHarness 
{

    /**
     * The test harness initialises objects of the clients subclasses
     * then gives them behaviour using the interfaces and concrete classes.
     * @param args
     */
    public static void main(String[] args) 
    {
     //Freight
     RouteType t1 = new FreightRoute();
     RouteType t2 = new FreightRoute();
     RouteType t3 = new FreightRoute();
     
     //Passenger
     RouteType t4 = new PassengerRoute();
     RouteType t5 = new PassengerRoute();
     RouteType t6 = new PassengerRoute();
     
     //Tourist 
     RouteType t7 = new TouristRoute();
     RouteType t8 = new TouristRoute();
     RouteType t9 = new TouristRoute();
     
     //Freight
     t1.getRouting("Industrial", 1);
     t2.getRouting("District", 2);
     t3.getRouting("Central", 3);
     
     t1.getTramType("Industrial", 1);
     t2.getTramType("District", 2);
     t3.getTramType("Central", 3);
     
        System.out.println("The trams stop at the post point on this route type.");
        System.out.println("The tram for this route type is the Diesel Heavy Tram.");
     
     //Passenger
     t4.getRouting("Downtown", 4);
     t5.getRouting("Uptown", 5);
     t6.getRouting("Suburban", 6);
     
     t4.getTramType("Downtown", 4);
     t5.getTramType("Uptown", 5);
     t6.getTramType("Suburban", 6);
     
        System.out.println("The trams on this route type will slow when in a padestrian area.");
        System.out.println("The tram type for this route type is the Modern Eco Tram");
        
     //Tourist
     t7.getRouting("Outskirts", 7);
     t8.getRouting("Ring", 8);
     t9.getRouting("Eastside",9);
     
     t7.getTramType("Outskirts", 7);
     t8.getTramType("Ring", 8);
     t9.getTramType("Eastside", 9);
     
        System.out.println("The trams on this route type will slow when they pass a landmark.");
        System.out.println("The tram type for this route type is the Vintage Electrical Wooden Tram");
    }
}