import java.util.*;
public class Collections {
    public static void main(String[] args) {
        // Array
        List a1 = new ArrayList();
        a1.add("Manzana");
        a1.add("Banana");
        a1.add("Cereza");
        System.out.println("ArrayList: " + a1);

        // LinkedList
        List l1= new LinkedList();
        l1.add("Perro");
        l1.add("Gato");
        l1.add("Pájaro");
        System.out.println("LinkedList: " + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Rojo");
        s1.add("Verde");
        s1.add("Azul");
        System.out.println("HashSet: " + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put(1, "Uno");
        m1.put(2, "Dos");
        m1.put(3, "Tres");
        System.out.println("HashMap: " + m1);

    }
}