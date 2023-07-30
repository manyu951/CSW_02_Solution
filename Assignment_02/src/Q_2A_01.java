/*Write a program to create an ArrayList of Integer type and perform
the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from an asked position.
(d.) Add a condition to check the ArrayList is empty or not*/

import java.util.ArrayList;
import java.util.Scanner;
public class Q_2A_01 {
//	static int  search(int n) {
//		return listsearch.indexOf(n);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		System.out.println("Enter number for search :");
		int num = sc.nextInt();
		if(arr.indexOf(num) >=0) {
			// arr.indexOf(num) this is returning index value of if number
			// is present in ArrayList.
			System.out.println("Element is present at index " + arr.indexOf(num));
		}
		else {
			System.out.println("Number is not present in array");
		}
		System.out.println("Enter position do want to delete  :");
		int pos = sc.nextInt();
		arr.remove(pos);
		System.out.println(arr);
		if(arr.size()>0) {
			System.out.println("ArrayList is not empty");
		}
		else {
			System.out.println("ArrayList is Empty");
		}
	}
}
