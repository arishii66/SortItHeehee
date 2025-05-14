import java.util.ArrayList;
import java.util.List;

public class quickSortierer extends Sortierer {

    public quickSortierer(List<Integer> input) {
        super(input);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> toSort) {
//        System.out.println("[DEBUG] quickSortierer.sortiere");

        if(toSort.size() <= 1) return toSort;

        int pivot = toSort.remove(0);
//        System.out.println("[DEBUG] Pivot: " + pivot);
        List<Integer> ersteListe = new ArrayList<>();    // <= pivot
        List<Integer> zweiteListe = new ArrayList<>();   // > pivot
        List<Integer> sortierteListe = new ArrayList<>();

        //partitioning
        for (int num : toSort) {
            if (num <= pivot) {
                ersteListe.add(num);
            } else {
                zweiteListe.add(num);
            }
        }


        sortierteListe.addAll(sortiere(ersteListe));  // sortiere ersteListe
        sortierteListe.add(pivot);                    // füge Pivot ein
        sortierteListe.addAll(sortiere(zweiteListe)); // sortiere zweiteListe

        return sortierteListe;
    }
}
