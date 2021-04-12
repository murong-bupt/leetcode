package onlinejudge;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i=0; i<n;i++){
            String a = sc.next();
            for (int j=0;j<m;j++){
                arr[i][j] = a.charAt(j);
            }
        }
        int[] result = new int[m];
        int[] score = new int[m];
        for (int i=0;i<m;i++){
            score[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            int max = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            for(int j=0;j<n;j++){
                if(arr[j][i]=='A'){
                    a++;
                }
                if(arr[j][i]=='B'){
                    b++;
                }
                if(arr[j][i]=='C'){
                    c++;
                }
                if(arr[j][i]=='D'){
                    d++;
                }
                if(arr[j][i]=='E'){
                    e++;
                }
            }
            int temp = a>b?a:b;
            temp = temp>c?temp:c;
            temp = temp>d?temp:d;
            temp = temp>e?temp:e;
            max = temp;
            result[i] = max;
        }
        int end = 0;

        for (int i=0;i<m;i++){
            end+=result[i]*score[i];
        }
        System.out.println(end);

    }
}
