package job;

import java.util.ArrayList;

public class CollectionBuilder {

    public Collection<Integer> build(ArrayList<Integer> integers) {
        Collection<Integer> collection = new Collection<>();
        collection.addElements(integers);
        return collection;
    }
}