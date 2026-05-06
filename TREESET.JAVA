import java.util.TreeSet;
import java.util.Collections;
public class Main
{
	public static void main(String[] args){
	    TreeSet<Integer>list=new TreeSet<>();
	    list.add(10);
	    list.add(5);
	    list.add(10);
	    list.add(20);
	    System.out.println(list);
	    System.out.println(list.contains(3));
	    list.remove(5);
	    System.out.println(list);
	    System.out.println(list.size());
	    list.clear();
	    System.out.println(list);
	}
}
