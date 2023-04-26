import java.util.*;
public class Aaa{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n%5==0){
            n=n/5;
        }
        while(n%3==0){
            n=n/3;
        }
        while (n%2==0){
            n/=2;
        }
        if(n==1){
            System.out.println("Ugly Number");
        }
        else{
            System.out.println("Not Ugly Number");
        }
    }
}