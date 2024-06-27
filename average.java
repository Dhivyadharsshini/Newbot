import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int sum=n1+n2+n3+n4+n5;
        System.out.println(sum);
        int ave=sum/5;
        System.out.println(ave);
    }
}
