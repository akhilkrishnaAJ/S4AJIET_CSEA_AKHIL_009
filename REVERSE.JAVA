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

\\LEETCODE
class Solution {
    public int reverse(int x) {
		int rev=0;
		while(x!=0){
		    int l=x%10;

            if(rev>Integer.MAX_VALUE/10 ||rev<Integer.MIN_VALUE/10 ){
                return 0;
            }

            
		    rev=rev*10+l;
		    x=x/10;
		}
		return rev;
	}
}   
    
