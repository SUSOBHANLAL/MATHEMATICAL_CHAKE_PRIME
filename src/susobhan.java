
public class susobhan {
	public static void main(String args[] ){
		
	 int n = 90;
	 for(int i =0;i<n;i++) {
		 if(isprime(i)==true) {
			 System.out.print(i+"    ");
		 }
	 }
		
	}
	
	
	static boolean isprime(int n ) {
		
		if(n<=0) {
			return false;
		}
		else if(n==1) {
			return false;
		}
		
		else if(n ==2) {
			return true;
			
		}
		
		else if(n %2 == 0) {
			return false;
		}
		
		else {
			for(int i=3;i<n-1;i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
