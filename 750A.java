import java.util.*;

public class NewYearHurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = 4*60,count = 0;
        int rem = t-k,time_took = 0,i=1;
        time_took = 5*i;
        while(time_took<=rem && count<=n-1){
            time_took += 5*++i;
            count++;
        }
        System.out.println(count);
    }
}
