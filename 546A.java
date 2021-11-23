import java.util.*;

public class SoliderBanana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int bana = sc.nextInt();
        int has_to_pay = 0;
        for(int i=1;i<=bana;i++){
            has_to_pay += i*price;
        }
        System.out.println(Math.max(0,has_to_pay-money));
    }
}
