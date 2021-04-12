package onlinejudge;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n;i++){
            Arrays.sort(arr);
            int a = arr[arr.length-1];
            int b = arr[arr.length-2];
            arr[arr.length-2] = a-b;
            arr[arr.length-1] = 0;
        }

        System.out.println(arr[arr.length-2]);

    }
}
