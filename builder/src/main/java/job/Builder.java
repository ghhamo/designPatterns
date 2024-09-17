package job;

import java.util.ArrayList;

public class Builder {
    private int w;
    private int r;
    private int k;
    private Collection<Integer> integers;

    public Builder setW(int w) {
        this.w = w;
        return this;
    }

    public Builder setR(int r) {
        this.r = r;
        return this;
    }

    public Builder setK(int k) {
        this.k = k;
        return this;
    }

    public Builder setCollection(ArrayList<Integer> ints) {
       CollectionBuilder collectionBuilder = new CollectionBuilder();
       integers = collectionBuilder.build(ints);
       return this;
    }

    public Immutable build() {
        return new Immutable(w, k, r, integers);
    }
}
