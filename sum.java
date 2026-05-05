class Solution {
public:
    int getSum(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
     return a;   
    }
};


//LEETCODE
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
    
