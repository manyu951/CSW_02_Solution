/*WAP to take array and seprate even 
 * and odd element of array */

import java.util.Arrays;
public class Q_08 {
	private static int[] even(int arr[]) {
		int count = 0 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				count++;
			}
		}
		int tempArr[] = new int[count];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				tempArr[count++] = arr[i];
			}
		}
		
		return tempArr;
	}
	private static int[] odd(int arr[]) {
		int count = 0 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 1) {
				count++;
			}
		}
		int tempArr[] = new int[count];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 1) {
				tempArr[count++] = arr[i];
			}
		}
		
		return tempArr;
	}
	public static void main(String[]  args){
		int arr[] = { 10,45,80,99,100,7895,1202};
		System.out.println("Original array = " + Arrays.toString(arr));
		System.out.println("Even array = " + Arrays.toString(even(arr)));
		System.out.println("Odd array = " + Arrays.toString(odd(arr)));
	}
}