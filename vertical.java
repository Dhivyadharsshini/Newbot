import java.util.LinkedList;
import java.util.ArrayList;
public class vertical{
    public static void main(String args[]){
        LinkedList<Integer> num = new LinkedList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num2.addAll(num.reversed());
        for(int i =0;i<num2.size();i++){
            System.out.println(num2.get(i));
        }

    }
}