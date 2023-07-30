/*Given an array containing 0s, 1s and 2s. Write an algorithms to sort array
so that 0s come first followed by 1s and then 2s in the end.
Example:
Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}*/
import java.util.ArrayList;
public class Q_02 {
	private static ArrayList<Integer> Short(ArrayList<Integer> arr){
		ArrayList<Integer> temp = new ArrayList<Integer>(arr.size());
		int count = 0;
		for(int i=0;i<arr.size();i++) {
			temp.add(0);
			if(arr.get(i)==0) {
				count++;
			}
		}
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==1) {
				temp.set(count++, 1);
			}
		}
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==2) {
				temp.set(count++, 2);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(0);
		arr.add(0);
		arr.add(2);
		arr.add(2);
		System.out.println(Short(arr));
	}
}