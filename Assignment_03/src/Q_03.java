/*Write a program to find minimum swaps required to bring all elements
less than given value together at the start of array.
Example:
Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
Output: 1*/
import java.util.ArrayList;
public class Q_03 {
	private static void Short(ArrayList<Integer> arr,int k){
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)<=k) {
				
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(2);
		arr.add(1);
		arr.add(5);
		arr.add(6);
		arr.add(3);
		int k = 3;
		Short(arr,k);
	}
}