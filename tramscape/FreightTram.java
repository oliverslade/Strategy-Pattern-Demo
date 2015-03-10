package tramscape;

/**
 * This class implements the TramType interface and returns a string to the
 * client to show that the strategy pattern is implemented correctly.
 * 
 * @author Oliver Slade
 *
 */
public class FreightTram implements TramType
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
        return "The tram for this line is a " + TramNames.Diesel_Heavy_Tram;
    }
}