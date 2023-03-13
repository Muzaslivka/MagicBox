import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> boxInt = new MagicBox<Integer>(5);
        MagicBox<String> boxString = new MagicBox<>(7);
        Random random = new Random();

        boxInt.add(random.nextInt(100));
        boxInt.add(random.nextInt(100));
        boxInt.add(random.nextInt(100));
        boxInt.add(random.nextInt(100));

        //System.out.println("Из коробки извлечено: " + boxInt.pick());

        boxInt.add(random.nextInt(100));
        boxInt.add(random.nextInt(100));
        System.out.println();

        System.out.println("Из коробки извлечено: " + boxInt.pick());

        System.out.println();

        boxString.add("Часть силы");
        boxString.add("той");
        boxString.add("что вечно хочет");

        //System.out.println("Из коробки извлечено: " + boxString.pick());

        boxString.add("зла и");
        boxString.add("вечно");
        boxString.add("совершает");
        boxString.add("благо");
        System.out.println();

        //Извлечение из полной коробки строк
        System.out.println("Из коробки извлечено: " + boxString.pick());

    }
}