package job;

import java.util.ArrayList;

public class BuilderMain {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(0);
        Builder builder = new Builder();
        Immutable immutable = builder.setW(54)
                .setR(8765)
                .setK(98)
                .setCollection(integers)
                .build();

        Collection<Integer> collection1 = immutable.getCollection();
        for (int i = 0; i < immutable.getCollection().size(); i++) {
            Integer cur = collection1.get(i);
            System.out.println(cur);
        }
    }
}