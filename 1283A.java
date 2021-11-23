import java.util.*;
 
public class HoursB4year{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int h = sc.nextInt();
            int m = sc.nextInt();
 
            int le_m = (23-h)*60;
            le_m += 60-m;
 
            System.out.println(le_m);
        }
    }
}
