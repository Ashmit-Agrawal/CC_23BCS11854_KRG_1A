import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 4}, {4, 8}};
        int n = arr.length;
        Arrays.sort(arr, (x, y) -> (y[1] - y[0]) - (x[1] - x[0]));

        long added = 0; 
        long current = 0; 
        for (int[] task : arr) {
            int consume = task[0];
            int minReq = task[1];
            if (current < minReq) {
                long need = minReq - current;
                added += need;
                current += need;
            }
            current -= consume;
        }

        System.out.println(added);

    }
}
