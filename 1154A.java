import java.util.*;
 
public class RestoringNums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3= sc.nextInt();
        int x4 = sc.nextInt();
 
        int max = Math.max(Math.max(Math.max(x1,x2),x3),x4);
 
        if(x1<max) System.out.print(max-x1+" ");
        if(x2<max) System.out.print(max-x2+" ");
        if(x3<max) System.out.print(max-x3+" ");
        if(x4<max) System.out.print(max-x4+" ");
    }
}
