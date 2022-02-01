package problems;

public class Digitcount {
	 public static void main(String[] args) {
		 int n = 12;	
		 int k= 1;
		 int value;
		 int count= 0;
		 
		 int arr[] = new int[n];
	      for(int i=1; i<n;i++){
	          arr[i] = i;
	          int number = arr[i];
	          while(number>0){
	       	  value=   number % 10;
	          number = number / 10;  
	  if (number == k || value ==k)
	  {
		  count++;
	  }
	          }
	          
  }
	      System.out.print(count);
}
}
