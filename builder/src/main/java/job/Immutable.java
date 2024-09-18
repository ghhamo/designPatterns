package job;

import java.util.ArrayList;

public class Immutable {
    private final int k;
    private final int r;
    private final double w;
    private final Collection<Integer> integers;

    public Immutable(int w, int k, int r, Collection<Integer> integers) {
        this.k = k;
        this.r = r;
        this.w = w;
        this.integers = integers;
    }

    public int getK() {
        return k;
    }

    public int getR() {
        return r;
    }

    public double getW() {
        return w;
    }

    public Collection<Integer> getCollection() {
        return integers;
    }
}