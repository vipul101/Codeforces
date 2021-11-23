import java.util.*;

public class WonderColor{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int[] char_count = new int[26];
            for(int i=0;i<str.length();i++){
                char_count[str.charAt(i) - 'a']++;
            }
            int single = 0, dual = 0;
            for(int i=0;i<26;i++){
                if(char_count[i] == 1)
                    single ++;
                else if(char_count[i]>=2){
                    dual++;
                }
            }

            System.out.println(dual+(single/2));
        }
    }
}