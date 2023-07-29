/*WAP to insert element at specific position
 * into an array */

import java.util.Arrays;
public class Q_07 {
	private static int[] deletion(int arr[],int position) {
		int tempArr[] = new int[arr.length-1];
		int temp = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i< position-1) {
				tempArr[i] = arr[i];
			}
			else if(i==position-1) {
				continue;
			}
			else {
				tempArr[i-1] = arr[i];
			}
		}
		return tempArr;
	}
	public static void main(String[]  args){
		int arr[] = { 10,45};
		int position = 2 ;
		System.out.println("Update Array = " + Arrays.toString(deletion(arr,position)));
	}
}