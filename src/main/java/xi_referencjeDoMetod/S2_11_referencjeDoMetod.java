package xi_referencjeDoMetod;

import java.util.ArrayList;
import java.util.List;

public class S2_11_referencjeDoMetod {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Maciek");
        names1.add("Bartek");
        names1.add("Wiola");
        names1.add("Piotrek");
        names1.add("Wlodzimierz");

        // List.of tworzy niemutowalną,niezmienną listę
        List<String> names2 = List.of("A1", "A2");

        names1.forEach(System.out::println);
        names1.sort((n1, n2) -> n1.compareTo(n2));
        names1.sort(String::compareTo);

        //lambda
        names1.forEach(n -> new User(n));
    //reference metod
        names1.forEach(User::new);

    }
}
