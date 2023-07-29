/*WAP given a N size of array contanning 
 * Example :  int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
 * Output is :- 7 */
public class Q_16 {
	private static int sumContiguous(int arr[]) {
		int max = arr[0];
	    int current_max = arr[0];
//	    for(int i=1;i<arr.length;i++){
//	    	if(arr[i] >= 0) {
//		    	current_max += arr[i];
//		    	if(current_max > max) {
//		    		max = current_max;
//		    	}
//	    	}
//	    	if(arr[i] < 0) {
//	    		current_max = 0;
//	    	}
//	    }
	    for(int i=1;i<arr.length;i++) {
	    	current_max = Math.max(arr[i],current_max+arr[i]);
	        max = Math.max(max,current_max);
	    }
	    return max;
	}
	public static void main(String[]  args){
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		int ans = sumContiguous(arr);
		
		System.out.println("Max Contiguous is " + ans);
	}
}
