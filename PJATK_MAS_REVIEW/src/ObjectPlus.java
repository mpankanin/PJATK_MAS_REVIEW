import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

// an object to manage the all projects' extents
public class ObjectPlus implements Serializable {
    // container to store the all extents
    private static Map<Class<? extends ObjectPlus>, List<ObjectPlus>> allExtents = new Hashtable<>();

    // constructor to manage an addition
    public ObjectPlus() {
        List<ObjectPlus> extent = null;
        Class<? extends ObjectPlus> theClass = this.getClass();
        if (allExtents.containsKey(theClass)) {
            // An extent of this class already exist
            extent = allExtents.get(theClass);
        } else {
            // An extent does not exist create a new one
            extent = new ArrayList<>();
            allExtents.put(theClass, extent);
            extent.add(this);
        }
    }

    // methods to manage getting the extent etc...

}
