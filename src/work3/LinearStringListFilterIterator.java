package work3;

import java.util.Iterator;
import java.util.List;

/**
 * Клас LinearStringListFilterIterator реалізує фільтруючий ітератор
 * для лінійного списку рядків.
 */
public class LinearStringListFilterIterator implements Iterator<String> {
    private final Iterator<String> iterator;
    private final StringFilter filter;
    private String nextItem;
    private boolean hasNext;

    public LinearStringListFilterIterator(List<String> strings, StringFilter filter) {
        this.iterator = strings.iterator();
        this.filter = filter;
        advance();
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public String next() {
        String current = nextItem;
        advance();
        return current;
    }

    private void advance() {
        while (iterator.hasNext()) {
            nextItem = iterator.next();
            if (filter.apply(nextItem)) {
                hasNext = true;
                return;
            }
        }
        hasNext = false;
    }
}
