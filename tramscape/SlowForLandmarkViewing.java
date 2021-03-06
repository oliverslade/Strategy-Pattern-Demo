package tramscape;

/**
 * This class implements the TramType interface and returns a string to the
 * client to show that the strategy pattern is implemented correctly.
 * 
 * @author Oliver Slade
 * 
 */
public class SlowForLandmarkViewing implements SlowingStopBehaviour
{
    /**
     * This method returns a string using the parameters it has bee passed by the 
     * clients subclass.
     * @param  name this is the name of the line.
     * @param lineCode this is the unique line code
     * @return 
     */
    @Override
    public String getRouting(String name, int lineCode)
    {
        return "Tram slows down for tourists to view landmark: " + name + " " + lineCode + ".";
    }
}