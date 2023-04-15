package ix_funkcjaForEach_Listof_MAPY;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class S2_9_funkcja_forEachLoop_ListKof {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maciek");
        names.add("Wojtek");
        names.add("Marek");
        names.add("Czarek");
        names.add("Barterk");

        List<String> names2 = List.of("Ania", "Mariusz", "Sebastian", "Mateusz","Tomi");
        names2.forEach(n -> {
            if (n.length() < 5)
                System.out.println(n);
        });

        Map<Integer, String> perosnMap=Map.of(
                1, "Marcin",
                2, "Bartosz",
                3,"Ania",
                4, "Bartłomiej",
                5,"Ewelina",
                6, "Sylwia",
                7, "Danuta",
                8, "Kasia"
        );
        System.out.println("\n\nWydruk mapy metodą foreach");
        perosnMap.forEach((k,v)-> System.out.println("Index: "+k+" wartość: "+v));

        System.out.println("\n\nSpłaszczenie mapy do entySet i wydruk entrySeta");
        perosnMap.entrySet().forEach(e-> System.out.println(e));

        System.out.println("\n\nSpłaszczenie mapy do entySet i wydruk wartości key i value z entrySet'a");
        perosnMap.entrySet().forEach(e-> System.out.println("Index: "+e.getKey()+" wartość: "+e.getValue()));
    }
}
