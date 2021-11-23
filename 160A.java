import java.util.*;
 
public class TwinBro{
    public static int knap(int[] ar,int n,int W){
        int count = 0,sum=0;
        Arrays.sort(ar);
        for(int i=n-1;i>=0;i--){
            sum += ar[i];
            count++;
            if(sum>W) return count;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
        System.out.println(knap(arr,n,sum/2));
    }
}
