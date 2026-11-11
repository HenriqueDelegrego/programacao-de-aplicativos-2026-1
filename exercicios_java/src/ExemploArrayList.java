import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();

        idades.add(12);
        idades.add(13);
        idades.add(25);
        idades.add(6);
        idades.add(45);
        idades.add(22);

        System.out.println(idades);

        System.out.println(idades.contains(6));

        System.out.println(idades.indexOf(566864));

        System.out.println(idades.getLast());

        System.out.println(idades.size());

        Collections.sort(idades);

    }
}
