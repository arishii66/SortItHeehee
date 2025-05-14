import java.util.ArrayList;
import java.util.List;

public class quickSortierer extends Sortierer {

    public quickSortierer(List<Integer> input) {
        super(input);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> toSort) {
        System.out.println("[DEBUG] quickSortierer.sortiere");

        if(toSort.size() <= 1) return toSort;

        int pivot = toSort.get(toSort.size()/2);
        System.out.println("[DEBUG] Pivot: " + pivot);
        List<Integer> less = new ArrayList<>(); //Elements smaller than pivot
        List<Integer> greater = new ArrayList<>(); //Elements greater than pivot
        List<Integer> equal = new ArrayList<>(); //Elements equal to pivot

        //partitioning
        for(int num : toSort) {
            if (num < pivot) less.add(num);
            else if (num > pivot) greater.add(num);
            else equal.add(num);
        }

        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(sortiere(less));
        sorted.addAll(equal);
        sorted.addAll(sortiere(greater));

        return sorted;
    }
}
