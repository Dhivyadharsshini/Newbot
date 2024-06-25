import java.util.LinkedList;

public class remove {
    public static void main(String args[])
{
    LinkedList<String> bikes=new LinkedList<>();
    bikes.add("Pulsar");
    bikes.add("Rx100");
    bikes.add("Enfield");
    bikes.add("Rx100");
    bikes.removeFirstOccurrence("Rx100");
    System.out.println(bikes);

}
}

output:
[Pulsar,Enfield,Rx100]
