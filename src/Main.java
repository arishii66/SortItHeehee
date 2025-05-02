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

    }

}
