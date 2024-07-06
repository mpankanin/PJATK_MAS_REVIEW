import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssociationComposition {

    public class Whole {
        private List<Part> parts = new ArrayList<>();
        private static Set<Part> allParts = new HashSet<>();

        public void addPart(Part part) throws Exception{
            if(!parts.contains(part)) {
                if(allParts.contains(part)) {
                    throw new Exception("The part is already connected with a whole!");
                }
            }
            parts.add(part);
            allParts.add(part);
        }
    }

    public class Part {

    }

}
