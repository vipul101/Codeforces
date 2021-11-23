import java.util.*;
 
public class ZeusWheel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char last_ch = 'a',curr;
        int moves =0;
        for(int i=0;i<str.length();i++){
            curr = str.charAt(i);
            int diff = Math.abs((int)last_ch - (int)curr);
            last_ch = curr;
            if(diff > 13){
                diff = Math.abs(26-diff);
            }
            moves += diff;
        }
        System.out.println(moves);
    }
}
