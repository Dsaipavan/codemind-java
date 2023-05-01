import java.util.*;
public class odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        ArrayList<Integer> lis= new ArrayList <Integer>();
        for(int i=0; i<l; i++){
            lis.add(sc.nextInt());
        }
        for(int i=l-1;i>-1;i--){
            if(lis.get(i)%2==1){
                System.out.println(i);
                break;
            }
            
        }
    }
}