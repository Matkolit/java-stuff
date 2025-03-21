
import java.util.Arrays;


public class SimpleSort {

    public static void main(String[] args) {
        int[] exampleData = {23, 4, 12, 53, 32, 53, 6, 2, 8, 64, 3, 68, 4, 3, 26, 72, 35, 73, 1, 4, 7, 32};

        var sortedArr = proste_wstawianie(exampleData);
        System.out.println("Sorter array: " + Arrays.toString(sortedArr));
    }

    public static int[] proste_wstawianie(int t[]) {
        int i, j, tmp;
        for (i = 1; i < t.length; i++) {
            j = i; 
            tmp = t[j]; 
            while ((j > 0) && (t[j - 1] > tmp)) {
                t[j] = t[j - 1];
                j--; 
            }
            t[j] = tmp;
        }
        return t;
    }
}
