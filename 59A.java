import java.util.*;

public class WordProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int upper = 0,lower = 0;

        for(int i =0;i<str.length();i++){
            if((int)str.charAt(i) >=65 &&(int)str.charAt(i) <=90) upper++;
            else lower++;
        }

        if(upper>lower) str = str.toUpperCase();
        else str = str.toLowerCase();

        System.out.println(str);
    }
}
