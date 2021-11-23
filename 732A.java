import java.util.*;
 
public class BuySovel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int priceMade = 0,val = 0;
        while(true){
            if((priceMade%10==0 && priceMade!=0)||priceMade%10==r) break;
 
            ++val;
            priceMade += k;
        }
 
        System.out.println(val);
    }
}
