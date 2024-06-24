import java.util.LinkedList;

public class removeLast {
    public static void main(String args[])
{
    LinkedList<String> vegetables=new LinkedList<>();
    vegetables.add("Carrot");
    vegetables.add("BeetRoot");
    vegetables.add("Pumpkin");
    vegetables.removeLast();
    
    System.out.println(vegetables);
    
}
}
