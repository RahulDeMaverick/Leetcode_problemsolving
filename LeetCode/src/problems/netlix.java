package problems;

public class netlix {
	
	 public static void main(String[] args) {
			
		 int [] a = {4,50,100,65,2000,700,1,10};
		 int numOddZeros = 0;
			
			for (int i = 0; i < a.length; i++) {
				String intString = new Integer(a[i]).toString();
				
				int numZeros = 0;
				for (int j = 0; j < intString.length(); j++) {
					if (intString.charAt(j) == '0')
						numZeros++;
				}
				
				if (numZeros % 2 == 1)
					numOddZeros++;
			}
			
			System.out.print(numOddZeros);
	 }

}
