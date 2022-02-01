package problems;

public class fibb {
	 public static void main(String[] args) {
		 int x = 1221;
	       int n;
	        int sum=0;
	        int r;
	        n = x;
	        while(n>0){
	            r = n%10;
	            sum=(sum*10)+r;
	            n/=10;
	        }
            if(sum == x) {
            	System.out.print("no is fib");
            }
            else {
            	System.out.print("not fib");
            }
}
}