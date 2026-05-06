import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String>list=new ArrayList<>();
	    list.add("Java");
	    list.add("Python");
	    list.add("Java");
	      System.out.println(list);
	    list.add(0,"salim");
	     System.out.println(list);
	    list.set(1,"ADA");
	    System.out.println(list);
	    list.remove(2);
	    System.out.println(list.size());
	    System.out.println(list.get(0));
	}
}
