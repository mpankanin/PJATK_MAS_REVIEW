import java.util.ArrayList;
import java.util.List;

public class Extension {
    // in the same class
    private static List<Extension> extent = new ArrayList<>();

    private static void addExtension(Extension extension) {
        extent.add(extension);
    }

    private static void removeExtension(Extension extension) {
        extent.remove(extension);
    }


    // THAT'S NOT THE WAY TO DO IT - IT SHOULD BE AN INDEPENDENT CLASS - AVOID ERRORS
    // using an additional class
    public class ExtensionExtension {
        // differences: not a static list
        private List<Extension> extent = new ArrayList<>();

        // differences: public method
        public void addExtension(Extension extension) {
            extent.add(extension);
        }

        // differences: public method
        public void removeExtension(Extension extension) {
            extent.remove(extension);
        }

    }

}


