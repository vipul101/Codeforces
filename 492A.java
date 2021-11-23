import java.util.*;
 
public class Cubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), last =0,current=0,i=0;
        while(n>0){
            i++;
            current = last+i;
            last = current;
            n -=current;
            if(n<0){
                i--;
            }
        }
        System.out.println(i);
    }
}
