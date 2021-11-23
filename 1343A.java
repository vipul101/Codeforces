import java.util.*;
 
public class Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            for(int j=2;j<Math.pow(10,9);j++){
                int p = (int)Math.pow(2,j) - 1;
                if(n%p==0){
                    System.out.println(n/p);
                    break;
                }
            }
        }
    }
}
