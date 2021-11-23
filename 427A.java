import java.util.*;

public class Police{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        int rec = 0,untreated = 0;
        for(int i=0;i<n;i++){
            if(ar[i] > 0) rec+=ar[i];
            else if(ar[i] == -1 && rec!=0) rec--;
            else if(ar[i] == -1 && rec==0) untreated++;
        }

        System.out.println(untreated);
    }
}
