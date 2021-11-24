import java.util.*;

public class MaxTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] tab = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)
                    tab[i][j] = 1;
                else{
                    tab[i][j] = tab[i-1][j] + tab[i][j-1];
                }
            }
        }

        System.out.println(tab[n-1][n-1]);
    }
}
