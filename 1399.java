import java.util.*;

public class RemoveSamllest{
    public static String helper(int[] arr,int n){
        if(n==1) return "YES";
        for(int j=0;j<n-1;j++){
            if(Math.abs(arr[j]-arr[j+1]) > 1) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(helper(arr,n));
        }
    }
}
