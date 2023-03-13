import java.util.Random;

public class MagicBox<T> {
    private int volumeBox;
    private T[] items;

    public MagicBox(int sizeBox){
        this.volumeBox = sizeBox;
        this.items = (T[]) new Object[sizeBox];
    }

    public boolean add(T newItem){
        for (int i = 0; i < volumeBox; i++) {
            if (items[i] == null) {
                items[i] = newItem;
                System.out.println("В коробку добавлено: " + newItem);
                return true;
            }
        }
        System.out.println("Коробка заполнена полностью");
        return false;
    }

    private int amountEmptyItems(){
        int amount = 0;
        for (int i = 0; i < volumeBox; i++) {
            if (items[i] == null) {
                amount++;
            }
        }
        return amount;
    }

    public T pick(){
        Random random = new Random();
        int randomInt = random.nextInt(volumeBox);
        if (amountEmptyItems() > 0) {
            throw new RuntimeException("Коробка не заполнена. Количество свободных ячеек: " + amountEmptyItems());
        }
        return items[randomInt];

    }
}