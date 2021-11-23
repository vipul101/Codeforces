import java.util.*;

public class SocksHipster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int count = Math.min(a,b);
        int rem = Math.max(a-b,b-a);
        rem = rem/2;
        System.out.println(count+" "+rem);
    }
}
