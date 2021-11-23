import java.util.*;

public class BoyGirl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();

        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<user.length();i++){
            set.add(user.charAt(i));
        }

        if(set.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
