import java.util.*;
public class prime {
    
    public static  boolean isPrime(int n){
        if(n<=1){
            return false;
        }
    
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
                
            }
        }
        return true;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    }

output:
Enter the value:35
2 3 5 7 11 13 17 19 23 29 31 
