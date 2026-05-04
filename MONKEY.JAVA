public class Main
{
	public static void main(String[] args) {
	   int i,c,d;
	   int n=20;
	   int k=2;
	   int j=3;
	   int m=13;
	   int p=13;
	   int a=m%k;
	   int b=p%j;
	   if(a!=0||b!=0){
	        c=m/k;
	        d=p/j;
	       i=n-(c+d);
	   }else{
	        c=m/k;
	        d=p/j;
	       i=n-(c+d);
	     
	   }
		System.out.println("monkey left on tree:"+i);
	}
}
