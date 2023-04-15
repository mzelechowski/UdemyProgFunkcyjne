package xii_funkcjeWyzszegoRzedu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S2_12_funkcjeWyzszegoRzedu {
    public static void main(String[] args) {
        runnable("To jest już zbyt skompliowane").run();

        List<String> names1 = new ArrayList<>();
        names1.add("Maciek");
        names1.add("Bartek");
        names1.add("Wiola");
        names1.add("Piotrek");
        names1.add("Wlodzimierz");

        Comparator<String> comparator = String::compareToIgnoreCase;
        names1.sort(reverse(comparator));
        names1.forEach(System.out::println);

    }
    private static Runnable runnable(String text){
        return ()-> System.out.println(text);
    }

    private static Comparator<String> reverse (Comparator<String> comp){
        return (x,y) -> comp.compare(y,x);
    }
}
