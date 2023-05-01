import java.util.*;
public class abc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        ArrayList<Integer> k=new ArrayList<Integer>();
        for(int i=0;i<l;i++){
            k.add(sc.nextInt());
        }
        
        int c=0;
        for(int i=1;i<l-1;i++){
            if(k.get(i-1)%2==1 && k.get(i+1)%2==1 && k.get(i)%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}