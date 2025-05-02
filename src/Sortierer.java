 import java.util.*;

public abstract class Sortierer {
    private final List<Integer> liste;
    private long startZeit;
    private long endZeit;

    public Sortierer(List<Integer> input){
        this.liste = new ArrayList<>(input);
    }

    protected abstract List<Integer> sortiere(List<Integer> toSort);

    public List<Integer> sortiere(){
        startZeit = System.currentTimeMillis();
        List<Integer> result = sortiere(liste);
        endZeit = System.currentTimeMillis();

        return result;
    }

     public long getOperations(){
        return endZeit - startZeit;
     }

     public List<Integer> get(int Index){
     }

}
