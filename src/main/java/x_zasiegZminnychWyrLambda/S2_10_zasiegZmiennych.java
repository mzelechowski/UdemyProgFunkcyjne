package x_zasiegZminnychWyrLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S2_10_zasiegZmiennych {
    public static void main(String[] args) {
        //repeatText(5, "Java jest coraz badziej trudna");


  //Tu wystapi błąd gdyż w interfejsach nie możemy używać zmiennych lokalnych niefinalnych dlatego zmienna pomocnicza b
        for (int i = 0; i <= 5; i++) {
            int b=i;
            execute(()-> System.out.println(b));
        }

        //to zadziała ponieważ tablica jest klasą, a lambda ma dostęp do pół klasy
        System.out.println("Dostęp do pół klasy");
        int[] tab= new int[1];
        for (tab[0] = 0; tab[0] <= 5; tab[0]++) {
            execute(()-> System.out.println(tab[0]));
        }

        ///// ?????????????????????/MIND FUCK

        List<Integer> numbers = List.of(0,1,2,3,4,5);
        for(Integer n:numbers){
            execute(()-> System.out.print(n+","));
        }


    }

    private static void execute(Runnable runnable){
        runnable.run();
    }

    private static void repeatText(int number, String text) {
        Runnable runnable = () -> {
            for (int i = 0; i <= number; i++) {
                System.out.println(text);
            }
        };
        runnable.run();
    }
}
