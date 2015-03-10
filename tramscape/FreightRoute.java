package tramscape;

/**
 * This class is an extension of RouteType and selects the behaviour it needs 
 * from the interfaces. It creates an new polymorphic object of type TramType
 * and SlowStopBehaviour.  
 * 
 * @author Oliver Slade
 */
public class FreightRoute extends RouteType 
{
    /**
     * This constructor selects the behaviour it wishes to implement from each
     * interface.
     */
    public FreightRoute()
    {
        t = new FreightTram();
        r = new StopAtPostPoint();
    }
}