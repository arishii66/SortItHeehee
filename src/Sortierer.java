 import java.util.*;



//abstract basisclass
public abstract class Sortierer {
    private final List<Integer> liste;
    private long startZeit;
    private long endZeit;

    //Constructor
    public Sortierer(List<Integer> input){
        this.liste = new ArrayList<>(input);
    }

    protected abstract List<Integer> sortiere(List<Integer> toSort);

    // Start and measuring time
    public List<Integer> sortiere(){
        System.out.println("[DEBUG] Starting sort");
        startZeit = System.currentTimeMillis();
        List<Integer> result = sortiere(liste);
        endZeit = System.currentTimeMillis();
        System.out.println("[DEBUG] Finishing sort");

        return result;
    }

     public long getOperations(){
        return endZeit - startZeit;
     }


}
