package work3;

/**
 * Функціональний інтерфейс для визначення фільтрів рядків.
 */
@FunctionalInterface
public interface StringFilter {
    boolean apply(String string);
}
