package Viii_odroczoneWywolanie;

import java.util.function.Consumer;

public class S2_8_odroczoneWywolanie {
    public static void main(String[] args) {
        executeForEvenNumber(6, () -> System.out.println("Liczba jest parzysta"));
        executeForEvenNumber(5, () -> System.out.println("Liczba jest parzysta"));

        executeForEvenNumberWithPrintNumber(6, i -> System.out.println(i +" to liczba jest parzysta"));

    }

    public static void executeForEvenNumber(int number, Runnable action) {
        if (number % 2 == 0) {
            action.run();
        }

    }

    public static void executeForEvenNumberWithPrintNumber(int number, Consumer action){
        if (number % 2 == 0) {
            action.accept(number);
        }
    }
}
