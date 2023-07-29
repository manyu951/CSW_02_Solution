/*WAP to enter 2 number from user . Find the 
 * out the prime number between that array. */
import java.util.ArrayList;
public class Q_05 {
	private static ArrayList<Integer> prime(int num, int num2) {
		int max = 0 ;
		int min = 0 ;
		if(num > num2) {
			max = num;
			min = num2;
		}
		else {
			max = num2 ;
			min = num;
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count = 0 ;
		for(int i = min ; i < max ; i++) {
			for(int j = 2 ; j < i; j++) {
				if(i%j == 0){
					count++;
				} 
			}
			if(count == 0) {
				arr.add(i);
			}
			count = 0 ;
		}
		return arr;
	}
	public static void main(String[]  args){
		int num = 10 ;
		int num2 = 20 ;
		System.out.println(prime(num,num2));
	}
}
