/*WAP for GCD of 2 using recursion */
public class Q_13 {
	private static int GCD(int num, int num_2) {
		if(num_2 != 0) {
			return GCD(num_2, num%num_2);
			//num%num_2 it update the value in perimeter
			//12%11 the GCD(12,1) 
		}
		else {
			return num;
		}
	}
	public static void main(String[]  args){
		int num = 18;
		int num_2 = 14; 
		int ans = GCD(num,num_2);
		System.out.println("GCD of " + num + " and " + num_2 +" is " + ans);
	}
}