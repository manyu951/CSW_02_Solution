/*Write a java program to evaluate a postfix expression using Stack.*/
import java.util.Stack;
public class Q_2A_04 {
	private static int postfix(char[] arr){
		Stack<Integer> store = new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			//It check the is digit on arr[i]
			if(Character.isDigit(arr[i])) {
				store.push((int)arr[i]);
			}
			else {
				int pop1 = store.pop();
				int pop2 = store.pop();
				switch(arr[i]) {
				    case '+' : store.push(pop2+pop1);break;
				    case '-' : store.push(pop2-pop1);break;
				    case '*' : store.push(pop2*pop1);break;
				    case '/' : store.push(pop2/pop1);
				}
			}
		}
		return store.pop();
	}
	public static void main(String[] args) {
		// Digit value must between 0 to 9 or -9 to 0
		char arr[] = {'5','6','2','+','*','1','2','4','/','-'};
		System.out.println(postfix(arr));
	}
}
