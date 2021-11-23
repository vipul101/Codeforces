import java.util.*;

public class LinearKeyboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String keyboard = sc.next();
            String word = sc.next();

            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0;i<keyboard.length();i++){
                map.put(keyboard.charAt(i),i+1);
            }

            int count = 0;
            for(int i=1;i<word.length();i++){
                count += Math.abs(map.get(word.charAt(i-1)) - map.get(word.charAt(i)));
            }
            System.out.println(count);
        }
    }
}