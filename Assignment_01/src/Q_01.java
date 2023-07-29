/*Find element in array*/
public class Q_01 {
	public static boolean search(int arr[], int find) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == find) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,80,45,66,70,82,96};
		int find = 21;
		System.out.println(find + " is present " + search(arr,find));

	}
}
