
    import java.util.*;
public class replace{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String:");
     String str=sc.nextLine();
     String str1=str.replaceAll("[AEIOUaeiou]"," ");
     System.out.println(str1);
}
}

output:
Enter the String:Dhivya
Dh vy
