import java.util.ArrayList;
import java.util.List;

public class mergeSortierer extends Sortierer {

    public mergeSortierer(List<Integer> input) {
        super(input);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> toSort) {
//        System.out.println("[DEBUG] mergeSortierer.sortiere");

        if (toSort.size() <= 1) return toSort;

        //part left and right
        int mid = toSort.size() / 2;
        List<Integer> left = sortiere(new ArrayList<>(toSort.subList(0, mid)));
        List<Integer> right = sortiere(new ArrayList<>(toSort.subList(mid, toSort.size())));

        //merge left n right
        List<Integer> merged = combine(left, right);
//        System.out.println("[DEBUG] mergeSortierer.sortiere combined size: " + merged.size());

        return merged;
    }

    private List<Integer> combine(List<Integer> a, List<Integer> b) {
//        System.out.println("[DEBUG] mergeSortierer.combine");

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;


        // as long as both lists have elements, take the smaller element and add it to the result
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) {
            result.add(a.get(i));
            i++;
        }

        while (j < b.size()) {
            result.add(b.get(j));
            j++;
        }

        return result;

    }
}

