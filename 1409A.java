import java.util.*;
 
public class TwoIntProb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(b-a);
            int count = diff/10;
            if(diff%10>0) count++;
 
            System.out.println(count);
        }
    }
}
