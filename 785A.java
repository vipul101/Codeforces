import java.util.*;
 
public class CF785A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += map.get(arr[i]);
        }
        System.out.println(sum);
    }
}
