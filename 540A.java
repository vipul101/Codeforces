import java.util.*;
 
public class CF504A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String set = sc.next();
        String pass = sc.next();
        int count = 0;
 
        for(int i=0;i<n;i++){
            int rem = (int)set.charAt(i);
            int pass_rem = (int)pass.charAt(i);
            int diff = Math.abs(rem - pass_rem);
 
            if(diff>5) count+= (10-diff);
            else count += diff;
        }
        System.out.println(count);
    }
}
