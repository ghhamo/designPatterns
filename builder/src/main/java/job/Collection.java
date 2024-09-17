package job;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Collection<V> extends ArrayList<V> {
    private boolean flagForAddAll = true;
    public void addElements(ArrayList<V> vs) {
        if (flagForAddAll) {
            this.addAll(vs);
            flagForAddAll = false;
            return;
        }
        throw new RuntimeException();
    }

    @Override
    public V removeLast() {
        throw new RuntimeException();
    }

    @Override
    public V removeFirst() {
        throw new RuntimeException();
    }

    @Override
    public V remove(int index) {
        throw new RuntimeException();
    }

    @Override
    public void addLast(V element) {
        throw new RuntimeException();
    }

    @Override
    public void addFirst(V element) {
        throw new RuntimeException();
    }

    @Override
    public void add(int index, V element) {
        throw new RuntimeException();
    }

    @Override
    public boolean add(V v) {
        throw new RuntimeException();
    }
    @Override
    public V set(int index, V element) {
        throw new RuntimeException();
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException();
    }

    @Override
    public void clear() {
        throw new RuntimeException();
    }

    @Override
    public boolean addAll(java.util.Collection<? extends V> c) {
        if (flagForAddAll) {
            super.addAll(c);
            return true;
        }
        throw new RuntimeException();
    }

    @Override
    public boolean addAll(int index, java.util.Collection<? extends V> c) {
        throw new RuntimeException();
    }

    @Override
    public boolean removeIf(Predicate<? super V> filter) {
        throw new RuntimeException();
    }

    @Override
    public void replaceAll(UnaryOperator<V> operator) {
        throw new RuntimeException();
    }

    @Override
    public List<V> reversed() {
        throw new RuntimeException();
    }
}
