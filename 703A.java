import java.util.*;
 
public class MikshaGame{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack =  new Stack<>();
        int T = sc.nextInt();
        int m=0,c=0;
        for(int y =0;y<T;y++){
            int mi = sc.nextInt();
            int ci = sc.nextInt();
 
            if(mi>ci) m++;
            else if(ci>mi) c++;
        }
 
        if(m>c) System.out.println("Mishka");
        else if(m<c) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
