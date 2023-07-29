/*WAP for fibonacci series using recursion 
 * Example : 1, 1, 2, 3, 5, 8, etc.*/
import java.util.Arrays;
public class Q_14 {
	private static int fibonacci(int num) {
		if(num == 0 ) {
			 return 0;
		}
		else if(num==1) {
			return 1;
		}
		else {
			//Itn is finding the value of fab of num-2 and
			//num-1 then add both then return the value
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
	public static void main(String[]  args){
		int num = 6;
		int ans[] = new int[num];
		while(num != 0) {
			ans[num-1] = fibonacci(num);
			num--;
		}
		System.out.println("Fibonacci is " + Arrays.toString(ans));
	}
}