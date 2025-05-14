import java.util.List;

public class insertSortierer extends Sortierer {


    public insertSortierer(List<Integer> input) {
        super(input);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> toSort) {
//        System.out.println("[DEBUG] insertSortierer.sortiere");

        // Loop over all elements, starting with the second
        for (int i = 1; i < toSort.size(); i++) {
            int key = toSort.get(i);
            int j = i - 1;
            //Bigger elements to the right
            while (j >= 0 && toSort.get(j) > key) {
                toSort.set(j + 1, toSort.get(j));
                j--;
            }
            //Insert element at the correct position
            toSort.set(j + 1, key);
            //Debug every 100 steps
//            if(i%100 == 0) System.out.println("[DEBUG] insertSort progress: i=" + i);
        }

        return toSort;
    }
}

