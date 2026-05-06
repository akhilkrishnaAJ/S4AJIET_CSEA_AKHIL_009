import java.util.LinkedList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer>cse=new LinkedList<>();
	    cse.add(10);
	    cse.add(10);
	    cse.addFirst(5);
        System.out.println(cse);
        cse.addLast(20);
        System.out.println(cse);
	    System.out.println(cse.getFirst());
	    System.out.println(cse.getLast());
	    Collections.sort(cse);
	    System.out.println("sort"+cse);
        Collections.sort(cse,Collections.reverseOrder());	 
	    System.out.println("RevSort"+cse);
	    cse.removeFirst();
	    System.out.println(cse);
	    cse.removeLast();
	    System.out.println(cse);
	}
}
