/*WAP for binary search using recursion */
public class Q_11 {
	private static int binarySearch(int[] arr,int low,int high,int search) {
		if(high >= low) {
			int mid = ((low+high)/2);
			if(arr[mid] == search) {
				return search;
			}
			if(arr[mid] < search) {
				//here it start seaching value again for line 04
				//but we update the value in place of low searching
				//start from (mid+1) and goes upto high
				return binarySearch(arr,mid+1,high,search);
			}
			else {
				//we update the value in place of high (mid-1)
				return binarySearch(arr,low,mid-1,search);
			}
		}
		return -1;
	}
		
	public static void main(String[]  args){
		//For binary search array must in assending order
		int arr[] = {10,20,30,40,50,60,70,80};
		int search = 21;
		int low = 0;// low = 0
		int high = arr.length-1;//high=index 7
		int ans = binarySearch(arr,low,high,search);
		if(ans == search) {
			System.out.println(search + " is present in Array");
		}
		else {
			System.out.println(search + " is NOT present in Array");
		}
	}
}