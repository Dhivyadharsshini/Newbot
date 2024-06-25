import java.util.LinkedList;

public class set {
    public static void main(String args[])
{
    LinkedList<String> fruits =new LinkedList<>();
    fruits.add("strawberry");
    fruits.add("papaya");
    fruits.add("orange");
    fruits.add("banana");
    fruits.set(2,"apple");
    System.out.println(fruits);
    
}
}

output:
[strawberry,papaya,apple,banana]
