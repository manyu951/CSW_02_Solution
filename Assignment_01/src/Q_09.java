/*WAP to sum of two matrix */
import java.util.Arrays;
public class Q_09 {
	private static int[][] matrixSum(int arr[][],int arr2[][],int row,int col) {
		int tempArr[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				tempArr[i][j] = arr[i][j]+ arr2[i][j];
			}
		}
		return tempArr;
	}
	public static void main(String[]  args){
		int arr[][] = {{1,2},
				        {3,4}};
		int arr2[][] = {{1,2},
				        {3,4}};
		System.out.println("Original array = " + Arrays.deepToString(arr));
		System.out.println("Original array = " + Arrays.deepToString(arr2));
		System.out.println("Sum of array = " + Arrays.deepToString(matrixSum(arr,arr2,2,2)));
	}
}