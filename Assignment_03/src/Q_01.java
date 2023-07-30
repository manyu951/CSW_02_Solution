/*Given an array containing 0s and 1s. Write an algorithms to sort array
so that 0s come first followed by 1s. Also find the minimum number of
swaps required to sort the array.
Example :
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] */
import java.util.ArrayList;
public class Q_01 {
	private static ArrayList<Integer> Short(ArrayList<Integer> arr){
		ArrayList<Integer> temp = new ArrayList<Integer>(arr.size());
		int tail = arr.size()-1;
		for(int i=0;i<arr.size();i++) {
			temp.add(0);
		}
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==1) {
				temp.set(tail--, 1);
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
		arr.add(1);
		arr.add(0);
		System.out.println(Short(arr));

	}

}
