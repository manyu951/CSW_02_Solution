/*WAP to check number is number from user find 
 * out whether it is a Neon number or not .
 * Example : Neon number = 9 and 9^2=81 
 * sum = 8+1 */

public class Q_04 {
    private static boolean neon(int num){
    	int sum = 0 ;
    	double square = Math.pow(num, 2) ;
    	double temp = 0 ;
    	double real = square;
    	int count = 0 ;
    	while(real > 0) {
    		real = real/10 ;    
    		count++; 
    	}
    	for(int i = 0 ; i < count ; i++) {
    		temp = square%10;
    		sum += temp;
    		
    		square = square/10;
    	}
    	if(sum == num) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		int num = 9 ;
		System.out.println("Is neon number " + neon(num));
	}
}