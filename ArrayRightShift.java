package org.hrmx.newjp;

public class ArrayRightShift {

	public static void main(String[] args) {

		try {

			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int n = arr.length;

			int last = arr[n - 1];

			for (int i = n - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}

			arr[0] = last;

			System.out.println("Array after right shift: ");
			for (int num : arr) {
				System.out.print(num + " ");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

//Explanation:
//Store the last element since it will be moved to the first position.
//We start from the end of the array and move each element one position to the right.
//The stored last element is placed at the beginning.