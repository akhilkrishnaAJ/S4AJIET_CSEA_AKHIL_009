//JAVA HASHMAPS

import java.util.HashMap;
public class Main
{
	public static void main(String[] args){
	    HashMap<Integer,String>m=new HashMap<>();
	    m.put(101,"akhil");
	    m.put(102,"krishna");
	    System.out.println(m);
	    System.out.println(m.get(101));
	     System.out.println(m.remove(101));
	    System.out.println(m);
	    m.clear();
	    System.out.println(m);
	}
}

//TREEMAP
import java.util.TreeMap;
public class Main
{
	public static void main(String[] args){
	    TreeMap<Integer,String>m=new TreeMap<>();
	    m.put(101,"akhil");
	    m.put(102,"krishna");
	    System.out.println(m);
	    System.out.println(m.get(101));
	     System.out.println(m.remove(101));
	    System.out.println(m);
	    System.out.println(m.size());
	    m.clear();
	    System.out.println(m);
	}
}

//LINKEDHASHMAP
import java.util.LinkedHashMap;
public class Main
{
	public static void main(String[] args){
	    LinkedHashMap<Integer,String>m=new LinkedHashMap<>();
	    m.put(101,"akhil");
	    m.put(102,"krishna");
	    System.out.println(m);
	    System.out.println(m.get(101));
	     System.out.println(m.remove(101));
	    System.out.println(m);
	    System.out.println(m.size());
	    m.clear();
	    System.out.println(m);
	}
}
