/*WAP to check number is an Armstrong number
 * Armstrong number because 3^3 + 7^3 + 1^3 = 371 */

public class Q_02 {
    private static boolean armstrong(int num){
    	int real = num ;
    	int match = num;
    	int count = 0 ;
    	while(real > 0) {
    		real = real/10 ;    
    		count++; 
    	}
    	double ans = 0 ;
    	double temp = 0 ;
    	for(int i = 0 ; i < count ; i++) {
    		temp = num%10;
    		ans += Math.pow(temp, 3);
    		num = num/10;
    	}
    	if(match == ans) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		int num = 371;
		System.out.println("Is armstrong number " + armstrong(num));
	}
}