import java.util.*;
public class Abc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int s=0;
        ArrayList <Integer> k=new ArrayList <>();
        for(int i=0;i<x;i++){
            int p=sc.nextInt();
            s+=p;
            k.add(p);
        }
        System.out.println(s);
    }
}