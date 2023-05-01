import java.util.*;
public class abc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> k=new ArrayList<Integer>();
        inqt p=2;
        k.add(0);
        k.add(1);
        while(k.get(p-1)<n){
            k.add(k.get(p-1)+k.get(p-2));
            p++;
        }
        if(Math.abs(k.get(p-2)-n)<Math.abs(k.get(p-1)-n)){
            System.out.println(k.get(p-2));
        }
        else if(Math.abs(k.get(p-2)-n)>Math.abs(k.get(p-1)-n)){
            System.out.println(k.get(p-1));
        }
        else{
            System.out.println(k.get(p-2)+" "+k.get(p-1));
        }
    }
}