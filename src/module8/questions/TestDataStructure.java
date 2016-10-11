package module8.questions;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TestDataStructure implements Spliterator<Order> {

    @Override
    public int characteristics() {
        return 0;
    }

    @Override
    public void forEachRemaining(Consumer<? super Order> action) {

    }

    @Override
    public long getExactSizeIfKnown() {
        return 0;
    }

    @Override
    public boolean hasCharacteristics(int characteristics) {
        return false;
    }

    @Override
    public Comparator<? super Order> getComparator() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Order> action) {
        return false;
    }

    @Override
    public Spliterator<Order> trySplit() {
        return null;
    }
}
