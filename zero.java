import java.util.*;
import java.io.*;
class Demo {
  String name;
  int marks;
  Demo(){
    name="Dhivya";
    marks=99;
  }
void display(){
    System.out.println(name);
    System.out.println(marks);
}
}
public class zero{
    public static void main(String args[]){
        Demo d=new Demo();
        d.display();
    }
}
output:
   Dhivya 
     99


