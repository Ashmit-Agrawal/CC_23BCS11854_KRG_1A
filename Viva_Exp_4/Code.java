import java.util.*;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                sum += bitrate(arr[i]^arr[j]);
            }
        }

        System.out.println(sum*2);
    }

    static int bitrate(int n){
        int count = 0;
        while(n>0){
            count += n&1;
            n = n>>1;
        }
        return count;
    }
}