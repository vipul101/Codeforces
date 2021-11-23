import java.util.*;
 
public class SumoFRound{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack =  new Stack<>();
        int T = sc.nextInt();
        for(int y =0;y<T;y++){
            int n = sc.nextInt();
            int i=0;
            while(n!=0){
                int rem = n%10;
                if(rem!=0){
                    stack.push((int)(rem*Math.pow(10,i)));
                }
                i++;
                n/=10;
            }
            System.out.println(stack.size());
            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
            System.out.println("");
        }
    }
}
