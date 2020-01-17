import java.util.*;
public class Student extends Person{
  public static void main(String[] args) {
    LinkedList<String> obj=new LinkedList<String>();
    System.out.println("Student:"+obj.add("18SW40"));
    System.out.println("Size:"+obj.size());
    System.out.println("Roll no:"+obj.getFirst());
    System.out.println("Last:"+obj.getLast());
    System.out.println(" "+obj.peek());
    System.out.println(" "+obj.peekLast());
    System.out.println(" "+obj.offerFirst("Unza"));
    System.out.println(" "+obj.offerLast("Software"));
    System.out.println(" "+obj.poll());
    System.out.println(" "+obj.pollLast());

    
  }
}