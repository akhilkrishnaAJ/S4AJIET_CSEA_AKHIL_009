public class Main
{
	public static void main(String[] args) {
		int n=6754;
		int rev=0;
		while(n!=0){
		    int l=n%10;
		    rev=rev*10+l;
		    n=n/10;
		}
		System.out.println(rev);
	}
}
