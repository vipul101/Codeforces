import java.util.*;

public class WrongSub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            if(N%10==0) N/=10;
            else N-=1;
        }
        System.out.println(N);
    }
}
