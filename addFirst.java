import java.util.LinkedList;

public class addFirst {

    public static void main(String args[])
    {
        LinkedList<String> colors=new LinkedList<>();
        colors.add("Black");
        colors.add("Red");
        colors.addFirst("Blue");
        
        System.out.println(colors);

    }
}





Output
    [Blue,Black,Red]
