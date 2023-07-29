/*WAP to insert element at specific position
 * into an array */
import java.util.Arrays;
public class Q_06 {
	private static int[] insert(int arr[],int position,int num) {
		int tempArr[] = new int[arr.length+1];
		int temp = 0 ;
		for(int i = 0 ; i < tempArr.length-1 ; i++) {
			if(i< position-1) {
				tempArr[i] = arr[i];
			}
			else if(i==position-1) {
				temp = arr[i];
				tempArr[i] = num;
				tempArr[i+1] = temp;
			}
			else {
				tempArr[i+1] = arr[i];
			}
		}
		if(arr.length==1) {
			tempArr[position-1] = num;
		}
		return tempArr;
	}
	public static void main(String[]  args){
		int arr[] = { 10 ,100,565,41};
		int position = 1 ;
		int insert = 100;
		System.out.println("Updated Array is " + Arrays.toString(insert(arr,position,insert)));
	}
}
