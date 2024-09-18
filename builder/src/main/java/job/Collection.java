package job;

import java.util.ArrayList;

public class Collection<V> {
    private final V[] table;
    private boolean flagForAddAll;
    private final int length;

    public Collection(int size) {
        length = size;
        flagForAddAll = true;
        table = (V[]) new Object[size];
    }

    public void addElements(ArrayList<V> vs) {
        if (flagForAddAll) {
            for (int i = 0; i < vs.size(); i++) {
                table[i] = vs.get(i);
            }
            flagForAddAll = false;
            return;
        }
        throw new RuntimeException();
    }

    public int getLength() {
        return length;
    }

    public V get(int index) {
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException();
        }
        return table[index];
    }
}
