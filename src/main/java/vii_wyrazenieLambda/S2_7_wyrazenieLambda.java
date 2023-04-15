package vii_wyrazenieLambda;

import java.util.Comparator;
import java.util.function.*;

public class S2_7_wyrazenieLambda {
    public static void main(String[] args) {
        Runnable run1 = ()-> System.out.println("Hello from lambda");
        run1.run();

        Runnable run2 = ()->{
            for (int i = 0; i <=10; i++) {
                if(i%2==0) System.out.print(i+", ");
            }
        };
        run2.run();

        Comparator<String> comparator =  ( first, second) ->first.length()-second.length();
        System.out.println("Roznica znaków wynosi: "+comparator.compare("pierwszy","drugi"));
    }
}
