import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();            //9,9,8,7
        }
        int count =0;
        for(int i =0;i<n;i++){
            for(int j =1;i<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                   
                }
                
                
                
            }
        }
        
    }
}
