
import java.util.*;
 
public class Football{
    public static String help(String str){
        int team = str.charAt(0);
        int dang = 1;
        for(int i=1;i<str.length();i++){
            if(team == str.charAt(i)){
                dang++;
            }
            else{
                team = str.charAt(i);
                dang = 1;
            }
            if(dang>=7) return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(help(str));
        
    }
}
