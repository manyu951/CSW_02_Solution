/*WAP for factorial using recursion */
public class Q_12 {
	private static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
	public static void main(String[]  args){
		int fac = 6;
		int ans = factorial(fac);
		System.out.println("Factorial of " + fac + " is = " +ans);
	}
}