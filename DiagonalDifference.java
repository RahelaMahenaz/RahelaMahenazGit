import java.util.*;
import java.lang.Math;
class Solution {
 
public static int diagonalDifference(int arr[][], int N) {
    int d1 = 0;
    int d2 = 0;
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {

            if(i == j)
            d1 += arr[i][j];

            if(i == N-j-1)
            d2 += arr[i][j];
        }
    }
    return Math.abs(d1-d2);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i = 0; i < n; i++) 
    for(int j = 0; j < n; j++)
    arr[i][j] = sc.nextInt();

   int s = diagonalDifference(arr, n);
   System.out.println(s);
}
}



 

