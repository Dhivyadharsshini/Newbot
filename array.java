import java.util.*;
public class array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;

        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum:"sum);
    }
}

output:
    3
    1
    2
    3
   Sum:6
