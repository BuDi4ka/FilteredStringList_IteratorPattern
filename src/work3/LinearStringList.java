package work3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Клас LinearStringList інкапсулює список рядків і забезпечує доступ до них
 * через звичайний та фільтруючий ітератори.
 */
public class LinearStringList {
    private final List<String> strings;

    /**
     * Конструктор, який створює порожній список.
     */
    public LinearStringList() {
        System.out.println("Конструктор LinearStringList викликаний");
        strings = new ArrayList<>();
    }

    /**
     * Додає рядок до списку.
     * @param string Рядок, який потрібно додати.
     */
    public void add(String string) {
        System.out.println("Метод add викликаний з аргументом: " + string);
        strings.add(string);
    }

    /**
     * Повертає список рядків.
     * @return Список рядків.
     */
    public List<String> getStrings() {
        System.out.println("Метод getStrings викликаний");
        return strings;
    }

    /**
     * Повертає звичайний ітератор.
     * @return Ітератор для списку.
     */
    public Iterator<String> getIterator() {
        System.out.println("Метод getIterator викликаний");
        return strings.iterator();
    }

    /**
     * Повертає фільтруючий ітератор.
     * @param filter Фільтр, який потрібно застосувати.
     * @return Фільтруючий ітератор.
     */
    public Iterator<String> getFilteredIterator(StringFilter filter) {
        System.out.println("Метод getFilteredIterator викликаний");
        return new LinearStringListFilterIterator(strings, filter);
    }
}
