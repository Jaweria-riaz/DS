package Practice2;
import java.util.LinkedList;
public class LnkedList {
    public static void main (String []args){
        LinkedList<Integer>list=new LinkedList<>();

        list.add(9);
        list.add(2);
        list.add(5);


        System.out.println("linked list"+list);


        list.add(2,8);
        System.out.println("After adding 25 at index 2: " + list);


        list.remove(2);
        System.out.println("removed " + list);

        list.addLast(12);
        System.out.println("Added" + list);


    }
}
