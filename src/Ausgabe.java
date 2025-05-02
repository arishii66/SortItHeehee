import java.util.*;

public class Ausgabe {
    private int index;
    private int n;




    public static void liste(List<Integer> liste){
        while (!liste.isEmpty()) {
            System.out.print(
        }
    }
    public static void insertSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."InsertSort ergebnis: " + liste);
    }
    public static void quickSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."QuickSort ergebnis: \{liste}");
    }
    public static void mergeSort(List<Integer> liste){
        System.out.println("---------------------------");
        System.out.println(STR."MergeSort ergebnis: \{liste}");
    }
    public static long zeit(Sortierer sortierer){
        System.out.println("---------------------------");
        System.out.println(STR."Benötigte Zeit der Operation: " + sortierer.getOperations() + "s.");
    }
}
