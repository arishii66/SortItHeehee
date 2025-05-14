import java.util.*;

public class Ausgabe {


    public static void liste(List<Integer> liste){
        //Output list with 30 values per line
        System.out.println("[DEBUG] Ausgabe.liste");
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + " ");
            if ((i+1)% 30 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void insertSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."InsertSort ergebnis: \{liste}");
    }
    public static void quickSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."QuickSort ergebnis: \{liste}");
    }
    public static void mergeSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."MergeSort ergebnis: \{liste}");
    }
    public static void zeit(Sortierer sortierer){
        System.out.println("---------------------------");
        System.out.println(STR."Benötigte Zeit der Operation: " + sortierer.getOperations() + "s.");
    }
}
