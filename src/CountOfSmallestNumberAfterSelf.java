import java.util.Arrays;
import java.util.Scanner;

public class CountOfSmallestNumberAfterSelf {
    static void countSmall(int[] array,int n) {
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j= i + 1; j < n; j++) {
                count += (array[i] > array[j]) ? 1 : 0;
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        countSmall(A,n);
    }
}
