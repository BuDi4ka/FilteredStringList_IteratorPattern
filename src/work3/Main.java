package work3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinearStringList list = new LinearStringList();

        // Додавання рядків
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("apricot");

        System.out.println("Original list:");
        list.getStrings().forEach(System.out::println);

        // Звичайний ітератор
        System.out.println("\nIterating with standard iterator:");
        Iterator<String> iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Фільтр по довжині рядка > 5
        System.out.println("\nFiltered by length > 5:");
        StringFilter lengthFilter = str -> str.length() > 5;
        Iterator<String> filteredIterator = list.getFilteredIterator(lengthFilter);
        while (filteredIterator.hasNext()) {
            System.out.println(filteredIterator.next());
        }

        // Фільтр по першій літері 'a'
        System.out.println("\nFiltered by starting with 'a':");
        StringFilter startsWithAFilter = str -> str.startsWith("a");
        Iterator<String> startsWithAIterator = list.getFilteredIterator(startsWithAFilter);
        while (startsWithAIterator.hasNext()) {
            System.out.println(startsWithAIterator.next());
        }
    }
}
