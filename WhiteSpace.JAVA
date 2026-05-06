public class Main
{
	public static void main(String[] args) {
	    String input="Hello World";
	    StringBuilder k=new StringBuilder();
	    for(char i:input.toCharArray()){
	        if(!Character.isWhitespace(i)){
	            k.append(i);
	        }
	    }
		String j=k.toString();
		System.out.println(j);
	}
}
