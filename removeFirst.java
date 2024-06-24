import java.util.LinkedList;

public class removeFirst {public static void main(String args[])
{
    LinkedList<String> icecream=new LinkedList<>();
    icecream.add("Vannila");
    icecream.add("Chocolate");
    icecream.add("ButterScotch");
    icecream.removeFirst();
    
    System.out.println(icecream);
    
}
}

output:
[Chocolate,ButterScotch]
