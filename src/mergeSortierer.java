import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class mergeSortierer extends Sortierer {

    public mergeSortierer(List<Integer> input) {
        super(input);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> toSort) {
//        System.out.println("[DEBUG] mergeSortierer.sortiere");

        if (toSort.size() <= 1) return toSort;

        //part left and right
        List<Integer> copy = new ArrayList<>(toSort);
        int mid = toSort.size() / 2;
        List<Integer> left = sortiere(new ArrayList<>(toSort.subList(0, mid)));
        List<Integer> right = sortiere(new ArrayList<>(toSort.subList(mid, toSort.size())));

        //merge left n right
        List<Integer> combine = combine(left, right);
//        System.out.println("[DEBUG] mergeSortierer.sortiere combined size: " + merged.size());

        return combine;
    }

    private List<Integer> combine(List<Integer> a, List<Integer> b) {
//        System.out.println("[DEBUG] mergeSortierer.combine");

        ListIterator<Integer> iterA = a.listIterator();
        ListIterator<Integer> iterB = b.listIterator();
        List<Integer> result = new ArrayList<>();

        while (iterA.hasNext() || iterB.hasNext()) {
            if (!iterA.hasNext()) {
                // a emptytake b
                result.add(iterB.next());
            } else if (!iterB.hasNext()) {
                // b empty, take a
                result.add(iterA.next());
            } else {
                // both have elements > compare
                Integer valA = iterA.next();
                Integer valB = iterB.next();
                if (valA <= valB) {
                    result.add(valA);
                    iterB.previous();
                } else {
                    result.add(valB);
                    iterA.previous();
                }
            }

        }
        return result;
    }
}

