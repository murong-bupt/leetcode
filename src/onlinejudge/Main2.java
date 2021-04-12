package onlinejudge;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();

        int count =0;

        for(int i=k;i<=str.length();i++){

            int left = 0;
            int right = left+i-1;
            while (right!=str.length()){
                int num = 0;
                for (int j=left;j<=right;j++){

                    num += str.charAt(j)-'0';
                }
                if (num==k){
                    count++;
                }
                left++;
                right++;
            }

        }

        System.out.println(count);

    }
}
