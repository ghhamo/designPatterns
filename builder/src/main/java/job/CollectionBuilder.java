package job;

import java.util.ArrayList;

public class CollectionBuilder {

    public Collection<Integer> build(ArrayList<Integer> integers) {
        Collection<Integer> collection = new Collection<>(integers.size());
        collection.addElements(integers);
        return collection;
    }
}