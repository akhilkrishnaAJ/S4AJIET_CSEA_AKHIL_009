import java.util.Scanner;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args){
	    HashMap<Character,Integer>k=new HashMap<>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String s=sc.nextLine();
	    for(char c:s.toCharArray()){
	        if(k.containsKey(c)){
	            k.put(c,k.get(c)+1);
	        }else{
	            k.put(c,1);
	        }
	    }
	    System.out.println(k);
	    for(char d: k.keySet()){
	        //System.out.println(d);
	        if(k.get(d)>1){
	            System.out.println(d+"-"+k.get(d));
	        }
	    }
	    
	}
}
