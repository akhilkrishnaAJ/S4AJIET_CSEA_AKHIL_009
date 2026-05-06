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
