/*Write a java program to convert a decimal to binary equivalent using
stack(Stack collection).*/
import java.util.Scanner;
import java.util.Stack;
public class Q_2A_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> binary = new Stack<Integer>();
		System.out.println("Enter the number for binary :");
		int num = sc.nextInt();
		System.out.print("Binary of " + num + " is ");
		while(num != 0) {
			int temp = num%2;
			binary.push(temp);
			num /= 2;
		}
		while(!binary.empty()) {
			System.out.print(binary.pop() + " ");
		}
		
	}
}
