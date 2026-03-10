import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String[] arr = {"abcw", "bax", "foo", "bar", "xtfn", "abcdef"};
        int n = arr.length;
        int[] mask = new int[n];

        for (int i = 0; i < n; i++) {
            int m = 0;
            for (char c : arr[i].toCharArray()) {
                m |= 1 << (c - 'a');
            }
            mask[i] = m;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    int prod = arr[i].length() * arr[j].length();
                    if (prod > max) max = prod;
                }
            }
        }

        System.out.println(max);
    }    
}
