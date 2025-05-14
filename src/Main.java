import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        for(int i = 0; i < 500; i++) {
            int min = 1900;
            int max = 2013;
            int randomYear = min + (int)(Math.random() * (max - min + 1));
            liste.add(randomYear);
        }


        System.out.println("Originale Liste: ");
        Ausgabe.liste(liste);

        //InsertSort
//        System.out.println("[DEBUG] calls in main: insertSort");
        Ausgabe.insertSort(liste);
        insertSortierer insertSorter = new insertSortierer(liste);
        List<Integer> sortedInsert = insertSorter.sortiere();
        Ausgabe.liste(sortedInsert);
        Ausgabe.zeit(insertSorter);

        // QuickSort durchführen
//        System.out.println("[DEBUG] Calling quickSort");
        Ausgabe.quickSort(liste);
        quickSortierer quickSorter = new quickSortierer(liste);
        List<Integer> sortedQuick = quickSorter.sortiere();
        Ausgabe.liste(sortedQuick);
        Ausgabe.zeit(quickSorter);

        // MergeSort durchführen
//        System.out.println("[DEBUG] Calling mergeSort");
        Ausgabe.mergeSort(liste);
        mergeSortierer mergeSorter = new mergeSortierer(liste);
        List<Integer> sortedMerge = mergeSorter.sortiere();
        Ausgabe.liste(sortedMerge);
        Ausgabe.zeit(mergeSorter);

//        System.out.println("[DEBUG] Program finished");
    }

}
