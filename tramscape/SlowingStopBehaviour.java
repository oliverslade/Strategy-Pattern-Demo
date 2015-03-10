package tramscape;

/**
 * The interface uses the getTramType method defined in the RouteType
 * to link itself with the RouteType client. It passes the parameters 
 * to the concrete implementations of the interface.
 *
 * @author Oliver Slade
 *
 */
public interface SlowingStopBehaviour 
{

    /**
     * This method returns the name and lineCode back to the client
     * @param name this is the name of the line.
     * @param lineCode this is the unique line code
     * @return
     */
    public String getRouting(String name, int lineCode);
}