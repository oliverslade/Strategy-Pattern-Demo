package tramscape;

/**
 * This class is the super class client in the project. It has set and get methods
 * that are used to link this class with the two interfaces. The getters pass the 
 * parameters to the behaviour and return the output.
 * 
 * @author Oliver Slade
 */
public abstract class RouteType 
{    
    SlowingStopBehaviour r;
    TramType t;
    
    /**
     *The constructor is empty because no variables need to be initailised in this
     * class.
     */
    public RouteType()
    {

    }
    /**
     * This setter sets the interface to sb then links it to the object created in 
     * this class.
     * @param sb this is what the slowing stop behaviour has been initialisted to.
     */
    public void setRouting(SlowingStopBehaviour sb)
    {
        this.r = sb;
    }
    /**
     * This setter sets the interface to tram then links it to the object created in 
     * this class.
     * @param tram this is what the tram type has been initialisted to.
     */
    public void setTram(TramType tram)
    {
        this.t = tram;
    }
    /**
     * This method gets the name and lineCode from the SlowStopBehavior interface and 
     * passes it to the correct subclass.
     * @param name this is the name of the line.
     * @param lineCode this is the unique line code
     * @return 
     */
    public String getRouting(String name, int lineCode)
    {
        return r.getRouting(name, lineCode);
    }
    /**
     * This method gets the name and lineCode from the TramType interface and 
     * passes it to the correct subclass.
     * @param name this is the name of the line.
     * @param lineCode this is the unique line code
     * @return 
     */
    public String getTramType(String name, int lineCode)
    {
        return t.getTramType(name, lineCode);
    }
}