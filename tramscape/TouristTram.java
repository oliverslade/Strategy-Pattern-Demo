package tramscape;

/**
 *
 * This class implements the TramType interface and returns a string to the
 * client to show that the strategy pattern is implemented correctly.
 * 
 * @author Oliver Slade
 * 
 */
public class TouristTram implements TramType
{
    /**
     * This method returns a string using the parameters it has bee passed by the 
     * clients subclass.
     * @param name this is the name of the line.
     * @param lineCode this is the unique line code
     * @return 
     */
    @Override
    public String getTramType(String name, int lineCode) 
    {
        return "The correct tram for the " + name + " line("+ lineCode +  ") ,is a " + TramNames.Vintage_Electrical_Wooden_Tram;
    }
}