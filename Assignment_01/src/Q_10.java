/*WAP to multiplication of two matrix */
import java.util.Arrays;
public class Q_10 {
	private static int[][] matrixMulti(int arr[][],int arr2[][],int row,int col) {
		int tempArr[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				for(int k=0; k<row; k++) {
					tempArr[i][j] += (arr[i][k]*arr2[k][j]);
				}
			}
		}
		return tempArr;
	}
	public static void main(String[]  args){
		int arr[][] = {{3,2,1},
				        {1,4,1},
				        {5,3,1}};
		int arr2[][] = {{0,0,0},
				        {0,1,1},
				        {0,1,1}};
		System.out.println("Original array = " + Arrays.deepToString(arr));
		System.out.println("Original array = " + Arrays.deepToString(arr2));
		System.out.println("Sum of array = " + Arrays.deepToString(matrixMulti(arr,arr2,3,3)));
	}
}
