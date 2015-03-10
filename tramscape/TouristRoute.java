package tramscape;

/**
 *  * This class is an extension of RouteType and selects the behaviour it needs 
 * from the interfaces. It creates an new polymorphic object of type TramType
 * and SlowStopBehaviour.
 * 
 * @author Oliver Slade  
 * 
 */
public class TouristRoute extends RouteType
{
    /**
     * This constructor selects the behaviour it wishes to implement from each
     * interface.
     */
    public TouristRoute()
    {
        t = new TouristTram();
        r = new SlowForLandmarkViewing();
        
    }   
}