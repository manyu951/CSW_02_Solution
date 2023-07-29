/*WAP to check number is number from user find 
 * out whether it is a spy number or not .
 * Example : Spy number = 1124 and sum = 1+1+2+4 = 1124
 * multiplication = 1*1*2*4= 1124 */

public class Q_03 {
    private static boolean spy(int num){
    	int sum = 0 ;
    	int multi = 1 ;
    	int temp = num ;
    	int real = num;
    	int count = 0 ;
    	while(real > 0) {
    		real = real/10 ;    
    		count++; 
    	}
    	for(int i = 0 ; i < count ; i++) {
    		temp = num%10;
    		sum += temp;
    		multi *= temp;
    		num = num/10;
    	}
    	if(sum == multi) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		int num = 1124;
		System.out.println("Is spy number " + spy(num));
	}
}