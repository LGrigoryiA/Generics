import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {


    T[] items;
    T item;
    protected int maxItem;

    public MagicBox(int maxItem) {
        this.items = (T[]) new Object[maxItem];
    }

    boolean add(T item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                int difference = items.length - i;

                throw new RuntimeException("Коробка не полна! Не заполненых ячеек : " + difference);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
