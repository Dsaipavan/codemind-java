import java.util.*;
public class sea{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        ArrayList<Integer> jako= new ArrayList<Integer>();
        for(int i=0;i<l;i++){
            jako.add(sc.nextInt());
            
        }
        String flag="False";
        int k= sc.nextInt();
        for(int i=0;i<l;i++){
            if(jako.get(i)==k){
                flag="True";
            }
        }
        System.out.println(flag);
        
    }
}